package MiuMiuShop.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import MiuMiuShop.Entity.MapperThongTinKhachHangDat;
import MiuMiuShop.Entity.ThongTinKhachHangDat;

@Repository
public class ThongTinKhachHangDatDao extends BaseDao{
	public List<ThongTinKhachHangDat> GetDataThongTinLienHe_KhachHang()
	{
		List<ThongTinKhachHangDat> list = new ArrayList<ThongTinKhachHangDat>();
		String sql = "SELECT * FROM ThongTinKhachHangDat";
		list = _jdbcTemplate.query(sql, new MapperThongTinKhachHangDat());
		return list;
	}
	
	public int TaoDataThongTinLienHe_KhachHang(ThongTinKhachHangDat thongTinLienHe_KhachHang)
	{
		final String insertIntoSql = "INSERT INTO ThongTinKhachHangDat (HoTen, DiaChi, SoDienThoai) "
				+ "VALUES('"+ thongTinLienHe_KhachHang.getHoTen() +"', '"
				+ thongTinLienHe_KhachHang.getDiaChi()+ "', '"
				+ thongTinLienHe_KhachHang.getSoDienThoai() +"')";
		KeyHolder keyHolder = new GeneratedKeyHolder();

		_jdbcTemplate.update(
		  new PreparedStatementCreator() {
		    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
		      return connection.prepareStatement(insertIntoSql, new String[] {"id"});
		    }
		  }, keyHolder);

		return keyHolder.getKey().intValue();
	}

	public ThongTinKhachHangDat GetThongTinKhachHangDat(int maThongTinKhachHangDat) {
		List<ThongTinKhachHangDat> list = new ArrayList<ThongTinKhachHangDat>();
		String sql = "SELECT * FROM ThongTinKhachHangDat WHERE MaThongTinKhachHangDat = " + maThongTinKhachHangDat;
		list = _jdbcTemplate.query(sql, new MapperThongTinKhachHangDat());
		return list.get(0);
	}
}
