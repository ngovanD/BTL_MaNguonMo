<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
    
      <!-- Preloader -->

  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-dark">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      
    </ul>

    <!-- Right navbar links -->
    <ul class="navbar-nav ml-auto">

      <!-- Messages Dropdown Menu -->
      <li class="nav-item">
        <a class="nav-link" href="#">
          ADMIN
        </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="<c:url value='/admin/dang-xuat'/>">
          Đăng xuất
        </a>
      </li>
    </ul>
  </nav>
  <!-- /.navbar -->

  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->

    <!-- Sidebar -->
    <div class="sidebar">

      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
          <li class="nav-item menu-open">
            <a href="<c:url value='/admin/home'/>" class="nav-link">
              <p style="color:white">
                Thống kê
              </p>
            </a>
          </li>
          <li class="nav-item menu-open">
            <a href="<c:url value='/admin/danh-sach-tai-khoan'/>" class="nav-link">
              <p style="color:white">
                Quản lý người dùng
              </p>
            </a>
          </li>
          <li class="nav-item menu-open">
            <a href="<c:url value='/admin/danh-sach-don-hang'/>" class="nav-link">
              <p style="color:white">
                Quản lý đơn hàng
              </p>
            </a>
          </li>
          <li class="nav-item menu-open">
            <a href="<c:url value='/admin/danh-sach-slide'/>" class="nav-link">
              <p style="color:white">
                Quản lý slide-banner
              </p>
            </a>
          </li>
          <li class="nav-item menu-open">
            <a href="<c:url value='/admin/danh-sach-loai-san-pham'/>" class="nav-link">
              <p style="color:white">
                Quản lý loại sản phẩm
              </p>
            </a>
          </li>
           <li class="nav-item menu-open">
            <a href="<c:url value='/admin/danh-sach-san-pham'/>" class="nav-link">
              <p style="color:white">
                Quản lý sản phẩm
              </p>
            </a>
          </li>
          <li class="nav-item menu-open">
            <a href="<c:url value='/admin/thong-tin-shop'/>" class="nav-link">
              <p style="color:white">
                Quản lý thông tin shop
              </p>
            </a>
          </li>
          
        </ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>
  
  <!-- Login form -->	
  <c:if test="${not empty Admin }">
  <div class="login" id="login" style="display:none">
  </c:if>
  
  <c:if test="${ empty Admin }">
  	<div class="login" id="login">
  </c:if>

	<div class="container-login">
		<form class="login100-form validate-form" method="post">
			<span class="login100-form-title"> Đăng nhập </span>


			<div class="wrap-input100 validate-input"
				data-validate="Valid email is required: ex@abc.xyz">
				<input id="email_login" class="input100" type="text" name="email" placeholder="Email">
				<span class="focus-input100"></span> <span class="symbol-input100">
					<i class="fa fa-envelope" aria-hidden="true"></i>
				</span>
			</div>

			<div class="wrap-input100 validate-input"
				data-validate="Password is required">
				<input id="matKhau_login" class="input100" type="password" name="pass"
					placeholder="Mật khẩu"> <span class="focus-input100"></span>
				<span class="symbol-input100"> <i class="fa fa-lock"
					aria-hidden="true"></i>
				</span>
			</div>

			<div class="container-login100-form-btn">
				<input type="button" class="login100-form-btn" onclick="dangNhap()" value="Đăng nhập">
			</div>
		</form>
	</div>
</div>
    