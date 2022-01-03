<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<body>
	<div class="content">
		<div style="text-align: center;" class="caption-table">Chi tiết
			slide</div>

		<div>Mã slide: ${ThongTinSlide.maSlide }</div>
		<br/>
		<div>
			Trạng thái:
			<c:if test="${ThongTinSlide.trangThai == false}">Ẩn</c:if>
			<c:if test="${ThongTinSlide.trangThai == true}">Hiển thị</c:if>
		</div>
		<br/>
		<div>Tiêu đề: ${ThongTinSlide.tenSlide }</div>
		<br/>
		<div>Nội dung: ${ThongTinSlide.noiDung }</div>
		<br/>
		<div>
			Hình ảnh: <img
				src="<c:url value='/assets/user/img/banner/${ThongTinSlide.hinhAnh }'/>"
				height="100px" width="100px" alt="">
		</div>
		<br/>
		<br/>

		<a class="btn btn-info btn-sm"
			href="<c:url value='/admin/chi-tiet-slide/${ ThongTinSlide.maSlide}/chinh-sua'/>">
			<i class="fas fa-pencil-alt"> </i> Chỉnh sửa
		</a> <a class="btn btn-danger btn-sm"
			href="<c:url value='/admin/chi-tiet-slide/${ ThongTinSlide.maSlide}/xoa'/>">
			<i class="fas fa-trash"> </i> Xóa
		</a> 
	</div>
</body>