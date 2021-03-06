<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
    
<!-- Shoping Cart Section Begin -->
    <section class="shoping-cart spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="shoping__cart__table">
                        <table>
                            <thead>
                                <tr>
                                    <th class="shoping__product">Sản phẩm</th>
                                    <th>Giá</th>
                                    <th>Số lượng</th>
                                    <th>Tổng tiền</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                            	<c:forEach var="item" items="${GioHang }">
                            	 	 <tr>
	                                    <td class="shoping__cart__item">
	                                        <img src="<c:url value='/assets/user/img/sanpham/${item.value.sanPham.sanPham.hinhAnh }'/>" width="50px" alt="">
	                                        <h5>${item.value.sanPham.sanPham.tenSanPham}</h5>
	                                    </td>
	                                    <td class="shoping__cart__price">
	                                        ${item.value.sanPham.sanPham.gia}
	                                    </td>
	                                    <td class="shoping__cart__quantity">
	                                        <div class="quantity">
	                                            <div class="pro-qty">
	                                            	<a href="<c:url value='/BotSanPham/${item.value.sanPham.sanPham.maSanPham }'/>" class="dec qtybtn">-</a>
	                                                <input type="text" value="${item.value.soLuong}">
	                                              	<a href="<c:url value='/ThemSanPham/${item.value.sanPham.sanPham.maSanPham }'/>" class="dec qtybtn">+</a>
	                                            </div>
	                                        </div>
	                                    </td>
	                                    <td class="shoping__cart__total">
	                                        ${item.value.sanPham.sanPham.gia*item.value.soLuong}
	                                    </td>
	                                    <td class="shoping__cart__item__close">
	                                        <a href="<c:url value='/XoaSanPham/${item.value.sanPham.sanPham.maSanPham }'/>" class="icon_close" style="font-size: 30px"></a>
	                                    </td>
	                                </tr>
                            	</c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <div class="shoping__cart__btns">
                        <a href="<c:url value='trang-chu'/>" class="primary-btn cart-btn">Tiếp tục mua</a>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="shoping__continue">
                        <div class="shoping__discount">
                            <h5>Mã giảm giá</h5>
                            <form action="#">
                                <input type="text" placeholder="Enter your coupon code">
                                <button type="submit" class="site-btn">Áp dụng</button>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="shoping__checkout">
                        <h5>Tổng tiền giỏ hàng</h5>
                        <ul>
                            <li>Tạm tính <span>${TongTienGioHang } VND</span></li>
                            <li>Giảm giá <span>0 VND</span></li>
                            <li>Tổng tiền <span>${TongTienGioHang } VND</span></li>
                        </ul>
                        <a href="<c:url value='dat-hang'/>" class="primary-btn">Thanh toán</a>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Shoping Cart Section End -->