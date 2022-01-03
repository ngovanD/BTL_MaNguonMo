<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<body>
	<div class="content">
		<form:form action="chinh-sua/luu" modelAttribute="thongTinShop" mothed="POST">
			<div class="card-body">
				<div class="form-group">
					<label for="exampleInputEmail1">Tên shop:</label> 
					<form:input value="${ThongTinShop.tenShop }"
							path="tenShop" class="form-control"/>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">Địa chỉ:</label> 
					<form:input value="${ThongTinShop.diaChi }" path="diaChi" class="form-control"/>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Email:</label> 
					<form:input value="${ThongTinShop.email }"
							path="email" class="form-control"/>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Số điện thoại:</label> 
					<form:input value="${ThongTinShop.soDienThoai }"
							path="soDienThoai" class="form-control"/>
				</div>
			</div>
			<!-- /.card-body -->

			<div class="card-footer">
				<button type="submit" class="btn btn-primary">Lưu</button>
			</div>
		</form:form>
	</div>
</body>