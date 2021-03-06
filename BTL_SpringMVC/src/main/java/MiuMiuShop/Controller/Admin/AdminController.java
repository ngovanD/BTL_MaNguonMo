package MiuMiuShop.Controller.Admin;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import MiuMiuShop.Dto.HoaDonDto;
import MiuMiuShop.Entity.TaiKhoan;
import MiuMiuShop.Service.HoaDonServiceImpl;
import MiuMiuShop.Service.TaiKhoanServiceImpl;

@Controller
public class AdminController {
	@Autowired
	HoaDonServiceImpl hoaDonService;

	@Autowired
	TaiKhoanServiceImpl taiKhoanService;

//	@RequestMapping(value = { "/admin/home" }, method = RequestMethod.GET)
//	public ModelAndView Index(@ModelAttribute("taiKhoan") TaiKhoan taiKhoan) {
//		ModelAndView mv = new ModelAndView();
//		
//		mv.setViewName("admin/dangnhap");
//		return mv;
//	}

	@RequestMapping(value = "/admin/home")
	public ModelAndView Index(@ModelAttribute("taiKhoan") TaiKhoan taiKhoan) {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("TongSanPhamBan", hoaDonService.TongSanPhamBanThangNay());
		mv.addObject("TongHoaDonBan", hoaDonService.TongHoaDonBanThangNay());
		mv.addObject("TongTienBan", hoaDonService.TongTienBanThangNay());
		mv.addObject("SoUser", taiKhoanService.TongUser());
		
		mv.addObject("SanPhamBanChay", hoaDonService.SanPhamBanChayThangNay());
		mv.setViewName("admin/index");
		return mv;
	}

	@RequestMapping(value = {"/admin/dang-nhap"}, method= RequestMethod.POST)
	@ResponseBody
	public String DangNhap(HttpServletRequest request, HttpServletResponse response, HttpSession session)
	{
		TaiKhoan taiKhoan = new TaiKhoan();
		
		String email = request.getParameter("email");
		String matKhau = request.getParameter("matKhau");
		taiKhoan.setEmail(email);
		taiKhoan.setMatKhau(matKhau);
		
		int result = taiKhoanService.KiemTraTaiKhoanAdmin(taiKhoan);
		
		if(result == 1)
		{
			session.setAttribute("Admin", taiKhoan);	
			return "redirect:";
		}
		
		return "-1";
	}
	
	@RequestMapping(value = "/admin/dang-xuat")
	public ModelAndView DangXuat(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		session.removeAttribute("Admin");
		mv.setViewName("redirect:/admin/home");
		return mv;
	}
	
	
	
	
}
