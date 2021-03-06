package MiuMiuShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import MiuMiuShop.Service.LoaiSanPhamServiceImpl;
import MiuMiuShop.Service.SanPhamServiceImpl;
import MiuMiuShop.Service.SlideServiceImpl;

@Controller
public class HomeController extends BaseController{
	
	@Autowired
	SlideServiceImpl slideService = new SlideServiceImpl();
	@Autowired
	LoaiSanPhamServiceImpl loaiSanPhamService = new LoaiSanPhamServiceImpl();
	@Autowired
	SanPhamServiceImpl sanPhamService = new SanPhamServiceImpl();
	@RequestMapping(value = {"/", "trang-chu"}, method = RequestMethod.GET)
	public ModelAndView Index()
	{
		/*
		 *` _mvShare.addObject("slides", _homeService.GetDataSlideHienThi());
		 * _mvShare.addObject("loaiSanPham", _homeService.GetDataLoaiSanPham());
		 * _mvShare.addObject("sanPham", _homeService.GetDataSanPham());
		 * //_mvShare.addObject("sanPham_loaiSanPham",
		 * _homeService.GetDataSanPhamDto()); _mvShare.addObject("sanPhamNoiBat",
		 * _homeService.GetDataSanPhamNoiBat()); _mvShare.addObject("sanPhamMoi",
		 * _homeService.GetDataSanPhamMoi());
		 */
		_mvShare.addObject("slides", slideService.LayDanhSachSlideHienThi());
		_mvShare.addObject("loaiSanPham", loaiSanPhamService.GetDataLoaiSanPham());
		_mvShare.addObject("sanPham", sanPhamService.LayDanhSachSanPham());
		_mvShare.addObject("sanPhamNoiBat", sanPhamService.GetDataSanPhamNoiBat());
		_mvShare.addObject("sanPhamNgauNghien", sanPhamService.GetDataSanPhamNgauNghien());
		
		_mvShare.setViewName("user/index");
		return _mvShare;
	}
}
