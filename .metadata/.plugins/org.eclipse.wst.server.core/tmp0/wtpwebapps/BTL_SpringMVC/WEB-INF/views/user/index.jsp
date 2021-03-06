<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

     <!-- Slide banner-->
    <div class="slides">
        <div class="slide-banner">
            <div class="container-display-slides">
                <c:forEach var="item" items="${slides }" varStatus="index">
                    <c:if test="${index.first }">
                        <a class="item-slide active" href="google.com">
                    </c:if>
                    <c:if test="${not index.first }" >
                        <a class="item-slide" href="google.com">
                    </c:if>
                            <div class="content">${item.tenSlide} <br/> ${item.noiDung}</div>
                            <img src="<c:url value='/assets/user/img/banner/${item.hinhAnh }'/>">
                        </a>
                </c:forEach>
    
            </div>
            <div class="control-button">
                <button class="button-prev" onclick="plusDivs(-1)">&#10094;</button>
                <button class="button-next" onclick="plusDivs(1)">&#10095;</button>
            </div>
        </div>
    </div>
    <!-- Slide banner End -->

    <!-- Featured Section Begin -->
    <section class="featured spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="section-title">
                        <h2>Sản phẩm</h2>
                    </div>
                </div>
            </div>
            <div class="row featured__filter">
            	<c:set var="dem" scope = "session" value = "${1}"></c:set>
            	<c:forEach var="item" items="${sanPham}">
            		<c:if test="${dem <=8}">
		            	<div class="col-lg-3 col-md-4 col-sm-6 mix oranges fresh-meat">
		                    <div class="featured__item">
		                        <div class="featured__item__pic set-bg" data-setbg="<c:url value='/assets/user/img/sanpham/${item.hinhAnh }'/>">
		                            <ul class="featured__item__pic__hover">
		                                <li><a href="<c:url value='/ThemSanPham/${item.maSanPham }'/>"><i class="fa fa-shopping-cart"></i></a></li>
		                            </ul>
		                        </div>
		                        <div class="featured__item__text">
		                            <h6><a href="<c:url value='/chi-tiet-san-pham/${item.maSanPham }'/>">${item.tenSanPham }</a></h6>
		                            <h5>${item.gia } VND</h5>
		                        </div>
		                    </div>
		                </div>
			
						<c:set var="dem" scope = "session" value = "${dem + 1}"></c:set>
					</c:if>
                </c:forEach>
            </div>
        </div>
    </section>
    <!-- Featured Section End -->

    <!-- Banner Begin -->
    <div class="banner">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-6 col-sm-6">
                    <div class="banner__pic">
                        <img src="img/banner/banner-1.jpg" alt="">
                    </div>
                </div>
                <div class="col-lg-6 col-md-6 col-sm-6">
                    <div class="banner__pic">
                        <img src="img/banner/banner-2.jpg" alt="">
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Banner End -->

    <!-- Latest Product Section Begin -->
    <section class="latest-product spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-4 col-md-6">
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
                <div class="col-lg-4 col-md-6">
                    <div class="latest-product__text">
                        <h4>Sản phẩm nổi bật</h4>
                        <div class="latest-product__slider owl-carousel">
                        	<c:set var="dem" scope = "session" value = "${1}"></c:set>
			            	<c:forEach var="item" items="${sanPhamNoiBat}">
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
                <div class="col-lg-4 col-md-6">
                    <div class="latest-product__text">
                        <h4>Ngẫu nghiên</h4>
                        <div class="latest-product__slider owl-carousel">
                        	<c:set var="dem" scope = "session" value = "${1}"></c:set>
			            	<c:forEach var="item" items="${sanPhamNgauNghien}">
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
    </section>
    <!-- Latest Product Section End -->

    <!-- Blog Section Begin -->
    <section class="from-blog spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="section-title from-blog__title">
                        <h2>From The Blog</h2>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-4 col-md-4 col-sm-6">
                    <div class="blog__item">
                        <div class="blog__item__pic">
                            <img src="img/blog/blog-1.jpg" alt="">
                        </div>
                        <div class="blog__item__text">
                            <ul>
                                <li><i class="fa fa-calendar-o"></i> May 4,2019</li>
                                <li><i class="fa fa-comment-o"></i> 5</li>
                            </ul>
                            <h5><a href="#">Cooking tips make cooking simple</a></h5>
                            <p>Sed quia non numquam modi tempora indunt ut labore et dolore magnam aliquam quaerat </p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-6">
                    <div class="blog__item">
                        <div class="blog__item__pic">
                            <img src="img/blog/blog-2.jpg" alt="">
                        </div>
                        <div class="blog__item__text">
                            <ul>
                                <li><i class="fa fa-calendar-o"></i> May 4,2019</li>
                                <li><i class="fa fa-comment-o"></i> 5</li>
                            </ul>
                            <h5><a href="#">6 ways to prepare breakfast for 30</a></h5>
                            <p>Sed quia non numquam modi tempora indunt ut labore et dolore magnam aliquam quaerat </p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-6">
                    <div class="blog__item">
                        <div class="blog__item__pic">
                            <img src="img/blog/blog-3.jpg" alt="">
                        </div>
                        <div class="blog__item__text">
                            <ul>
                                <li><i class="fa fa-calendar-o"></i> May 4,2019</li>
                                <li><i class="fa fa-comment-o"></i> 5</li>
                            </ul>
                            <h5><a href="#">Visit the clean farm in the US</a></h5>
                            <p>Sed quia non numquam modi tempora indunt ut labore et dolore magnam aliquam quaerat </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>