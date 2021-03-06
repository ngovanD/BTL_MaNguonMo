package MiuMiuShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import MiuMiuShop.Entity.MapperSlide;
import MiuMiuShop.Entity.Slide;

@Repository
public class SlideDao extends BaseDao{
	
	public List<Slide> LayDanhSachSlide() {
		List<Slide> list = new ArrayList<Slide>();
		String sql = "SELECT * FROM Slide ";
		list = _jdbcTemplate.query(sql, new MapperSlide());
		return list;
	}
	
	public List<Slide> LayDanhSachSlideHienThi() {
		List<Slide> list = new ArrayList<Slide>();
		String sql = "SELECT * FROM Slide "
				+ "WHERE TrangThai = '1'"; //Trang thai 0 la an 1 la hien thi
		list = _jdbcTemplate.query(sql, new MapperSlide());
		return list;
	}
	
	public Slide GetDataSlideById(int id)
	{
		List<Slide> list = new ArrayList<Slide>();
		String sql = "SELECT * FROM Slide WHERE MaSlide = " + id;
		list = _jdbcTemplate.query(sql, new MapperSlide());
		return list.get(0);
	}

	public int SuaSlide(int id, Slide slide) {
		// TODO Auto-generated method stub
		String sql = "UPDATE Slide SET TenSlide = N'" + slide.getTenSlide()/* + "', HinhAnh = '" +slide.getHinhAnh() */
				+ "', NoiDung = N'" +slide.getNoiDung()+ "', Link = '" +slide.getLink()+"', TrangThai = N'"+slide.isTrangThai()+"' "
				+ "WHERE MaSlide = " + id;
		int check = _jdbcTemplate.update(sql);
		return check;
	}
	
	public int XoaSlide(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM Slide "
					+ "WHERE MaSlide = " + id;
		int check = _jdbcTemplate.update(sql);
		return check;
	}

	public int TaoSlide(Slide slide) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO Slide VALUES(N'"+slide.getTenSlide()+"', '"
						+slide.getHinhAnh()+"', N'"+slide.getNoiDung()+"', '"
						+slide.getLink()+"', N'"+slide.isTrangThai()+"')";
		int check = _jdbcTemplate.update(sql);
		return check;
	}
}
