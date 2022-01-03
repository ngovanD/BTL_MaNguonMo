<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<body>
	<div class="content">
		<form:form action="them/luu" modelAttribute="loaiSanPham">
			<div class="card-body">
				<div class="form-group">
					<label for="exampleInputEmail1">Tên loại sản phẩm</label>
					<form:input value="${LoaiSanPham.tenLoaiSanPham }"
						class="form-control" path="tenLoaiSanPham" />
				</div>
			</div>
			<!-- /.card-body -->

			<div class="card-footer">
				<button type="submit" class="btn btn-primary">Lưu</button>
			</div>
		</form:form>
	</div>
</body>