

function dangNhap(){
	$.ajax({
		type: "post",
		url: "/BTL_SpringMVC/admin/dang-nhap",
		scriptCharset: "utf-8" ,
	    contentType: "application/x-www-form-urlencoded; charset=UTF-8",
		cache: false,
		data: "email="+$("#email_login").val()+"&matKhau="+$("#matKhau_login").val(),
		
		success: function(data){
			if(data == "-1"){
				alert("Kiểm tra lại tài khoản và mật khẩu !!!");
			}
			else{
				window.location = '/BTL_SpringMVC/admin/home';
			}
		},
	});
}

