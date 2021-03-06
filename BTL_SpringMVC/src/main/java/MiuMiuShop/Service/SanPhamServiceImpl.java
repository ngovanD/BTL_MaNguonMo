package MiuMiuShop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiuMiuShop.Dao.SanPhamDao;
import MiuMiuShop.Dto.SanPhamDto;
import MiuMiuShop.Entity.SanPham;

@Service
public class SanPhamServiceImpl implements ISanPhamService {

	@Autowired
	SanPhamDao sanPhamDao = new SanPhamDao();
	
	public SanPhamDto LaySanPhamByID(int id) {
		return sanPhamDao.GetSanPhamByID(id).get(0);
	}

	public List<SanPham> LayDanhSachSanPham() {
		// TODO Auto-generated method stub
		return sanPhamDao.GetDataSanPham();
	}

	public int XoaSanPham(int id) {
		// TODO Auto-generated method stub
		return sanPhamDao.XoaSanPham(id);
	}

	public int SuaSanPham(int id, SanPham sanPham) {
		// TODO Auto-generated method stub
		return sanPhamDao.SuaSanPham(id, sanPham);
	}

	public int TaoSanPham(SanPham sanPham) {
		// TODO Auto-generated method stub
		return sanPhamDao.TaoSanPham(sanPham);
	}

	public List<SanPham> GetDataSanPhamNoiBat() {
		// TODO Auto-generated method stub
		return sanPhamDao.GetDataSanPhamNoiBat();
	}

	public List<SanPham> GetDataSanPhamMoi() {
		// TODO Auto-generated method stub
		return sanPhamDao.GetDataSanPhamMoi();
	}

	public List<SanPham> GetDataSanPhamNgauNghien() {
		// TODO Auto-generated method stub
		return sanPhamDao.GetDataSanPhamNgauNghien();
	}

	public List<SanPham> LaySanPhamByTen(String text) {
		// TODO Auto-generated method stub
		return sanPhamDao.LaySanPhamByTen(text);
	}
}