package MiuMiuShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperSlide implements RowMapper<Slide> {

	public Slide mapRow(ResultSet rs, int rowNum) throws SQLException {
		Slide Slide = new Slide();
		Slide.setMaSlide(rs.getInt("MaSlide"));
		Slide.setTenSlide(rs.getString("TenSlide"));
		Slide.setHinhAnh(rs.getString("HinhAnh"));
		Slide.setNoiDung(rs.getString("NoiDung"));
		Slide.setLink(rs.getString("Link"));
		Slide.setTrangThai(rs.getBoolean("TrangThai"));
		return Slide;
	}
}

