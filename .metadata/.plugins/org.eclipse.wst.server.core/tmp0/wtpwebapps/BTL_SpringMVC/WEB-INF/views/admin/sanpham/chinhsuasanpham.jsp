<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<body>
	<div class="content">
		<form:form action="chinh-sua/luu" modelAttribute="sanPham"
			method="POST" enctype="multipart/form-data">
			<div class="card-body">
				<div class="form-group">
					<label for="exampleInputEmail1">Mã sản phẩm:</label> <input
						value="${SanPham.sanPham.maSanPham }" class="form-control" disabled />
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">Tên sản phẩm:</label>
					<form:input value=" ${SanPham.sanPham.tenSanPham}" path="tenSanPham" class="form-control" />
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">Giá:</label>
					<form:input value="${SanPham.sanPham.gia }" path="gia" class="form-control" />
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Mô tả:</label>
					<form:input value="${SanPham.sanPham.moTa }" path="moTa" class="form-control" />
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Ngày tạo:</label>
					<input value="${SanPham.sanPham.ngayTao }" class="form-control" disabled/>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Ngày cập nhật:</label>
					<input value="${SanPham.sanPham.ngayCapNhat }" class="form-control" disabled/>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Sản phẩm nổi bật:</label>
					<form:select path="noiBat">
						<form:option value="1">Có</form:option>
						<form:option value="0">Không</form:option>
					</form:select>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Sản phẩm mới:</label>
					<form:select path="sanPhamMoi">
						<form:option value="1">Có</form:option>
						<form:option value="0">Không</form:option>
					</form:select>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Loại sản phẩm:</label>
					<form:select path="maLoaiSanPham">
						<c:forEach var="item" items="${DanhSachLoaiSanPham }">
							<form:option value="${item.maLoaiSanPham }">${item.tenLoaiSanPham }</form:option>
						</c:forEach>
					</form:select>
				</div>
				<div class="form-group">
					<label for="exampleInputFile">Hình ảnh</label>
					<div class="input-group">
						<div class="custom-file">
							<input type="file" name="image" />
						</div>
					</div>
				</div>


			</div>
			<!-- /.card-body -->

			<div class="card-footer">
				<button type="submit" class="btn btn-primary">Lưu</button>
			</div>
		</form:form>
	</div>
</body>