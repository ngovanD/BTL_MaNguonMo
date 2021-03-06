package MiuMiuShop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiuMiuShop.Dao.TaiKhoanDao;
import MiuMiuShop.Entity.TaiKhoan;

@Service
public class TaiKhoanServiceImpl implements ITaiKhoanService{

	@Autowired
	TaiKhoanDao taiKhoanDao;
	public int KiemTraTaiKhoanUser(String email, String matKhau) {
		// TODO Auto-generated method stub
		return taiKhoanDao.KiemTraTaiKhoanUser(email, matKhau);
	}
	public String LayHoTenTaiKhoanByEmail(String email) {
		// TODO Auto-generated method stub
		return taiKhoanDao.LayHoTenTaiKhoanByEmail(email);
	}
	public int TaoTaiKhoanUser(String hoTen, String email, String matKhau) {
		// TODO Auto-generated method stub
		return taiKhoanDao.TaoTaiKhoanUser(hoTen, email, matKhau);
	}
	public int GetIdTaiKhoanByEmail(TaiKhoan taiKhoan) {
		// TODO Auto-generated method stub
		return taiKhoanDao.GetIdTaiKhoanByEmail(taiKhoan);
	}
	
	public TaiKhoan GetTaiKhoanByEmail(String email) {
		return taiKhoanDao.GetTaiKhoanByEmail(email);
	}
	public List<TaiKhoan> GetDataTaiKhoan() {
		// TODO Auto-generated method stub
		return taiKhoanDao.GetDataTaiKhoan();
	}
	public int XoaTaiKhoan(int id) {
		// TODO Auto-generated method stub
		return taiKhoanDao.XoaTaiKhoan(id);
	}
	public int SuaTaiKhoan(int id, TaiKhoan taiKhoan) {
		// TODO Auto-generated method stub
		return taiKhoanDao.SuaTaiKhoan(id, taiKhoan);
	}
	public TaiKhoan GetDataTaiKhoanById(int id) {
		// TODO Auto-generated method stub
		return taiKhoanDao.GetDataTaiKhoanById(id);
	}
	public int KiemTraTaiKhoanAdmin(TaiKhoan taiKhoan) {
		// TODO Auto-generated method stub
		return taiKhoanDao.KiemTraTaiKhoanAdmin(taiKhoan);
	}
	public int TongUser() {
		// TODO Auto-generated method stub
		return taiKhoanDao.TongUser();
	}

}
