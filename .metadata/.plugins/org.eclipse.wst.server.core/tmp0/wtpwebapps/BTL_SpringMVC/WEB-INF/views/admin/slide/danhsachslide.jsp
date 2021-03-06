<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<div class="card">
	<div class="card-header border-transparent">
		<h3 class="card-title">Danh sách slide-banner</h3>
		<div align="right"><a href="<c:url value='/admin/danh-sach-slide/them'/>">Thêm slide</a></div>
	</div>
	<!-- /.card-header -->
	<div class="card-body p-0">
		<div class="table-responsive">
			<table class="table m-0">
				<thead>
					<tr>
						<th>Mã slide</th>
						<th>Tiêu đề</th>
						<th>Trạng thái</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${DanhSachSlide }">
						<tr>
							<td><a
								href="<c:url value='chi-tiet-slide/${item.maSlide }'/>">${item.maSlide }</a></td>
							<td>${item.tenSlide }</td>
							<td><c:if test="${item.trangThai == false}">Ẩn</c:if> <c:if
									test="${item.trangThai == true}">Hiển thị</c:if></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<!-- /.table-responsive -->
	</div>
</div>