package MiuMiuShop.Controller.Admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import MiuMiuShop.Entity.Slide;
import MiuMiuShop.Service.HomeServiceImpl;
import MiuMiuShop.Service.SlideServiceImpl;

@Controller
public class SlideController {
	
	@Autowired
	HomeServiceImpl homeService;
	@Autowired
	SlideServiceImpl slideService;
	
	@RequestMapping(value ="/admin/danh-sach-slide")
	public ModelAndView DanhSachSlide()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("DanhSachSlide", slideService.LayDanhSachSlide());
		mv.setViewName("admin/slide/danhsachslide");	
		return  mv;
	}
	
	@RequestMapping(value ="/admin/danh-sach-slide/them")
	public ModelAndView ThemSlide( @ModelAttribute("slide") Slide slide)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/slide/themslide");	
		return  mv;
	}
	
	@RequestMapping(value ="/admin/danh-sach-slide/them/luu", method = RequestMethod.POST)
	public ModelAndView TaoSlide( @ModelAttribute("slide") Slide slide)
	{
		ModelAndView mv = new ModelAndView();
		int check = slideService.TaoSlide(slide);
		mv.setViewName("redirect:/admin/danh-sach-slide");	
		return  mv;
	}
	
	@RequestMapping(value ="/admin/chi-tiet-slide/{id}")
	public ModelAndView ChiTietSlide(@PathVariable int id)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("ThongTinSlide", slideService.GetDataSlideById(id));
		mv.setViewName("admin/slide/chitietslide");	
		return  mv;
	}
	
	@RequestMapping(value ="/admin/chi-tiet-slide/{id}/chinh-sua")
	public ModelAndView ChinhSuaSlide(@PathVariable int id, @ModelAttribute("slide") Slide slide)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("ThongTinSlide", slideService.GetDataSlideById(id));
		mv.setViewName("admin/slide/chinhsuaslide");	
		return  mv;
	}
	
	@RequestMapping(value ="/admin/chi-tiet-slide/{id}/chinh-sua/luu", method = RequestMethod.POST)
	public ModelAndView LuuSlide(@PathVariable int id,  @ModelAttribute("slide") Slide slide
			, @RequestParam(value="image", required = false) MultipartFile photo, HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		int check = slideService.SuaSlide(id, slide);
		mv.addObject("ThongTinSlide", slideService.GetDataSlideById(id));
		mv.setViewName("redirect:/admin/chi-tiet-slide/" + id);
		return  mv;
	}
	
	@RequestMapping(value ="/admin/chi-tiet-slide/{id}/xoa")
	public ModelAndView XoaSlide(@PathVariable int id)
	{
		ModelAndView mv = new ModelAndView();
		int check = slideService.XoaSlide(id);
		mv.setViewName("redirect:/admin/danh-sach-slide");	
		return  mv;
	}
	
	/*
	 * private String saveFile(MultipartFile file, HttpServletRequest request) {
	 * if(file != null && !file.isEmpty()) { try { byte[] bytes = file.getBytes();
	 * 
	 * String rootDir = request.getSession().getServletContext().getRealPath("/");
	 * File serverFile= new File(rootDir + "assets/user/img/banner/"+
	 * file.getOriginalFilename() + ".png"); String name = file.getName();
	 * 
	 * System.out.println("===============" +rootDir + "assets/user/img/banner/"+
	 * file.getName() + ".png"); BufferedOutputStream stream = new
	 * BufferedOutputStream(new FileOutputStream(serverFile)); stream.write(bytes);
	 * stream.close();
	 * 
	 * return name + ".png";
	 * 
	 * 
	 * } catch (IOException e) { System.out.println("===============" +
	 * e.getMessage()); } } else {
	 * System.out.println("=============== khong ton tai"); } return null; }
	 */
}
