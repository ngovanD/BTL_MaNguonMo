package MiuMiuShop.Controller.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import MiuMiuShop.Entity.TaiKhoan;
import MiuMiuShop.Service.TaiKhoanServiceImpl;

@Controller

public class TaiKhoanController extends BaseController {
	
	@Autowired
	TaiKhoanServiceImpl taiKhoanService;
	
	@RequestMapping(value = {"/dang-nhap"}, method= RequestMethod.POST)
	@ResponseBody
	public String DangNhap(HttpServletRequest request, HttpServletResponse response, HttpSession session)
	{
		TaiKhoan taiKhoan = new TaiKhoan();
		
		String email = request.getParameter("email");
		String matKhau = request.getParameter("matKhau");
		
		taiKhoan.setEmail(email);
		
		int result = taiKhoanService.KiemTraTaiKhoanUser(email, matKhau);
		
		if(result == 1)
		{
			taiKhoan = taiKhoanService.GetTaiKhoanByEmail(email);
			session.setAttribute("ThongTinNguoiDung", taiKhoan);
			return "redirect:";
		}
		
		return "-1";
	}
	
	@RequestMapping(value = {"/dang-ky"}, method= RequestMethod.POST)
	@ResponseBody
	public String DangKy(HttpServletRequest request, HttpServletResponse response)
	{
		String hoTen = request.getParameter("hoTen");
		String email = request.getParameter("email");
		String matKhau = request.getParameter("matKhau");

		int result = taiKhoanService.TaoTaiKhoanUser(hoTen, email, matKhau);
		
		if(result == 1)
		{	
			return "1";
		}
		
		return "-1";
	}
	
	@RequestMapping(value = {"/dang-xuat"})
	public ModelAndView DangXuat(HttpSession session)
	{
		session.removeAttribute("ThongTinNguoiDung");
		_mvShare.setViewName("redirect:/trang-chu");
		return _mvShare;
	}

}
