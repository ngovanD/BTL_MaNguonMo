function popUpLogin()
{
    var e = document.getElementById("login");
    e.style.display = "block";
}

function closePopUpLogin(){
    var e = document.getElementById("login");
    e.style.display = "none";
}

function popUpSignup()
{
    closePopUpLogin();
    var e = document.getElementById("signup");
    e.style.display = "block";
}

function closePopUpSignup(){
    var e = document.getElementById("signup");
    e.style.display = "none";
}




var slideIndex = 1;
showDivs(slideIndex);

function plusDivs(n) {
	showDivs(slideIndex += n);
}

function showDivs(n) {
	var i;
	var x = document.getElementsByClassName("item-slide");
	if (n > x.length) {
		slideIndex = 1
	}
	if (n < 1) {
		slideIndex = x.length
	}
	for (i = 0; i < x.length; i++) {
		x[i].style.display = "none";
	}
	x[slideIndex - 1].style.display = "block";
	x[slideIndex - 1].style.opacity = 1;
	x[slideIndex - 1].style.visibility = "visible";

}

function dangNhap(){
	$.ajax({
		type: "post",
		url: "/BTL_SpringMVC/dang-nhap",
		scriptCharset: "utf-8" ,
	    contentType: "application/x-www-form-urlencoded; charset=UTF-8",
		cache: false,
		data: "email="+$("#email_login").val()+"&matKhau="+$("#matKhau_login").val(),
		
		success: function(data){
			if(data == "-1"){
				alert("Kiểm tra lại tài khoản và mật khẩu !!!");
			}
			else{
				closePopUpLogin();
				window.location = '/BTL_SpringMVC/trang-chu';
			}
		},
	});
}


function dangKy(){
	var email = document.getElementById("email_signup");
	var hoTen = document.getElementById("hoTen_signup");
	var matKhau = document.getElementById("matKhau_signup");
	
	var ketQua = document.getElementById("ketQuaDangKy");
	

	if(email.value == "" || hoTen.value == "" || matKhau.value == "")
	{
		alert("Hãy điền đầy đủ thông tin !!!");
		return;
	}
	
	var validRegex = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
	
	if(!email.value.match(validRegex))
	{
		alert("Email không hợp lệ !!!");
		return;
	}
	
	$.ajax({
		type: "post",
		url: "/BTL_SpringMVC/dang-ky",
		cache: false,
		data: "&hoTen="+$("#hoTen_signup").val()+"&email="+$("#email_signup").val()+"&matKhau="+$("#matKhau_signup").val(),
		
		success: function(response){
			if(response == "1"){
				alert("Tạo tài khoản thành công, hãy đăng nhập lại !!!");
				closePopUpSignup();
				popUpLogin();
			}
			else{
				alert("Email đã tồn tại !!!");
			}
		},
	});
}

