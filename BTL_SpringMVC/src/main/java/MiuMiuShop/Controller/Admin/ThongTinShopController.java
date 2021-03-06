package MiuMiuShop.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import MiuMiuShop.Entity.ThongTinShop;
import MiuMiuShop.Service.HomeServiceImpl;
import MiuMiuShop.Service.ThongTinShopServiceImpl;

@Controller
public class ThongTinShopController {
	@Autowired
	ThongTinShopServiceImpl thongTinShopService;
	@RequestMapping(value ="/admin/thong-tin-shop")
	public ModelAndView GetDataThongTinLienHeShop()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("ThongTinShop", thongTinShopService.LayThongTinShop());
		mv.setViewName("admin/thongtinshop/xemthongtinshop");	
		return  mv;
	}
	
	@RequestMapping(value ="/admin/thong-tin-shop/chinh-sua")
	public ModelAndView SuaThongTinShop(@ModelAttribute("thongTinShop") ThongTinShop thongTinShop)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("ThongTinShop", thongTinShopService.LayThongTinShop());
		mv.setViewName("admin/thongtinshop/thongtinshop");	
		return  mv;
	}
	
	
	@RequestMapping(value ="/admin/thong-tin-shop/chinh-sua/luu", method = RequestMethod.POST)
	public ModelAndView LuuThongTinLienHeShop(@ModelAttribute("thongTinShop") ThongTinShop thongTinShop)
	{
		ModelAndView mv = new ModelAndView();
		int check = thongTinShopService.SuaThongTinShop(thongTinShop);
		mv.setViewName("redirect:/admin/thong-tin-shop");	
		return  mv;
	}
}
