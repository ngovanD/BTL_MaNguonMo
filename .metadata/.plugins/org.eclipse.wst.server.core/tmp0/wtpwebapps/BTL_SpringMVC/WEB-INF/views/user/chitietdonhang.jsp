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
                                <p style="font-size: 20px;">Mã hóa đơn:<span>  ${HoaDon.maHoaDon }</span></p>
                            </div>
                            <div class="checkout__input">
                                <p style="font-size: 20px;">Ngày lập:<span>  ${HoaDon.ngayLapHoaDon }</span></p>
                            </div>
                            <div class="checkout__input">
                                <p style="font-size: 20px;">Trạng thái:<span>  ${HoaDon.trangThai }</span></p>
                            </div>
                            <div class="checkout__input">
                                <p style="font-size: 20px;">Họ tên:<span>  ${ThongTinKhachHangDat.hoTen }</span></p>
                            </div>
                            <div class="checkout__input">
                                <p style="font-size: 20px;">Địa chỉ:<span>  ${ThongTinKhachHangDat.diaChi }</span></p>
                            </div>
                            <div class="checkout__input">
                                <p style="font-size: 20px;">Số điện thoại:<span>  ${ThongTinKhachHangDat.soDienThoai }</span></p>
                            </div>
                        </div>         
                    </div>
                </form:form>
                <h4 align="center">DANH SÁCH SẢN PHẨM</h4>
                  <div class="shoping__cart__table">
                        <table>	
		                      <thead>
		                          <tr>
		                              <th >Sản phẩm</th>
		                              <th width="100px">Giá</th>
		                              <th>Số lượng</th>
		                              <th>Thành tiền</th>
		                          </tr>
		                      </thead>
		                      <tbody>
		                      	<c:forEach var="item" items="${DongHoaDon }">
		                      	 	 <tr>
		                               <td >
		                                   ${item.sanPham.sanPham.tenSanPham}
		                               </td>
		                               <td >
		                                   ${item.sanPham.sanPham.gia}
		                               </td>
		                               <td >
		                                   ${item.soLuong}
		                               </td>
		                               <td >
		                                   ${item.sanPham.sanPham.gia*item.soLuong}
		                               </td>
		                           </tr>
		                      	</c:forEach>
		                      </tbody>
                        </table>
                    </div>
                  
                  <br/>
                  <br/>
                  <div class="checkout__input">
                                 <p style="font-size: 20px; color: red"> Tổng tiền hóa đơn: ${HoaDon.tongTien } VND</p>
                  </div>
                 
            </div>
        </div>
    </section>
    <!-- Checkout Section End -->