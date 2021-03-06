<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<body>
	<div class="content">
		<form:form action="chinh-sua/luu" modelAttribute="taiKhoan"
			method="POST">
                <div class="card-body">
                  <div class="form-group">
                    <label for="exampleInputEmail1">Email</label>
                    <input disabled type="email" value="${TaiKhoan.email }" class="form-control" id="exampleInputEmail1" placeholder="Enter email" >
                  </div>
                   <div class="form-group">
                    <label for="hoTen">Họ tên</label>
                    <form:input path="hoTen" value="${TaiKhoan.hoTen}" type="text" class="form-control" id="hoTen" placeholder="Họ tên"/>
                  </div>
                  <div class="form-group">
                    <label for="exampleInputPassword1">Mật khẩu</label>
                    <form:input path="matKhau" value="${TaiKhoan.matKhau}" type="text" class="form-control" id="exampleInputPassword1" placeholder="Mật khẩu"/>
                  </div>
                </div>
                <!-- /.card-body -->

                <div class="card-footer">
                  <button type="submit" class="btn btn-primary">Lưu</button>
                </div>
        </form:form>  
	</div>
</body>