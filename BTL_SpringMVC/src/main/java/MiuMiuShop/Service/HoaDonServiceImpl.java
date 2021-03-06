package MiuMiuShop.Service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiuMiuShop.Dao.HoaDonDao;
import MiuMiuShop.Dto.HoaDonDto;
import MiuMiuShop.Dto.SanPhamDto2;
import MiuMiuShop.Entity.HoaDon;
import MiuMiuShop.Entity.ChiTietHoaDon;

@Service
public class HoaDonServiceImpl implements IHoaDonService{

	@Autowired
	private HoaDonDao hoaDonDao; 
	public int TaoHoaDon(int Id, HashMap<Integer, ChiTietHoaDon> hoaDon_DanhSachSanPham, 
			int maThongTinLienHe_KhachHang) {
		// TODO Auto-generated method stub
		return hoaDonDao.TaoHoaDon(Id, hoaDon_DanhSachSanPham, maThongTinLienHe_KhachHang);
	}
	public List<HoaDon> GetDataHoaDon() {
		// TODO Auto-generated method stub
		return hoaDonDao.GetDataHoaDon();
	}
	public List<HoaDonDto> GetHoaDonByID(int id) {
		// TODO Auto-generated method stub
		return hoaDonDao.GetHoaDonByID(id);
	}
	public int XacNhanDon(int id) {
		// TODO Auto-generated method stub
		return hoaDonDao.XacNhanDon(id);
	}
	public int Huy(int id) {
		// TODO Auto-generated method stub
		return hoaDonDao.HuyDon(id);
	}
	public int ChinhSuaDonHang(int id, HoaDonDto hoaDon_) {
		// TODO Auto-generated method stub
		return hoaDonDao.ChinhSuaDonHang(id, hoaDon_);
	}
	public List<HoaDon> GetDataHoaDonCuaIDTK(int ID) {
		return hoaDonDao.GetDataHoaDonCuaIDTK(ID);
	}
	public HoaDon GetHoaDonByMaHoaDon(int maHoaDon) {
		// TODO Auto-generated method stub
		return hoaDonDao.GetHoaDonByMaHoaDon(maHoaDon);
	}
	public List<HoaDon> GetDataHoaDonTheoTrangThai(String trangThai) {
		// TODO Auto-generated method stub
		return hoaDonDao.GetDataHoaDonTheoTrangThai(trangThai);
	}
	public int TongSanPhamBanThangNay() {
		// TODO Auto-generated method stub
		return hoaDonDao.TongSanPhamBanThangNay();
	}
	public int TongHoaDonBanThangNay() {
		// TODO Auto-generated method stub
		return hoaDonDao.TongHoaDonBanThangNay();
	}
	
	public int TongTienBanThangNay() {
		// TODO Auto-generated method stub
		return hoaDonDao.TongTienBanThangNay();
	}
	
	public SanPhamDto2 SanPhamBanChayThangNay() {
		return hoaDonDao.SanPhamBanChayThangNay();
	}

}
