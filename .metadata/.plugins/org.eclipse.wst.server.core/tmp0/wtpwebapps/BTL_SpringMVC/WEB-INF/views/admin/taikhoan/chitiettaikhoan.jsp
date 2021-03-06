<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<body>
	<div class="content">
		<div style="text-align: center;" class="caption-table">Chi tiết tài khoản</div>

		<div>ID: ${TaiKhoan.id }</div>
		<br/>
		<div>Email: ${TaiKhoan.email }</div>
		<br/>
		<div>Họ tên: ${TaiKhoan.hoTen }</div>
		<br/>
		<div>Mật khẩu: ${TaiKhoan.matKhau }</div>
		<br/>
		<div>Loại tài khoản: ${TaiKhoan.loaiTaiKhoan }</div>
		
		
		<br/>
		<br/>
		
		
         <a class="btn btn-info btn-sm" href="<c:url value='/admin/chi-tiet-tai-khoan/${ TaiKhoan.id}/chinh-sua'/>">
             <i class="fas fa-pencil-alt">
             </i>
             Chỉnh sửa
         </a>
         <a class="btn btn-danger btn-sm" href="<c:url value='/admin/chi-tiet-tai-khoan/${ TaiKhoan.id}/xoa'/>">
             <i class="fas fa-trash">
             </i>
             Xóa
         </a>
	</div>
</body>