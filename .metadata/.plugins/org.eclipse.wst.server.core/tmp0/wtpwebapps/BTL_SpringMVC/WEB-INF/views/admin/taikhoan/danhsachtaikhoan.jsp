<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<div class="card">
	<div class="card-header border-transparent">
		<h3 class="card-title">Danh sách tài khoản</h3>
	</div>
	<!-- /.card-header -->
	<div class="card-body p-0">
		<div class="table-responsive">
			<table class="table m-0">
				<thead>
					<tr>
						<th>ID</th>
						<th>Email</th>
						<th>Loại tài khoản</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${DanhSachTaiKhoan }">
						<tr>
							<td><a
								href="<c:url value='chi-tiet-tai-khoan/${item.id }'/>">${item.id }</a></td>
							<td>${item.email }</td>
							<td>${item.loaiTaiKhoan }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<!-- /.table-responsive -->
	</div>
</div>