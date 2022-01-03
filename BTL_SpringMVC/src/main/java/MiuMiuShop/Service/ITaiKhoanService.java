package MiuMiuShop.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import MiuMiuShop.Entity.TaiKhoan;

@Service
public interface ITaiKhoanService {
	public int KiemTraTaiKhoanUser(String email, String matKhau);
	public String LayHoTenTaiKhoanByEmail(String email);
	public int TaoTaiKhoanUser(String hoTen, String email, String matKhau);
	public int GetIdTaiKhoanByEmail(TaiKhoan taiKhoan);
	public TaiKhoan GetTaiKhoanByEmail(String email);
	
	public List<TaiKhoan> GetDataTaiKhoan();
	public int XoaTaiKhoan(int id);
	public int SuaTaiKhoan(int id, TaiKhoan taiKhoan);
	public TaiKhoan GetDataTaiKhoanById(int id);
	public int KiemTraTaiKhoanAdmin(TaiKhoan taiKhoan);
}
