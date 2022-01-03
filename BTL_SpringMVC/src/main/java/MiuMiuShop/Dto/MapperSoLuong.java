package MiuMiuShop.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperSoLuong implements RowMapper<SoLuong>{
	public SoLuong mapRow(ResultSet rs, int rowNum) throws SQLException {
		SoLuong soLuong = new SoLuong();
		soLuong.setSoLuong(rs.getInt("SoLuong"));
		return soLuong;
	}
}
