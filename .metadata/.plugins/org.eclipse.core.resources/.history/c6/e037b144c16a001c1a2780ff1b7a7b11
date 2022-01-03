package MiuMiuShop.Controller.User;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import MiuMiuShop.Entity.ChiTietHoaDon;
import MiuMiuShop.Service.User.ChiTietHoaDonServiceImpl;

@Controller
public class ChiTietSanPhamController extends BaseController{
	
	@Autowired
	private ChiTietHoaDonServiceImpl chiTietHoaDonService = new ChiTietHoaDonServiceImpl();
	
	@RequestMapping(value = "ThemSanPham/{maSanPham}")
	public String ThemSanPham(HttpServletRequest request, HttpSession session, @PathVariable int maSanPham)
	{
		HashMap<Integer, ChiTietHoaDon> hoaDon 
			= (HashMap<Integer, ChiTietHoaDon>)session.getAttribute("GioHang");
		
		if(hoaDon == null)
		{
			hoaDon = new HashMap<Integer, ChiTietHoaDon>();
		}
		
		hoaDon = chiTietHoaDonService.ThemVaoDongHoaDon(maSanPham, hoaDon);
		session.setAttribute("GioHang", hoaDon);
		session.setAttribute("TongSanPhamGioHang", chiTietHoaDonService.TongSoSanPham(hoaDon));
		session.setAttribute("TongTienGioHang", chiTietHoaDonService.TongTienCacSanPham(hoaDon));
		return "redirect:" + request.getHeader("Referer");
	}
	
	
	@RequestMapping(value = "BotSanPham/{maSanPham}")
	public String BotSanPham(HttpServletRequest request, HttpSession session, @PathVariable int maSanPham)
	{
		HashMap<Integer, ChiTietHoaDon> hoaDon 
			= (HashMap<Integer, ChiTietHoaDon>)session.getAttribute("GioHang");
		
		if(hoaDon == null)
		{
			return "redirect:" + request.getHeader("Referer");
		}
		
		hoaDon = chiTietHoaDonService.BotVaoDongHoaDon(maSanPham, hoaDon);
		session.setAttribute("GioHang", hoaDon);
		session.setAttribute("TongSanPhamGioHang", chiTietHoaDonService.TongSoSanPham(hoaDon));
		session.setAttribute("TongTienGioHang", chiTietHoaDonService.TongTienCacSanPham(hoaDon));
		return "redirect:" + request.getHeader("Referer");
	}
	
}
