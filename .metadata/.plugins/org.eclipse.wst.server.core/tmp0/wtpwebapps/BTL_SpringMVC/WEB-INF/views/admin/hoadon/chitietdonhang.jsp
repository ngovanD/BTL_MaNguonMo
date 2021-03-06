<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>


<!-- Checkout Section Begin -->
<section class="checkout spad">
	<div class="container">
		<div class="checkout__form">
			<h4>Thông tin thanh toán</h4>
			<form:form action="dat-hang/xac-nhan" class="form-pay"
				modelAttribute="thongTinKhachHangDat">
				<div class="row">
					<div class="col-lg-8 col-md-6">
						<div class="checkout__input">
							<p style="font-size: 16px;">
								Mã hóa đơn:<span> ${HoaDon.maHoaDon }</span>
							</p>
						</div>
						<div class="checkout__input">
							<p style="font-size: 16px;">
								Ngày lập:<span> ${HoaDon.ngayLapHoaDon }</span>
							</p>
						</div>
						<div class="checkout__input">
							<p style="font-size: 16px;">
								Trạng thái:<span> ${HoaDon.trangThai }</span>
							</p>
						</div>
						<div class="checkout__input">
							<p style="font-size: 16px;">
								Họ tên:<span> ${ThongTinKhachHangDat.hoTen }</span>
							</p>
						</div>
						<div class="checkout__input">
							<p style="font-size: 16px;">
								Địa chỉ:<span> ${ThongTinKhachHangDat.diaChi }</span>
							</p>
						</div>
						<div class="checkout__input">
							<p style="font-size: 16px;">
								Số điện thoại:<span> ${ThongTinKhachHangDat.soDienThoai }</span>
							</p>
						</div>
					</div>
				</div>
			</form:form>
			<h4 align="center">DANH SÁCH SẢN PHẨM</h4>
			<div class="shoping__cart__table">
				<div class="table-responsive">
					<table class="table m-0">
						<thead>
							<tr>
								<th>Sản phẩm</th>
								<th>Giá</th>
								<th>Số lượng</th>
								<th>Thành tiền</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="item" items="${DongHoaDon }">
								<tr>
									<td>${item.sanPham.sanPham.tenSanPham}</td>
									<td>${item.sanPham.sanPham.gia}</td>
									<td>${item.soLuong}</td>
									<td>${item.sanPham.sanPham.gia*item.soLuong}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>

			<br /> <br />
			<div class="checkout__input">
				<p style="font-size: 20px;">Tổng tiền hóa đơn:
					${HoaDon.tongTien } VND</p>
			</div>

		</div>
		
		<a class="btn btn-info btn-sm"
			href="<c:url value='/admin/chi-tiet-don-hang/${ HoaDon.maHoaDon}/xac-nhan'/>">
			<i class="fas fa-pencil-alt"> </i> Xác nhận
		</a>  <a class="btn btn-danger btn-sm"
			href="<c:url value='/admin/chi-tiet-don-hang/${ HoaDon.maHoaDon}/huy'/>">
			<i class="fas fa-trash"> </i> Hủy
		</a> 
	</div>
</section>
<!-- Checkout Section End -->