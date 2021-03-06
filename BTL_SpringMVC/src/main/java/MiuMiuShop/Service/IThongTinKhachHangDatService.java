package MiuMiuShop.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import MiuMiuShop.Entity.ThongTinKhachHangDat;

@Service
public interface IThongTinKhachHangDatService {
	public List<ThongTinKhachHangDat> GetDataThongTinLienHe_KhachHang();
	public int TaoDataThongTinKhachHangDat(ThongTinKhachHangDat thongTinKhachHangDat);
	public ThongTinKhachHangDat GetThongTinKhachHangDat(int maThongTinKhachHangDat);
}