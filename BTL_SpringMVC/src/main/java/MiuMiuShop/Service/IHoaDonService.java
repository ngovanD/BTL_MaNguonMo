package MiuMiuShop.Service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import MiuMiuShop.Dto.HoaDonDto;
import MiuMiuShop.Entity.ChiTietHoaDon;
import MiuMiuShop.Entity.HoaDon;

@Service
public interface IHoaDonService {
	public int TaoHoaDon(int Id, HashMap<Integer, ChiTietHoaDon> hoaDon_DanhSachSanPham, 
			int maThongTinLienHe_KhachHang);
	public List<HoaDon> GetDataHoaDon();
	public List<HoaDon> GetDataHoaDonCuaIDTK(int ID);
	public HoaDon GetHoaDonByMaHoaDon(int maHoaDon);
	public List<HoaDonDto> GetHoaDonByID(int id);
	public int XacNhanDon(int id);
	public int Huy(int id);
	public int ChinhSuaDonHang(int id, HoaDonDto hoaDon_);
	public List<HoaDon> GetDataHoaDonTheoTrangThai(String trangThai);
}

