package MiuMiuShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import MiuMiuShop.Dto.MapperSoLuong;
import MiuMiuShop.Dto.SoLuong;
import MiuMiuShop.Entity.MapperTaiKhoan;
import MiuMiuShop.Entity.TaiKhoan;

@Repository
public class TaiKhoanDao extends BaseDao {
	public int KiemTraTaiKhoanUser(String email, String matKhau) {
		List<TaiKhoan> result = new ArrayList<TaiKhoan>();
		String sql = "SELECT * FROM TaiKhoan " + "WHERE LoaiTaiKhoan = 'User'" + "AND Email = '" + email + "' "
				+ "AND MatKhau = '" + matKhau + "'";
		result = _jdbcTemplate.query(sql, new MapperTaiKhoan());
		if (result.size() <= 0) {
			return 0;
		}
		return 1;
	}

	public String LayHoTenTaiKhoanByEmail(String email) {
		List<TaiKhoan> result = new ArrayList<TaiKhoan>();
		String sql = "SELECT * FROM TaiKhoan " + "WHERE LoaiTaiKhoan = 'User'" + "AND Email = '" + email + "' ";
		result = _jdbcTemplate.query(sql, new MapperTaiKhoan());
		return result.get(0).getHoTen();
	}

	public int TaoTaiKhoanUser(String hoTen, String email, String matKhau) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO TaiKhoan VALUES('" + email + "', N'" + hoTen + "', '" + matKhau + "', 'User')";
		int result = 0;
		try {
			result = _jdbcTemplate.update(sql);
		} catch (Exception e) {
			return 0;
		}
		return result;
	}
	
	public int GetIdTaiKhoanByEmail(TaiKhoan taiKhoan)
	{
		List<TaiKhoan> result = new ArrayList<TaiKhoan>();
		String sql = "SELECT TOP 1 * FROM TaiKhoan " 
				+ "WHERE Email = '" + taiKhoan.getEmail() +"'";
		result = _jdbcTemplate.query(sql, new MapperTaiKhoan());
		if(result.size() <= 0 )
		{
			return -1;
		}
		return result.get(0).getId();
	}
	
	public TaiKhoan GetTaiKhoanByEmail(String email)
	{
		List<TaiKhoan> result = new ArrayList<TaiKhoan>();
		String sql = "SELECT * FROM TaiKhoan " + "WHERE LoaiTaiKhoan = 'User'" + "AND Email = '" + email + "' ";
		result = _jdbcTemplate.query(sql, new MapperTaiKhoan());
		return result.get(0);
	}
	
	
	public List<TaiKhoan> GetDataTaiKhoan() {
		// TODO Auto-generated method stub
		List<TaiKhoan> list = new ArrayList<TaiKhoan>();
		String sql = "SELECT * FROM TaiKhoan WHERE LoaiTaiKhoan ='User'";
		list = _jdbcTemplate.query(sql, new MapperTaiKhoan());
		return list;
	}
	
	
	public int XoaTaiKhoan(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM TaiKhoan "
				+ "WHERE Id = " + id;
		int check = _jdbcTemplate.update(sql);
		return check;
	}
	
	public int SuaTaiKhoan(int id, TaiKhoan taiKhoan) {
		// TODO Auto-generated method stub
		String sql = "UPDATE TaiKhoan SET HoTen = '" + taiKhoan.getHoTen()+"', MatKhau = '" + taiKhoan.getMatKhau() +"' "
				+ "WHERE Id = " + id;
		int check = _jdbcTemplate.update(sql);
		return check;
	}

	public TaiKhoan GetDataTaiKhoanById(int id) {
		// TODO Auto-generated method stub
		List<TaiKhoan> list = new ArrayList<TaiKhoan>();
		String sql = "SELECT * FROM TaiKhoan "
				+ "WHERE Id = " + id;
		list = _jdbcTemplate.query(sql, new MapperTaiKhoan());
		return list.get(0);
	}

	public int KiemTraTaiKhoanAdmin(TaiKhoan taiKhoan) {
		// TODO Auto-generated method stub
		List<TaiKhoan> result = new ArrayList<TaiKhoan>();
		String sql = "SELECT * FROM TaiKhoan "
				+ "WHERE LoaiTaiKhoan = 'Admin'"
				+ "AND Email = '" + taiKhoan.getEmail() +"' "
				+ "AND MatKhau = '" + taiKhoan.getMatKhau() + "'";
		result = _jdbcTemplate.query(sql, new MapperTaiKhoan());
		if(result.size() <= 0 )
		{
			return 0;
		}
		return 1;
	}

	public int TongUser() {
		List<SoLuong> result = new ArrayList<SoLuong>();
		String sql = "SELECT Count(*) AS SoLuong FROM TaiKhoan WHERE LoaiTaiKhoan = 'User'";
		result = _jdbcTemplate.query(sql, new MapperSoLuong());
		return result.get(0).getSoLuong();
	}
}
