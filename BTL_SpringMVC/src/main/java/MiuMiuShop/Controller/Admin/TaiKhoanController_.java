package MiuMiuShop.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import MiuMiuShop.Entity.TaiKhoan;
import MiuMiuShop.Service.TaiKhoanServiceImpl;

@Controller
public class TaiKhoanController_ {
	@Autowired
	private TaiKhoanServiceImpl taiKhoanService;
	
	@RequestMapping(value ="/admin/danh-sach-tai-khoan")
	public ModelAndView GetDataTaiKhoan()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("DanhSachTaiKhoan", taiKhoanService.GetDataTaiKhoan());
		mv.setViewName("admin/taikhoan/danhsachtaikhoan");	
		return  mv;
	}
	
	@RequestMapping(value ="/admin/chi-tiet-tai-khoan/{id}")
	public ModelAndView ChiTietTaiKhoan(@PathVariable int id)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("TaiKhoan", taiKhoanService.GetDataTaiKhoanById(id));
		mv.setViewName("admin/taikhoan/chitiettaikhoan");	
		return  mv;
	}
	
	@RequestMapping(value ="/admin/chi-tiet-tai-khoan/{id}/xoa")
	public ModelAndView XoaTaiKhoan(@PathVariable int id)
	{
		ModelAndView mv = new ModelAndView();
		int check = taiKhoanService.XoaTaiKhoan(id);
		mv.setViewName("redirect:/admin/danh-sach-tai-khoan");	
		return  mv;
	}
	
	@RequestMapping(value ="/admin/chi-tiet-tai-khoan/{id}/chinh-sua", method = RequestMethod.GET)
	public ModelAndView SuaTaiKhoan(@PathVariable int id, @ModelAttribute("taiKhoan") TaiKhoan taiKhoan)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("TaiKhoan", taiKhoanService.GetDataTaiKhoanById(id));
		mv.setViewName("admin/taikhoan/chinhsuataikhoan");	
		return  mv;
	}
	
	@RequestMapping(value ="/admin/chi-tiet-tai-khoan/{id}/chinh-sua/luu", method = RequestMethod.POST)
	public ModelAndView LuuTaiKhoan(@PathVariable int id, @ModelAttribute("taiKhoan") TaiKhoan taiKhoan)
	{
		ModelAndView mv = new ModelAndView();
		int check = taiKhoanService.SuaTaiKhoan(id, taiKhoan);
		mv.setViewName("redirect:/admin/chi-tiet-tai-khoan/" + id);	
		return  mv;
	}
}
