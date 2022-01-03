package MiuMiuShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperSanPham implements RowMapper<SanPham> {

	public SanPham mapRow(ResultSet rs, int rowNum) throws SQLException {
		SanPham sanPham = new SanPham();
		sanPham.setMaSanPham(rs.getInt("MaSanPham"));
		sanPham.setTenSanPham(rs.getString("TenSanPham"));
		sanPham.setHinhAnh(rs.getString("HinhAnh"));
		sanPham.setGia(rs.getInt("Gia"));
		sanPham.setGiaGiam(rs.getInt("GiaGiam"));
		sanPham.setSoLuongCon(rs.getInt("SoLuongCon"));
		sanPham.setMoTa(rs.getString("MoTa"));
		sanPham.setNgayTao(rs.getDate("NgayTao"));
		sanPham.setNgayCapNhat(rs.getDate("NgayCapNhat"));
		sanPham.setSanPhamMoi(rs.getBoolean("SanPhamMoi"));
		sanPham.setNoiBat(rs.getBoolean("NoiBat"));
		sanPham.setMaLoaiSanPham(rs.getInt("MaLoaiSanPham"));

		return sanPham;
	}
	
}
