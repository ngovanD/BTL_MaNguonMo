package MiuMiuShop.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import MiuMiuShop.Entity.SanPham;
import MiuMiuShop.Service.LoaiSanPhamServiceImpl;
import MiuMiuShop.Service.SanPhamServiceImpl;

@Controller
public class SanPhamController_ {
	@Autowired
	SanPhamServiceImpl sanPhamService;
	
	@Autowired
	LoaiSanPhamServiceImpl loaiSanPhamService;
	@RequestMapping(value = {"/admin/danh-sach-san-pham"})
	public ModelAndView DanhSachSanPham()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("DanhSachSanPham", sanPhamService.LayDanhSachSanPham());
		mv.setViewName("admin/sanpham/danhsachsanpham");
		return mv;
	}
	
	@RequestMapping(value = {"/admin/chi-tiet-san-pham/{id}"})
	public ModelAndView ChiTietSanPham(@PathVariable int id)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("SanPham", sanPhamService.LaySanPhamByID(id));
		mv.setViewName("admin/sanpham/chitietsanpham");
		return mv;
	}
	
	@RequestMapping(value = {"/admin/chi-tiet-san-pham/{id}/xoa"})
	public ModelAndView XoaSanPham(@PathVariable int id)
	{
		ModelAndView mv = new ModelAndView();
		int check = sanPhamService.XoaSanPham(id);
		mv.setViewName("redirect:/admin/danh-sach-san-pham");	
		return mv;
	}
	
	@RequestMapping(value = {"/admin/chi-tiet-san-pham/{id}/chinh-sua"})
	public ModelAndView ChinhSuaSanPham(@PathVariable int id, @ModelAttribute("sanPham") SanPham sanPham)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("SanPham", sanPhamService.LaySanPhamByID(id));
		mv.addObject("DanhSachLoaiSanPham", loaiSanPhamService.GetDataLoaiSanPham());
		mv.setViewName("admin/sanpham/chinhsuasanpham");
		return mv;
	}
	
	@RequestMapping(value = {"/admin/chi-tiet-san-pham/{id}/chinh-sua/luu"}, method = RequestMethod.POST)
	public ModelAndView LuuSanPham(@PathVariable int id, @ModelAttribute("sanPham") SanPham sanPham)
	{
		ModelAndView mv = new ModelAndView();
		int check = sanPhamService.SuaSanPham(id, sanPham);
		mv.setViewName("redirect:/admin/chi-tiet-san-pham/" + id);
		return mv;
	}
	
	
	@RequestMapping(value ="/admin/danh-sach-san-pham/them")
	public ModelAndView ThemSanPham( @ModelAttribute("sanPham") SanPham sanPham)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("DanhSachLoaiSanPham", loaiSanPhamService.GetDataLoaiSanPham());
		mv.setViewName("admin/sanpham/themsanpham");	
		return  mv;
	}
	
	@RequestMapping(value ="/admin/danh-sach-san-pham/them/luu", method = RequestMethod.POST)
	public ModelAndView TaoSanPham( @ModelAttribute("sanPham") SanPham sanPham)
	{
		ModelAndView mv = new ModelAndView();
		int check = sanPhamService.TaoSanPham(sanPham);
		mv.setViewName("redirect:/admin/danh-sach-san-pham");	
		return  mv;
	}
}
