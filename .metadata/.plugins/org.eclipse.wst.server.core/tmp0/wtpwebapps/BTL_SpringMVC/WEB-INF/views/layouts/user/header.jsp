<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored = "false"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<!-- Header Section Begin -->
<header class="header">
	<div class="header__top">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 col-md-6">
					<div class="header__top__left">
						<ul>
							<li><i class="fa fa-envelope"></i> ${thongTinShop.email }</li>
						</ul>
					</div>
				</div>
				<div class="col-lg-6 col-md-6">
					<div class="header__top__right">
						<div class="header__top__right__social">
							<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
								class="fa fa-twitter"></i></a> <a href="#"><i
								class="fa fa-linkedin"></i></a> <a href="#"><i
								class="fa fa-pinterest-p"></i></a>
						</div>
						<c:if test="${not empty ThongTinNguoiDung }">
							<div class="header__top__right__auth">
								<a href="<c:url value='/danh-sach-don-hang/${ThongTinNguoiDung.id }'/>" title="Danh sách đơn hàng"><i class="fa fa-user"></i>
								<span id="hoTenNguoiDung">${ThongTinNguoiDung.hoTen }</span></a>
							</div>
							<div class="header__top__right__auth">
								<a href="<c:url value='/dang-xuat'/>"><i class="fa fa-sign-out"></i></a>
							</div>	
						</c:if>
						<c:if test="${ empty ThongTinNguoiDung }">
							<div class="header__top__right__auth">
								<a onclick="popUpLogin()"><i class="fa fa-user"></i>
								<span id="hoTenNguoiDung">Đăng nhập</span></a>
							</div>	
						</c:if>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-lg-3">
				<div class="header__logo">
					<a href="./index.html"><img src="img/logo.png" alt=""></a>
				</div>
			</div>
			<div class="col-lg-6">
				<nav class="header__menu">
					<ul>
						<li class="active"><a href="<c:url value='/trang-chu'/>">Trang chủ</a></li>
						<li><a href="<c:url value='/tat-ca-san-pham'/>">Sản phẩm</a></li>
						<li><a href="<c:url value='/tat-ca-san-pham'/>">Blog</a></li>
						<li><a href="<c:url value='/tat-ca-san-pham'/>">Liên hệ</a></li>
					</ul>
				</nav>
			</div>
			<div class="col-lg-3">
				<div class="header__cart">
					<ul>
						<li>
						<a href="<c:url value='/gio-hang'/>"><i class="fa fa-shopping-bag"></i> 
						<span>
							<c:if test="${ not empty TongSanPhamGioHang }">${TongSanPhamGioHang }</c:if>
							<c:if test="${ empty TongSanPhamGioHang }">0</c:if>
						</span>
						</a>
						</li>
					</ul>
					<div class="header__cart__price">
						Tổng tiền: <span><c:if test="${ not empty TongTienGioHang }">${TongTienGioHang }</c:if>
					<c:if test="${ empty TongTienGioHang }">0</c:if> VND</label></span>
					</div>
				</div>
			</div>
		</div>
		<div class="humberger__open">
			<i class="fa fa-bars"></i>
		</div>
	</div>
</header>
<!-- Header Section End -->

<!-- Hero Section Begin -->
<section class="hero hero-normal">
	<div class="container">
		<div class="row">
			<div class="col-lg-3">
				<div class="hero__categories">
					<div class="hero__categories__all">
						<i class="fa fa-bars"></i><span>Danh mục</span>
					</div>
					<ul>
						<c:forEach var="item" items="${loaiSanPham }">
							<li><a href="<c:url value='/loai-san-pham/${item.maLoaiSanPham}'/>">${item.tenLoaiSanPham }</a></li>
						</c:forEach>
					</ul>
				</div>
			</div>
			<div class="col-lg-9">
				<div class="hero__search">
					<div class="hero__search__form">
						<form action="<c:url value='/tim-kiem'/>" method="post">
							<input type="text" placeholder="Bạn muốn tìm gì?" name="textSearch">
							<button type="submit" class="site-btn">Tìm kiếm</button>
						</form>
					</div>
					<div class="hero__search__phone">
						<div class="hero__search__phone__icon">
							<i class="fa fa-phone"></i>
						</div>
						<div class="hero__search__phone__text">
							<h5> ${thongTinShop.soDienThoai }</h5>
							<span>hỗ trợ 24/7</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- Hero Section End -->

<!-- Login form -->
<div class="login" id="login">
	<div class="container-login">
		<div class="item-close" id="item-close" style="font-size: 35px;"
			onclick="closePopUpLogin()">&times</div>
		<form class="login100-form validate-form">
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
			<div class="text-center p-t-136">
				<a class="txt2" href="#" onclick="popUpSignup()"> Tạo tài khoản
					<i class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
				</a>
			</div>
		</form>
	</div>
</div>


<div class="signup" id="signup">
	<div class="container-signup">
		<div class="item-close" id="item-close" style="font-size: 35px;"
			onclick="closePopUpSignup()">&times</div>
		<form class="login100-form validate-form">
			<span class="login100-form-title"> Đăng ký </span>

			<div class="wrap-input100 validate-input"
				data-validate="Password is required">
				<input id="hoTen_signup" class="input100" type="text" name="pass"
					placeholder="Họ và tên"> <span class="focus-input100"></span>
				<span class="symbol-input100"> <i class="fa fa-user"></i>
				</span>
			</div>

			<div class="wrap-input100 validate-input"
				data-validate="Valid email is required: ex@abc.xyz">
				<input id="email_signup" class="input100" type="text" name="email" placeholder="Email">
				<span class="focus-input100"></span> <span class="symbol-input100">
					<i class="fa fa-envelope" aria-hidden="true"></i>
				</span>
			</div>

			<div class="wrap-input100 validate-input"
				data-validate="Password is required">
				<input id="matKhau_signup" class="input100" type="password" name="pass"
					placeholder="Mật khẩu"> <span class="focus-input100"></span>
				<span class="symbol-input100"> <i class="fa fa-lock"
					aria-hidden="true"></i>
				</span>
			</div>

			<div class="container-login100-form-btn">
				<input type="button" class="login100-form-btn" onclick="dangKy()" value="Đăng ký">
			</div>
		</form>
	</div>
</div>

<!-- End form -->

<!-- Blog Section End -->
<!-- Js Plugins -->
