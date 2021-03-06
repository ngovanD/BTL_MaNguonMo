<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<!-- Product Section Begin -->
    <section class="product spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-5">
                    <div class="sidebar">
                        <div class="sidebar__item">
                            <div class="latest-product__text">
                                 <h4>Sản phẩm mới</h4>
		                        <div class="latest-product__slider owl-carousel">
		                        	<c:set var="dem" scope = "session" value = "${1}"></c:set>
					            	<c:forEach var="item" items="${sanPhamMoi}">
					            		<c:if test="${dem%3 == 1}">
					            			 <div class="latest-prdouct__slider__item">
					            		</c:if>
							            	 <a href="<c:url value='/chi-tiet-san-pham/${item.maSanPham }'/>" class="latest-product__item">
			                                    <div class="latest-product__item__pic">
			                                        <img src="<c:url value='/assets/user/img/sanpham/${item.hinhAnh }'/>" alt="">
			                                    </div>
			                                    <div class="latest-product__item__text">
			                                        <h6>${ item.tenSanPham}</h6>
			                                        <span>${ item.gia} VND</span>
			                                    </div>
			                                </a>
										<c:if test="${dem%3 == 0}">
					            			 </div>
					            		</c:if>
					            		<c:set var="dem" scope = "session" value = "${dem + 1}"></c:set>
					                </c:forEach>
		                        </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-9 col-md-7">
                    <div class="filter__item">
                        <div class="row">
                            <div class="col-lg-4 col-md-5">
                                <div class="filter__sort">
                                    <span>Sort By</span>
                                    <select>
                                        <option value="0">Default</option>
                                        <option value="0">Default</option>
                                    </select>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-4">
                                <div class="filter__found">
                                    <h6><span>${tongSanPham }</span> sản phẩm</h6>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-3">
                                <div class="filter__option">
                                    <span class="icon_grid-2x2"></span>
                                    <span class="icon_ul"></span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                    	<c:forEach var="item" items="${tatCaSanPhamCungLoaiTrong1Trang }">
                    		<div class="col-lg-4 col-md-6 col-sm-6">
	                            <div class="product__item">
	                                <div class="product__item__pic set-bg" data-setbg="<c:url value='/assets/user/img/sanpham/${item.sanPham.hinhAnh }'/>">
	                                    <ul class="product__item__pic__hover">
	                                        <li><a href="<c:url value='/ThemSanPham/${item.sanPham.maSanPham }'/>"><i class="fa fa-shopping-cart"></i></a></li>
	                                    </ul>
	                                </div>
	                                <div class="product__item__text">
	                                    <h6><a href="<c:url value='/chi-tiet-san-pham/${item.sanPham.maSanPham }'/>">${item.sanPham.tenSanPham }</a></h6>
	                                    <h5>${item.sanPham.gia} VND</h5>
	                                </div>
	                            </div>
	                        </div>	
						</c:forEach>
                        
                    </div>
                    <div class="product__pagination">
                        <c:forEach var="item" begin="1" end="${paginateInfo.totalPage }" varStatus="loop">
							<c:if test="${loop.index == paginateInfo.currentPage }">
								<a style="background-color: red"
									href="<c:url value='/tat-ca-san-pham/${loop.index }'/>">${loop.index }</a>
							</c:if>
							<c:if test="${loop.index != paginateInfo.currentPage }">
								<a
									href="<c:url value='/tat-ca-san-pham/${loop.index }'/>">${loop.index }</a>
							</c:if>
						</c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Product Section End -->