package MiuMiuShop.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperHoaDonDto implements RowMapper<HoaDonDto>{

	public HoaDonDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		HoaDonDto hoaDonDto = new HoaDonDto();
		hoaDonDto.setMaHoaDon(rs.getInt("MaHoaDon"));
		hoaDonDto.setTongTien(rs.getInt("TongTien"));
		hoaDonDto.setNgayLapHoaDon(rs.getDate("NgayLapHoaDon"));
		hoaDonDto.setTrangThai(rs.getString("TrangThai"));
		
		hoaDonDto.setMaThongTinLienHe_KhachHang(rs.getInt("MaThongTinLienHe_KhachHang"));
		hoaDonDto.setMaSanPham(rs.getInt("MaSanPham"));
		hoaDonDto.setTenSanPham(rs.getString("TenSanPham"));
		hoaDonDto.setGia(rs.getInt("Gia"));
		
		
		hoaDonDto.setHoTen(rs.getString("HoTen"));
		hoaDonDto.setDiaChi(rs.getString("DiaChi"));
		hoaDonDto.setSoDienThoai(rs.getString("SoDienThoai"));
		
		hoaDonDto.setSoLuong(rs.getInt("SoLuong"));
		
		return hoaDonDto;
	}

}
