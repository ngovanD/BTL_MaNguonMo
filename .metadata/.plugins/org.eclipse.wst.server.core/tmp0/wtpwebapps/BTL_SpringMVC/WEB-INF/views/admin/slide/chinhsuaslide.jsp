<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<body>
	<div class="content">
		<form:form action="chinh-sua/luu" modelAttribute="slide" enctype="multipart/form-data">
			<div class="card-body">
				<div class="form-group">
					<label for="exampleInputEmail1">Mã slide</label> 
					<input value="${ThongTinSlide.maSlide }"  class="form-control" 
							 disabled/>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">Tên slide</label> 
					<form:input value="${ThongTinSlide.tenSlide }"  class="form-control" 
							path="tenSlide" />
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">Trạng thái</label> 
					<form:select path="trangThai">
							<form:option value="1">Hiển thị</form:option>
							<form:option value="0">Ẩn</form:option>
						</form:select>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Nội dung</label> 
					<form:input value="${ThongTinSlide.noiDung }"
							path="noiDung" class="form-control"/>
				</div>
				<div class="form-group">
					<label for="exampleInputFile">Hình ảnh</label>
					<div class="input-group">
						<div class="custom-file">
							<input type="file" name="image"/>
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