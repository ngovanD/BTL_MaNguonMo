package MiuMiuShop.Controller.User;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import MiuMiuShop.Entity.ChiTietHoaDon;
import MiuMiuShop.Entity.HoaDon;
import MiuMiuShop.Entity.TaiKhoan;
import MiuMiuShop.Entity.ThongTinKhachHangDat;
import MiuMiuShop.Service.ChiTietHoaDonServiceImpl;
import MiuMiuShop.Service.HoaDonServiceImpl;
import MiuMiuShop.Service.TaiKhoanServiceImpl;
import MiuMiuShop.Service.ThongTinKhachHangDatServiceImpl;

@Controller
public class HoaDonController extends BaseController{
	@Autowired
	private HoaDonServiceImpl hoaDonService = new HoaDonServiceImpl();
	@Autowired
	private ChiTietHoaDonServiceImpl chiTietHoaDonService = new ChiTietHoaDonServiceImpl();
	@Autowired
	private TaiKhoanServiceImpl TaiKhoanService = new TaiKhoanServiceImpl();
	@Autowired
	ThongTinKhachHangDatServiceImpl thongTinKhachHangDatService = new ThongTinKhachHangDatServiceImpl();
	
	@RequestMapping(value = {"/gio-hang"}, method = RequestMethod.GET)
	public ModelAndView GioHang(HttpSession session)
	{
		HashMap<Integer, ChiTietHoaDon> hoaDon 
		= (HashMap<Integer, ChiTietHoaDon>)session.getAttribute("GioHang");
		if(hoaDon == null)
		{
			_mvShare.setViewName("redirect:/trang-chu");
			return _mvShare;
		}
		
		_mvShare.setViewName("user/giohang");
		return _mvShare;
	}
	
	@RequestMapping(value = {"/dat-hang"}, method = RequestMethod.GET)
	public ModelAndView Index(HttpSession session)
	{
		HashMap<Integer, ChiTietHoaDon> hoaDon 
		= (HashMap<Integer, ChiTietHoaDon>)session.getAttribute("GioHang");
		TaiKhoan nguoiDung = (TaiKhoan)session.getAttribute("ThongTinNguoiDung");
		
		if(hoaDon == null)
		{
			_mvShare.setViewName("redirect:/trang-chu");
			return _mvShare;
		}
		
		if(nguoiDung == null)
		{
			_mvShare.setViewName("redirect:/trang-chu");
			return _mvShare;
		}
		
		int idNguoiDung = TaiKhoanService.GetIdTaiKhoanByEmail(nguoiDung);
		nguoiDung.setId(idNguoiDung);
		session.setAttribute("thongTinNguoiDung", nguoiDung);	
		_mvShare.addObject("thongTinKhachHangDat", new ThongTinKhachHangDat());
		_mvShare.setViewName("user/dathang");
		return _mvShare;
	}
	
	@RequestMapping(value = {"/dat-hang/xac-nhan"}, method = RequestMethod.POST)
	public ModelAndView XacNhanDatHang(HttpSession session, @ModelAttribute("thongTinKhachHangDat") ThongTinKhachHangDat thongTinKhachHangDat)
	{
		TaiKhoan nguoiDung = (TaiKhoan)session.getAttribute("thongTinNguoiDung");
		
		HashMap<Integer, ChiTietHoaDon> hoaDon 
		= (HashMap<Integer, ChiTietHoaDon>)session.getAttribute("GioHang");
		
		int maThongTinLienHe_KhachHang = thongTinKhachHangDatService.TaoDataThongTinKhachHangDat(thongTinKhachHangDat);
		
		hoaDonService.TaoHoaDon(nguoiDung.getId(), hoaDon, maThongTinLienHe_KhachHang);
		
		session.removeAttribute("GioHang");
		session.removeAttribute("TongSanPhamGioHang");
		session.removeAttribute("TongTienGioHang");
		
		_mvShare.setViewName("user/dathangthanhcong");
		return _mvShare;
	}
	
	
	@RequestMapping(value = {"/danh-sach-don-hang/{id}"})
	public ModelAndView DanhSachHoaDon(HttpSession session, @PathVariable int id)
	{
		
		_mvShare.addObject("danhSachHoaDon", hoaDonService.GetDataHoaDonCuaIDTK(id));
		_mvShare.setViewName("user/danhsachhoadon");
		return _mvShare;
	}
	
	@RequestMapping(value = {"/chi-tiet-don-hang/{id}"})
	public ModelAndView ChiTietDonHang(HttpSession session, @PathVariable int id)
	{
		HoaDon hoaDon = hoaDonService.GetHoaDonByMaHoaDon(id);
		
		_mvShare.addObject("HoaDon", hoaDon);
		_mvShare.addObject("ThongTinKhachHangDat", thongTinKhachHangDatService.GetThongTinKhachHangDat(hoaDon.getMaThongTinTinKhachHangDat()));
		_mvShare.addObject("DongHoaDon", chiTietHoaDonService.GetDataHoaDonByMaHoaDon(hoaDon.getMaHoaDon()));
		_mvShare.setViewName("user/chitietdonhang");
		return _mvShare;
	}
}
