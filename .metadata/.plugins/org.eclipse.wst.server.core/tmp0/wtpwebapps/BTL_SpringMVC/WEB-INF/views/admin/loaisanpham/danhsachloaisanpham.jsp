<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<div class="card">
	<div class="card-header border-transparent">
		<h3 class="card-title">Danh sách slide-banner</h3>
		<div align="right"><a href="<c:url value='/admin/danh-sach-loai-san-pham/them'/>">Thêm loại sản phẩm</a></div>
	</div>
	<!-- /.card-header -->
	<div class="card-body p-0">
		<div class="table-responsive">
			<table class="table m-0">
				<thead>
					<tr>
						<th>Mã loại sản phẩm</th>
						<th>Tên loai sản phẩm</th>
						<th>Số lượng sản phẩm</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${DanhSachLoaiSanPham }">
						<tr>
							<td><a
								href="<c:url value='chi-tiet-loai-san-pham/${item.maLoaiSanPham }'/>">${item.maLoaiSanPham }</a></td>
							<td>${item.tenLoaiSanPham }</td>
							<td>${item.soLuongSanPham}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<!-- /.table-responsive -->
	</div>
</div>