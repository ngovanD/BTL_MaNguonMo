package MiuMiuShop.Controller.Admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import MiuMiuShop.Entity.HoaDon;
import MiuMiuShop.Service.ChiTietHoaDonServiceImpl;
import MiuMiuShop.Service.HoaDonServiceImpl;
import MiuMiuShop.Service.TaiKhoanServiceImpl;
import MiuMiuShop.Service.ThongTinKhachHangDatServiceImpl;

@Controller
public class HoaDonController_ {
	
	@Autowired
	HoaDonServiceImpl hoaDonService;
	@Autowired
	private ChiTietHoaDonServiceImpl chiTietHoaDonService = new ChiTietHoaDonServiceImpl();
	@Autowired
	private TaiKhoanServiceImpl TaiKhoanService = new TaiKhoanServiceImpl();
	@Autowired
	ThongTinKhachHangDatServiceImpl thongTinKhachHangDatService = new ThongTinKhachHangDatServiceImpl();
	
	@RequestMapping(value = "/admin/danh-sach-don-hang")
	public ModelAndView DanhSachHoaDon() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("DanhSachHoaDon", hoaDonService.GetDataHoaDon());
		mv.setViewName("admin/hoadon/danhsachdonhang");
		return mv;
	}
	
	@RequestMapping(value = "/admin/danh-sach-don-hang/loc", method= RequestMethod.POST)
	@ResponseBody
	public ModelAndView DanhSachHoaDonLoc(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		
		String trangThai = request.getParameter("option");
		System.out.print(trangThai);
		if(trangThai.equals("TatCa")) {
			mv.setViewName("redirect:/admin/danh-sach-don-hang");
			return mv;
		}
		
		mv.addObject("DanhSachHoaDon", hoaDonService.GetDataHoaDonTheoTrangThai(trangThai));
		mv.setViewName("admin/hoadon/danhsachdonhang");
		return mv;
	}
	
	@RequestMapping(value = "/admin/chi-tiet-don-hang/{id}")
	public ModelAndView ChiTietHoaDon(@PathVariable int id) {
		ModelAndView mv = new ModelAndView();
		
		HoaDon hoaDon = hoaDonService.GetHoaDonByMaHoaDon(id);
		mv.addObject("HoaDon", hoaDon);
		mv.addObject("ThongTinKhachHangDat", thongTinKhachHangDatService.GetThongTinKhachHangDat(hoaDon.getMaThongTinTinKhachHangDat()));
		mv.addObject("DongHoaDon", chiTietHoaDonService.GetDataHoaDonByMaHoaDon(hoaDon.getMaHoaDon()));
		mv.setViewName("admin/hoadon/chitietdonhang");
		return mv;
	}

	@RequestMapping(value = "/admin/chi-tiet-don-hang/{id}/xac-nhan")
	public ModelAndView XacNhanDonHang(@PathVariable int id) {
		ModelAndView mv = new ModelAndView();
		int check = hoaDonService.XacNhanDon(id);
		
		mv.setViewName("redirect:/admin/chi-tiet-don-hang/" + id);
		return mv;
	}
	
	@RequestMapping(value = "/admin/chi-tiet-don-hang/{id}/huy")
	public ModelAndView HuyDonHang(@PathVariable int id) {
		ModelAndView mv = new ModelAndView();
		int check = hoaDonService.Huy(id);
		
		mv.setViewName("redirect:/admin/chi-tiet-don-hang/" + id);
		return mv;
	}
}
