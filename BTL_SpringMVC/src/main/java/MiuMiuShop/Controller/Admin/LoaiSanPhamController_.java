package MiuMiuShop.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import MiuMiuShop.Dto.LoaiSanPhamDto;
import MiuMiuShop.Entity.LoaiSanPham;
import MiuMiuShop.Entity.SanPham;
import MiuMiuShop.Service.LoaiSanPhamServiceImpl;

@Controller
public class LoaiSanPhamController_ {
	@Autowired
	LoaiSanPhamServiceImpl loaiSanPhamService;
	@RequestMapping(value = {"/admin/danh-sach-loai-san-pham"})
	public ModelAndView DanhSachSanPham()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("DanhSachLoaiSanPham", loaiSanPhamService.GetDataLoaiSanPham());
		mv.setViewName("admin/loaisanpham/danhsachloaisanpham");
		return mv;
	}
	
	@RequestMapping(value = {"/admin/chi-tiet-loai-san-pham/{id}"})
	public ModelAndView ChiTietSanPham(@PathVariable int id)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("LoaiSanPham", loaiSanPhamService.LayLoaiSanPhamTheoID(id));
		mv.setViewName("admin/loaisanpham/chitietloaisanpham");
		return mv;
	}
	
	@RequestMapping(value = {"/admin/chi-tiet-loai-san-pham/{id}/xoa"})
	public ModelAndView XoaSanPham(@PathVariable int id)
	{
		ModelAndView mv = new ModelAndView();
		int check = loaiSanPhamService.XoaLoaiSanPham(id);
		mv.setViewName("redirect:/admin/danh-sach-loai-san-pham");	
		return mv;
	}
	
	@RequestMapping(value = {"/admin/chi-tiet-loai-san-pham/{id}/chinh-sua"})
	public ModelAndView ChinhSuaSanPham(@PathVariable int id, @ModelAttribute("loaiSanPham") LoaiSanPhamDto LoaiSanPhamDto)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("LoaiSanPham", loaiSanPhamService.LayLoaiSanPhamTheoID(id));
		mv.setViewName("admin/loaisanpham/chinhsualoaisanpham");
		return mv;
	}
	
	@RequestMapping(value = {"/admin/chi-tiet-loai-san-pham/{id}/chinh-sua/luu"}, method = RequestMethod.POST)
	public ModelAndView LuuSanPham(@PathVariable int id, @ModelAttribute("loaiSanPham") LoaiSanPhamDto loaiSanPhamDto)
	{
		ModelAndView mv = new ModelAndView();
		int check = loaiSanPhamService.SuaLoaiSanPham(id, loaiSanPhamDto);
		mv.setViewName("redirect:/admin/chi-tiet-loai-san-pham/" + id);
		return mv;
	}
	
	
	@RequestMapping(value ="/admin/danh-sach-loai-san-pham/them")
	public ModelAndView ThemSanPham(  @ModelAttribute("loaiSanPham") LoaiSanPham loaiSanPham)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("DanhSachLoaiSanPham", loaiSanPhamService.GetDataLoaiSanPham());
		mv.setViewName("admin/loaisanpham/themloaisanpham");	
		return  mv;
	}
	
	@RequestMapping(value ="/admin/danh-sach-loai-san-pham/them/luu", method = RequestMethod.POST)
	public ModelAndView TaoSanPham( @ModelAttribute("loaiSanPham") LoaiSanPham loaiSanPham)
	{
		ModelAndView mv = new ModelAndView();
		int check = loaiSanPhamService.ThemLoaiSanPham(loaiSanPham);
		mv.setViewName("redirect:/admin/danh-sach-loai-san-pham");	
		return  mv;
	}
}
