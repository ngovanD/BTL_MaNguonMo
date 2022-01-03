package MiuMiuShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import MiuMiuShop.Dto.LoaiSanPhamDto;
import MiuMiuShop.Dto.MapperLoaiSanPhamDto;
import MiuMiuShop.Entity.LoaiSanPham;
import MiuMiuShop.Entity.MapperLoaiSanPham;

@Repository
public class LoaiSanPhamDao extends BaseDao{

	public List<LoaiSanPhamDto> GetDataLoaiSanPham()
	{
		List<LoaiSanPhamDto> list = new ArrayList<LoaiSanPhamDto>();
		String sql = "SELECT LoaiSanPham.MaLoaiSanPham, LoaiSanPham.TenLoaiSanPham, COUNT(SanPham.MaSanPham) AS SoLuongSanPham " + 
				"FROM LoaiSanPham left join SanPham on LoaiSanPham.MaLoaiSanPham = SanPham.MaLoaiSanPham " + 
				"GROUP BY LoaiSanPham.MaLoaiSanPham, LoaiSanPham.TenLoaiSanPham";
		list = _jdbcTemplate.query(sql, new MapperLoaiSanPhamDto());
		return list;
	}
	
	public LoaiSanPhamDto LayLoaiSanPhamTheoID(int id)
	{
		List<LoaiSanPhamDto> list = new ArrayList<LoaiSanPhamDto>();
		String sql = "SELECT LoaiSanPham.MaLoaiSanPham, LoaiSanPham.TenLoaiSanPham, COUNT(SanPham.MaSanPham) AS SoLuongSanPham " + 
				"FROM LoaiSanPham left join SanPham on LoaiSanPham.MaLoaiSanPham = SanPham.MaLoaiSanPham " + 
				"WHERE LoaiSanPham.MaLoaiSanPham = " + id + "  "+
				"GROUP BY LoaiSanPham.MaLoaiSanPham, LoaiSanPham.TenLoaiSanPham";
		list = _jdbcTemplate.query(sql, new MapperLoaiSanPhamDto());
		return list.get(0);
	}
	
	public int ThemLoaiSanPham(LoaiSanPham loaiSanPham)
	{
		String sql = "INSERT INTO LoaiSanPham VALUES(N'"+loaiSanPham.getTenLoaiSanPham()+"')";
		int check = _jdbcTemplate.update(sql);
		return check;
	}
	
	public int SuaLoaiSanPham(int id, LoaiSanPhamDto loaiSanPhamDto)
	{
		String sql = "UPDATE LoaiSanPham SET TenLoaiSanPham = N'" + loaiSanPhamDto.getTenLoaiSanPham() +"'";
		int check = _jdbcTemplate.update(sql);
		return check;
	}
	
	public int XoaLoaiSanPham(int id)
	{
		String sql = "DELETE FROM LoaiSanPham "
				+ "WHERE MaLoaiSanPham = " + id;
		int check = _jdbcTemplate.update(sql);
		return check;
	}
}
