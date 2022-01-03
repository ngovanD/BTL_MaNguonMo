<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<div class="card">
	<div class="card-header border-transparent">
		<h3 class="card-title">Danh sách slide-banner</h3>
		<div align="right">
			<a href="<c:url value='/admin/danh-sach-san-pham/them'/>">Thêm sản phẩm</a>
		</div>
	</div>
	<!-- /.card-header -->
	<div class="card-body p-0">
		<div class="table-responsive">
			<table class="table m-0">
				<thead>
					<tr>
						<th>Mã sản phẩm</th>
						<th>Tên sản phẩm</th>
						<th>Giá</th>
						<th>Hình ảnh</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${DanhSachSanPham }">
						<tr>
							<td><a
								href="<c:url value='chi-tiet-san-pham/${item.maSanPham }'/>">${item.maSanPham }</a></td>
							<td>${item.tenSanPham }</td>
							<td>${item.gia }</td>
							<td><img
								src="<c:url value='/assets/user/img/sanpham/${item.hinhAnh }'/>"
								height="50px" width="50px" alt=""></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<!-- /.table-responsive -->
	</div>
</div>
