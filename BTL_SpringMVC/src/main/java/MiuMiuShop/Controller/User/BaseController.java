package MiuMiuShop.Controller.User;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import MiuMiuShop.Service.LoaiSanPhamServiceImpl;
import MiuMiuShop.Service.SanPhamServiceImpl;
import MiuMiuShop.Service.ThongTinShopServiceImpl;

@Controller
public class BaseController {
	@Autowired
	ThongTinShopServiceImpl thongTinShopService;
	@Autowired
	LoaiSanPhamServiceImpl loaiSanPhamService = new LoaiSanPhamServiceImpl();
	@Autowired
	SanPhamServiceImpl sanPhamService = new SanPhamServiceImpl();
	public ModelAndView _mvShare = new ModelAndView("user/index");
	
	
	@PostConstruct //giup chay ham Init() truoc khi chay HomeController
	public ModelAndView Init() {
		_mvShare.addObject("thongTinShop", thongTinShopService.LayThongTinShop());
		_mvShare.addObject("loaiSanPham", loaiSanPhamService.GetDataLoaiSanPham());
		_mvShare.addObject("sanPhamMoi", sanPhamService.GetDataSanPhamMoi());
		return _mvShare;
	}
}
