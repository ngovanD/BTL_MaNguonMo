package MiuMiuShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperThongTinShop implements RowMapper<ThongTinShop> {

	public ThongTinShop mapRow(ResultSet rs, int rowNum) throws SQLException {
		ThongTinShop thongTinShop = new ThongTinShop();
		thongTinShop.setMaLienheShop(rs.getInt("MaLienHeShop"));
		thongTinShop.setDiaChi(rs.getString("DiaChi"));
		thongTinShop.setEmail(rs.getString("Email"));
		thongTinShop.setSoDienThoai(rs.getString("SoDienThoai"));
		thongTinShop.setTenShop(rs.getString("TenShop"));
		return thongTinShop;
	}
}

