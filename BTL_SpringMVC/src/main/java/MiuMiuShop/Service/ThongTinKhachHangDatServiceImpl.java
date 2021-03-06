package MiuMiuShop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiuMiuShop.Dao.ThongTinKhachHangDatDao;
import MiuMiuShop.Entity.ThongTinKhachHangDat;

@Service
public class ThongTinKhachHangDatServiceImpl implements IThongTinKhachHangDatService{

	@Autowired
	ThongTinKhachHangDatDao thongTinKhachHangDatDao = new ThongTinKhachHangDatDao();
	public List<ThongTinKhachHangDat> GetDataThongTinLienHe_KhachHang() {
		// TODO Auto-generated method stub
		return thongTinKhachHangDatDao.GetDataThongTinLienHe_KhachHang();
	}

	public int TaoDataThongTinKhachHangDat(ThongTinKhachHangDat thongTinLienHe_KhachHang) {
		// TODO Auto-generated method stub
		return thongTinKhachHangDatDao.TaoDataThongTinLienHe_KhachHang(thongTinLienHe_KhachHang);
	}

	public ThongTinKhachHangDat GetThongTinKhachHangDat(int maThongTinKhachHangDat) {
		// TODO Auto-generated method stub
		return thongTinKhachHangDatDao.GetThongTinKhachHangDat(maThongTinKhachHangDat);
	}

}
