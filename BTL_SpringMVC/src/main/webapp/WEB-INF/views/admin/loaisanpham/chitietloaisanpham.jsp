<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<body>
	<div class="content">
		<div style="text-align: center;" class="caption-table">Chi tiết
			loại sản phẩm</div>

		<div>Mã loai san pham: ${LoaiSanPham.maLoaiSanPham }</div>
		<br/>
		<div>
			Tên loại sản phẩm: ${LoaiSanPham.tenLoaiSanPham }
		</div>
		<br/>
		<div>Số lượng sản phẩm: ${LoaiSanPham.soLuongSanPham }</div>

		<br/>
		<br/>

		<a class="btn btn-info btn-sm"
			href="<c:url value='/admin/chi-tiet-loai-san-pham/${ LoaiSanPham.maLoaiSanPham}/chinh-sua'/>">
			<i class="fas fa-pencil-alt"> </i> Chỉnh sửa
		</a> <a class="btn btn-danger btn-sm"
			href="<c:url value='/admin/chi-tiet-loai-san-pham/${LoaiSanPham.maLoaiSanPham}/xoa'/>">
			<i class="fas fa-trash"> </i> Xóa
		</a> 
	</div>
</body>