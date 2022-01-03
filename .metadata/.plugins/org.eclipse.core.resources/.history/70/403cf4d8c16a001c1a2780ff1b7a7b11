package MiuMiuShop.Service.User;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiuMiuShop.Dao.ChiTietHoaDonDao;
import MiuMiuShop.Entity.ChiTietHoaDon;

@Service
public class ChiTietHoaDonServiceImpl implements IChiTietHoaDonService{
	@Autowired
	private ChiTietHoaDonDao chiTietHoaDonDao = new ChiTietHoaDonDao();

	public HashMap<Integer, ChiTietHoaDon> ThemVaoDongHoaDon(int maSanPham, HashMap<Integer, ChiTietHoaDon> hoaDon) {
		// TODO Auto-generated method stub
		return chiTietHoaDonDao.ThemVaoDongHoaDon(maSanPham, hoaDon);
	}

	public HashMap<Integer, ChiTietHoaDon> SuaDongHoaDon(int maSanPham, int soLuong,
			HashMap<Integer, ChiTietHoaDon> hoaDon) {
		// TODO Auto-generated method stub
		return chiTietHoaDonDao.SuaDongHoaDon(maSanPham, soLuong, hoaDon);
	}

	public HashMap<Integer, ChiTietHoaDon> XoaDongHoaDon(int maSanPham, HashMap<Integer, ChiTietHoaDon> hoaDon) {
		// TODO Auto-generated method stub
		return chiTietHoaDonDao.XoaDongHoaDon(maSanPham, hoaDon);
	}

	public int TongSoSanPham(HashMap<Integer, ChiTietHoaDon> hoaDon) {
		// TODO Auto-generated method stub
		return chiTietHoaDonDao.TongSoSanPham(hoaDon);
	}

	public int TongTienCacSanPham(HashMap<Integer, ChiTietHoaDon> hoaDon) {
		// TODO Auto-generated method stub
		return chiTietHoaDonDao.TongTienCacSanPham(hoaDon);
	}

	public HashMap<Integer, ChiTietHoaDon> BotVaoDongHoaDon(int maSanPham, HashMap<Integer, ChiTietHoaDon> hoaDon) {
		// TODO Auto-generated method stub
		int soLuong =  hoaDon.get(maSanPham).getSoLuong()-1;
		return chiTietHoaDonDao.SuaDongHoaDon(maSanPham, soLuong, hoaDon);
	}
}
