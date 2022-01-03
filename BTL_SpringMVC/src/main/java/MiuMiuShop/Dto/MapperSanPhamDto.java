package MiuMiuShop.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import MiuMiuShop.Entity.LoaiSanPham;
import MiuMiuShop.Entity.SanPham;

public class MapperSanPhamDto implements RowMapper<SanPhamDto> {

	public SanPhamDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		SanPhamDto sanPhamDto = new SanPhamDto();
		SanPham sanPham = new SanPham();
		LoaiSanPham loaiSanPham = new LoaiSanPham();
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
		
		loaiSanPham.setMaLoaiSanPham(rs.getInt("MaLoaiSanPham"));
		loaiSanPham.setTenLoaiSanPham(rs.getString("TenLoaiSanPham"));
		
		sanPhamDto.setSanPham(sanPham);
		sanPhamDto.setLoaiSanPham(loaiSanPham);
		return sanPhamDto;
	}
}
