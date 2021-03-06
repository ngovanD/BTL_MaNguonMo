package MiuMiuShop.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperLoaiSanPhamDto implements RowMapper<LoaiSanPhamDto>{
	public LoaiSanPhamDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		LoaiSanPhamDto loaiSanPham = new LoaiSanPhamDto();
		loaiSanPham.setMaLoaiSanPham(rs.getInt("MaLoaiSanPham"));
		loaiSanPham.setTenLoaiSanPham(rs.getString("TenLoaiSanPham"));
		loaiSanPham.setSoLuongSanPham(rs.getInt("SoLuongSanPham"));
		return loaiSanPham;
	}
}
