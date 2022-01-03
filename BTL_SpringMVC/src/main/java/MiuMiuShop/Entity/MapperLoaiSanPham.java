package MiuMiuShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperLoaiSanPham implements RowMapper<LoaiSanPham>{
	public LoaiSanPham mapRow(ResultSet rs, int rowNum) throws SQLException {
		LoaiSanPham loaiSanPham = new LoaiSanPham();
		loaiSanPham.setMaLoaiSanPham(rs.getInt("MaLoaiSanPham"));
		loaiSanPham.setTenLoaiSanPham(rs.getString("TenLoaiSanPham"));
		return loaiSanPham;
	}
}
