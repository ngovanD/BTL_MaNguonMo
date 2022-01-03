package MiuMiuShop.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperSanPhamDto2 implements RowMapper<SanPhamDto2>{

	public SanPhamDto2 mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		SanPhamDto2 sanPhamDto2 = new SanPhamDto2();

		sanPhamDto2.setMaSanPham(rs.getInt("MaSanPham"));
		sanPhamDto2.setTenSanPham(rs.getString("TenSanPham"));
		sanPhamDto2.setSoLuong(rs.getInt("SoLuong"));
		
		return sanPhamDto2;
	}

}
