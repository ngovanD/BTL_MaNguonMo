<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<!-- Checkout Section Begin -->
    <section class="checkout spad">
        <div class="container">
            <div class="checkout__form">
                <h4>Thông tin thanh toán</h4>
                <form:form action="dat-hang/xac-nhan" class="form-pay" modelAttribute="thongTinKhachHangDat">
                    <div class="row">
                        <div class="col-lg-8 col-md-6">
                            <div class="checkout__input">
                                <p>Họ tên:<span>*</span></p>
                                <form:input type="text" name="hoTen" id="hoTen" path="hoTen"  />
                            </div>
                            <div class="checkout__input">
                                <p>Địa chỉ:<span>*</span></p>
                                <form:input type="text" name="diaChi" id="diaChi" path="diaChi"  />
                            </div>
                            <div class="checkout__input">
                                <p>Số điện thoại:<span>*</span></p>
                                 <form:input type="text" name="hoTen" id="hoTen" path="soDienThoai"  />
                            </div>
                        </div>
                        <div class="col-lg-4 col-md-6">
                            <div class="checkout__order">
                                <h4>Đơn của bạn</h4>
                                <div class="checkout__order__products">Sản phẩm <span>Giá</span></div>
                                <ul>
                                	<c:forEach var="item" items="${GioHang }">
                                	 	<li>${item.value.sanPham.sanPham.tenSanPham} <span> ${item.value.sanPham.sanPham.gia*item.value.soLuong}</span></li>
                            		</c:forEach>
                                </ul>
                                <div class="checkout__order__subtotal">Tạm tính <span>${TongTienGioHang } VND</span></div>
                                <div class="checkout__order__subtotal">Giảm giá <span>0 VND</span></div>
                                <div class="checkout__order__total">Tổng tiền <span>${TongTienGioHang } VND</span></div>
                                <div class="checkout__input__checkbox">
                                    <label for="payment">
                                        Tiền mặt
                                        <input type="radio" id="payment" name="payment">
                                        <span class="checkmark"></span>
                                    </label>
                                </div>
                                <div class="checkout__input__checkbox">
                                    <label for="paypal">
                                        Momo
                                        <input type="radio" id="paypal" name="payment">
                                        <span class="checkmark"></span>
                                    </label>
                                </div>
                                <button type="submit" class="site-btn">Xác nhận</button>
                            </div>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </section>
    <!-- Checkout Section End -->