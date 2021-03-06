package MiuMiuShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperThongTinKhachHangDat implements RowMapper<ThongTinKhachHangDat> {

	public  ThongTinKhachHangDat mapRow(ResultSet rs, int rowNum) throws SQLException {
		 ThongTinKhachHangDat thongTinLienHe_KhachHang = new  ThongTinKhachHangDat();
		thongTinLienHe_KhachHang.setMaThongTinKhachHangDat(rs.getInt("MaThongTinKhachHangDat"));
		thongTinLienHe_KhachHang.setHoTen(rs.getString("HoTen"));
		thongTinLienHe_KhachHang.setDiaChi(rs.getString("DiaChi"));
		thongTinLienHe_KhachHang.setSoDienThoai(rs.getString("SoDienThoai"));
		return thongTinLienHe_KhachHang;
	}
	
}