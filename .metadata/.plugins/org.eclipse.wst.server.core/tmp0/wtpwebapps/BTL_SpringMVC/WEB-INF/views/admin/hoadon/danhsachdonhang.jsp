<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<div class="card">
	<div class="card-header border-transparent">
		<h3 class="card-title">Danh sách đơn hàng</h3>
		<div align="right">
			<form action="<c:url value='/admin/danh-sach-don-hang/loc'/>" method="post">
				<select name="option">
					<option value="TatCa">Tất cả</option>
					<option value="ChoXacNhan">Chờ xác nhận</option>
					<option value="XacNhan">Xác nhận</option>
					<option value="Huy">Hủy</option>
				</select>
				<button type="submit" class="site-btn">Lọc</button>
			</form>
		</div>
	</div>
	<!-- /.card-header -->
	<div class="card-body p-0">
		<div class="table-responsive">
			<table class="table m-0">
				<thead>
					<tr>
						<th>Mã đơn hàng</th>
						<th>Ngày đặt</th>
						<th>Trạng thái</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${DanhSachHoaDon }">
						<tr>
							<td><a
								href="<c:url value='/admin/chi-tiet-don-hang/${item.maHoaDon }'/>">${item.maHoaDon }</a></td>
							<td>${item.ngayLapHoaDon }</td>
							<td>${item.trangThai }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<!-- /.table-responsive -->
	</div>
</div>