<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<body>
	<div class="content">
		<form action="<c:url value='thong-tin-shop/chinh-sua'/>" >
			<div class="card-body">
				<div class="form-group">
					<label for="exampleInputEmail1">Tên shop:</label> 
					<input value="${ThongTinShop.tenShop }"
							 class="form-control" disabled/>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">Địa chỉ:</label> 
					<input value="${ThongTinShop.diaChi }" class="form-control" disabled/>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Email:</label> 
					<input value="${ThongTinShop.email }"
							 class="form-control" disabled/>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Số điện thoại:</label> 
					<input value="${ThongTinShop.soDienThoai }"
							class="form-control" disabled/>
				</div>
			</div>
			<!-- /.card-body -->

			<div class="card-footer">
				<button type="submit" class="btn btn-primary">Chỉnh sửa</button>
			</div>
		</form>
	</div>
</body>