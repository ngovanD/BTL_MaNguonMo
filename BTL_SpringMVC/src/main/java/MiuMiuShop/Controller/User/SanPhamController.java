package MiuMiuShop.Controller.User;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import MiuMiuShop.Dto.PaginatesDto;
import MiuMiuShop.Entity.SanPham;
import MiuMiuShop.Entity.TaiKhoan;
import MiuMiuShop.Service.LoaiSanPhamServiceImpl;
import MiuMiuShop.Service.PaginatesServiceImpl;
import MiuMiuShop.Service.SanPhamServiceImpl;

@Controller
public class SanPhamController extends BaseController {
	
	@Autowired
	private SanPhamServiceImpl sanPhamService;
	@Autowired
	private LoaiSanPhamServiceImpl loaiSanPhamSevice;
	@Autowired
	private PaginatesServiceImpl paginateService;
	
	private int tongSanPham1Trang = 12;
	
	@RequestMapping(value = {"chi-tiet-san-pham/{id}", "loai-san-pham/chi-tiet-san-pham/{id}"})
	public ModelAndView Index(@PathVariable int id)
	{
		_mvShare.setViewName("user/sanpham/chitietsanpham");
		_mvShare.addObject("sanPham", sanPhamService.LaySanPhamByID(id));
		return _mvShare;
	}
	
	@RequestMapping(value = {"tim-kiem"}, method= RequestMethod.POST)
	@ResponseBody
	public ModelAndView DangNhap(HttpServletRequest request, HttpServletResponse response, HttpSession session)
	{
		String text = request.getParameter("textSearch");
		
		_mvShare.setViewName("user/sanpham/timkiem");
		List<SanPham> list = sanPhamService.LaySanPhamByTen(text);
		_mvShare.addObject("danhSachSanPhamTimKiem", list);
		
		_mvShare.addObject("sanPhamMoi", sanPhamService.GetDataSanPhamMoi());
		return _mvShare;
	}
	
	
}