package MiuMiuShop.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import MiuMiuShop.Dto.HoaDonDto;
import MiuMiuShop.Dto.MapperHoaDonDto;
import MiuMiuShop.Dto.MapperSanPhamDto2;
import MiuMiuShop.Dto.MapperSoLuong;
import MiuMiuShop.Dto.SanPhamDto2;
import MiuMiuShop.Dto.SoLuong;
import MiuMiuShop.Entity.ChiTietHoaDon;
import MiuMiuShop.Entity.HoaDon;
import MiuMiuShop.Entity.MapperHoaDon;

@Repository
public class HoaDonDao extends BaseDao{
	public List<HoaDon> GetDataHoaDon()
	{
		List<HoaDon> list = new ArrayList<HoaDon>();
		String sql = "SELECT * FROM HoaDon";
		list = _jdbcTemplate.query(sql, new MapperHoaDon());
		return list;
	}
	
	public HoaDon GetHoaDonByMaHoaDon(int maHoaDon)
	{
		List<HoaDon> list = new ArrayList<HoaDon>();
		String sql = "SELECT * FROM HoaDon WHERE MaHoaDon = " + maHoaDon;
		list = _jdbcTemplate.query(sql, new MapperHoaDon());
		return list.get(0);
	}
	
	public List<HoaDon> GetDataHoaDonCuaIDTK(int ID)
	{
		List<HoaDon> list = new ArrayList<HoaDon>();
		String sql = "SELECT * FROM HoaDon Where ID = " + ID;
		list = _jdbcTemplate.query(sql, new MapperHoaDon());
		return list;
	}

	public int TaoHoaDon(int Id, HashMap<Integer, ChiTietHoaDon> hoaDon_DanhSachSanPham, int maThongTinKhachHangDat) {
		int tongTien = 0;
		for(Map.Entry<Integer, ChiTietHoaDon> dongHoaDon : hoaDon_DanhSachSanPham.entrySet())
		{
			tongTien += dongHoaDon.getValue().getSoLuong()
					*dongHoaDon.getValue().getSanPham().getSanPham().getGia();
		}
		
		String trangThai = "Chờ xác nhận";
		String sql = "INSERT INTO HoaDon(TongTien, NgayLapHoaDon, TrangThai, MaThongTinKhachHangDat, ID) VALUES "
				+ "("+ tongTien + ", GETDATE(), N'"+ trangThai + "', " 
				+ maThongTinKhachHangDat + ", "+ Id + ")";
		
		
		int maHoaDon = GetIDLastest(sql);
		
		for(Map.Entry<Integer, ChiTietHoaDon> dongHoaDon : hoaDon_DanhSachSanPham.entrySet())
		{
			sql = "INSERT INTO ChiTietHoaDon VALUES ("+ maHoaDon +", "
					+ dongHoaDon.getValue().getSanPham().getSanPham().getMaSanPham() +", "+ dongHoaDon.getValue().getSoLuong() +")";
			_jdbcTemplate.update(sql);
		}
		return 1;
	}
	
	
	public int GetIDLastest(final String sql_)
	{
		KeyHolder keyHolder = new GeneratedKeyHolder();

		_jdbcTemplate.update(
		  new PreparedStatementCreator() {
		    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
		      return connection.prepareStatement(sql_, new String[] {"id"});
		    }
		  }, keyHolder);

		return keyHolder.getKey().intValue();
	}
	
	public List<HoaDonDto> GetHoaDonByID(int id)
	{
		List<HoaDonDto> list = new ArrayList<HoaDonDto>();
		String sql = "SELECT HoaDon.MaHoaDon, HoaDon.TongTien, HoaDon.NgayLapHoaDon, HoaDon.TrangThai, " + 
				"	SanPham.MaSanPham, SanPham.TenSanPham, SanPham.Gia, ThongTinLienHe_KhachHang.HoTen, " + 
				"	ThongTinKhachHangDat.MaThongTinKhachHangDat, ThongTinKhachHangDat.DiaChi, ThongTinKhachHangDat.SoDienThoai, ChiTietHoaDon.SoLuong " + 
				"FROM HoaDon INNER JOIN ThongTinLienHe_KhachHang ON HoaDon.MaThongTinKhachHangDat = ThongTinKhachHangDat.MaThongTinKhachHangDat " + 
				"INNER JOIN ChiTietHoaDon ON HoaDon.MaHoaDon = ChiTietHoaDon.MaHoaDon " + 
				"INNER JOIN SanPham ON SanPham.MaSanPham = ChiTietHoaDon.MaSanPham "
				+"WHERE HoaDon.MaHoaDon = " + id;
		list = _jdbcTemplate.query(sql, new MapperHoaDonDto());
		return list;
	}
	
	public int XacNhanDon(int id)
	{
		String sql = "UPDATE HoaDon SET HoaDon.TrangThai = N'Xác nhận' WHERE HoaDon.MaHoaDon = " + id;
		int check = _jdbcTemplate.update(sql);
		return check;
	}
	
	public int HuyDon(int id)
	{
		String sql = "UPDATE HoaDon SET HoaDon.TrangThai = N'Hủy' WHERE HoaDon.MaHoaDon = " + id;
		int check = _jdbcTemplate.update(sql);
		return check;
	}
	
	public int ChinhSuaDonHang(int id, HoaDonDto hoaDon)
	{
		String sql = "UPDATE ThongTinLienHe_KhachHang SET HoTen = '"+ hoaDon.getHoTen()+"', DiaChi ='"+ hoaDon.getDiaChi()
					+"', SoDienThoai = '"+hoaDon.getSoDienThoai()+"' "
					+ "WHERE MaThongTinKhachHangDat = " + hoaDon.getMaThongTinKhachHangDat();
		String sql_ = "UPDATE HoaDon SET HoaDon.NgayLapHoaDon = '"+hoaDon.getNgayLapHoaDon()+"' WHERE HoaDon.MaHoaDon = " + id;
		int check = _jdbcTemplate.update(sql);
		check = _jdbcTemplate.update(sql_);
		return check;
	}

	public List<HoaDon> GetDataHoaDonTheoTrangThai(String trangThai) {
		List<HoaDon> list = new ArrayList<HoaDon>();
		String sql= "SELECT * FROM HoaDon";
		if(trangThai.equals("ChoXacNhan"))
		{
			sql =  "SELECT * FROM HoaDon WHERE TrangThai = N'Chờ xác nhận'";
		}else if(trangThai.equals("XacNhan"))
		{
			sql =  "SELECT * FROM HoaDon WHERE TrangThai = N'Xác nhận'";
		}else if(trangThai.equals("Huy"))
		{
			sql =  "SELECT * FROM HoaDon WHERE TrangThai = N'Hủy'";
		}
		
		list = _jdbcTemplate.query(sql, new MapperHoaDon());
		return list;
	}

	public int TongSanPhamBanThangNay() {
		List<SoLuong> list = new ArrayList<SoLuong>();
		String sql = "SELECT Sum(SoLuong) AS SoLuong " + 
				"FROM HoaDon inner join ChiTietHoaDon on HoaDon.MaHoaDon = ChiTietHoaDon.MaHoaDon " + 
				"WHERE MONTH(NgayLapHoaDon) = MONTH(GETDATE()) AND YEAR(NgayLapHoaDon) = YEAR(GETDATE())";
		list = _jdbcTemplate.query(sql, new MapperSoLuong());
		return list.get(0).getSoLuong();
	}

	public int TongHoaDonBanThangNay() {
		List<SoLuong> list = new ArrayList<SoLuong>();
		String sql = "SELECT Count(*) SoLuong " + 
				"FROM HoaDon " + 
				"WHERE MONTH(NgayLapHoaDon) = MONTH(GETDATE()) AND YEAR(NgayLapHoaDon) = YEAR(GETDATE())";
		list = _jdbcTemplate.query(sql, new MapperSoLuong());
		return list.get(0).getSoLuong();
	}
	
	public int TongTienBanThangNay() {
		List<SoLuong> list = new ArrayList<SoLuong>();
		String sql = "SELECT sum(TongTien) AS SoLuong " + 
				"FROM HoaDon " + 
				"WHERE MONTH(NgayLapHoaDon) = MONTH(GETDATE()) AND YEAR(NgayLapHoaDon) = YEAR(GETDATE())";
		list = _jdbcTemplate.query(sql, new MapperSoLuong());
		return list.get(0).getSoLuong();
	}
	
	public SanPhamDto2 SanPhamBanChayThangNay() {
		List<SanPhamDto2> list = new ArrayList<SanPhamDto2>();
		String sql = "SELECT SanPham.MaSanPham, TenSanPham, Sum(SoLuong) AS SoLuong " + 
				"FROM HoaDon inner join ChiTietHoaDon on HoaDon.MaHoaDon = ChiTietHoaDon.MaHoaDon " + 
				"inner join SanPham on ChiTietHoaDon.MaSanPham = SanPham.MaSanPham " + 
				"WHERE MONTH(NgayLapHoaDon) = MONTH(GETDATE()) AND YEAR(NgayLapHoaDon) = YEAR(GETDATE()) " + 
				"group by  SanPham.MaSanPham, TenSanPham " + 
				"ORDER BY  Sum(SoLuong) DESC";
		list = _jdbcTemplate.query(sql, new MapperSanPhamDto2());
		
		return list.get(0);
	}
}
