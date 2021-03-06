<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>


<body>
	<div class="content">
		<div style="text-align: center;" class="caption-table">Chi tiết sản phẩm</div>

		<div>Mã sản phẩm: ${SanPham.sanPham.maSanPham }</div>
		<div>Tên sản phẩm: ${SanPham.sanPham.tenSanPham }</div>
		<div>Hình ảnh: <img src="<c:url value='/assets/user/img/sanpham/${SanPham.sanPham.hinhAnh }'/>" height="100px" width="100px" alt=""></div>
		<div>Giá: ${SanPham.sanPham.gia } VND</div>
		<div>Mô tả: ${SanPham.sanPham.moTa }</div>
		<div>Ngày tạo: ${SanPham.sanPham.ngayTao }</div>
		<div>Ngày cập nhật: ${SanPham.sanPham.ngayCapNhat }</div>
		<div>Sản phẩm nổi bật: 
			<c:if test="${SanPham.sanPham.noiBat == false}">Không</c:if>
			<c:if test="${SanPham.sanPham.noiBat == true}">Có</c:if>
		</div>
		<div>Sản phẩm mới: 
			<c:if test="${SanPham.sanPham.sanPhamMoi == false}">Không</c:if>
			<c:if test="${SanPham.sanPham.sanPhamMoi == true}">Có</c:if></div>
		<div>Loại sản phẩm: ${SanPham.loaiSanPham.tenLoaiSanPham }</div>
		
		
		<a class="btn btn-info btn-sm"
			href="<c:url value='/admin/chi-tiet-san-pham/${ SanPham.sanPham.maSanPham}/chinh-sua'/>">
			<i class="fas fa-pencil-alt"> </i> Chỉnh sửa
		</a> <a class="btn btn-danger btn-sm"
			href="<c:url value='/admin/chi-tiet-san-pham/${ SanPham.sanPham.maSanPham}/xoa'/>">
			<i class="fas fa-trash"> </i> Xóa
		</a> 
	</div>
</body>