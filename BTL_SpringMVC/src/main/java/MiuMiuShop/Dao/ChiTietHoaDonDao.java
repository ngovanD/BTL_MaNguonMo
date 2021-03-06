package MiuMiuShop.Dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import MiuMiuShop.Dto.MapperSanPhamDto;
import MiuMiuShop.Dto.SanPhamDto;
import MiuMiuShop.Entity.ChiTietHoaDon;
import MiuMiuShop.Entity.MapperChiTietHoaDon;


@Repository
public class ChiTietHoaDonDao extends BaseDao 
{
	@Autowired
	SanPhamDao sanPhamDao = new SanPhamDao();
	public HashMap<Integer, ChiTietHoaDon> ThemVaoDongHoaDon(int maSanPham, HashMap<Integer, ChiTietHoaDon> hoaDon) {
		ChiTietHoaDon dongHoaDon = new ChiTietHoaDon();
		SanPhamDto sanPham = sanPhamDao.Find1SanPhamByID(maSanPham);
		if(sanPham != null && !hoaDon.containsKey(maSanPham))
		{
			dongHoaDon.setSanPham(sanPham);
			dongHoaDon.setSoLuong(1);
		}
		
		if(sanPham != null && hoaDon.containsKey(maSanPham))
		{
			dongHoaDon = hoaDon.get(maSanPham);
			dongHoaDon.setSoLuong(dongHoaDon.getSoLuong()+1);
		}
		hoaDon.put(maSanPham, dongHoaDon);
		return hoaDon;
	}
	
	public HashMap<Integer, ChiTietHoaDon> SuaDongHoaDon(int maSanPham, int soLuong, HashMap<Integer, ChiTietHoaDon> hoaDon) {
		
		if(soLuong <= 0)
		{
			hoaDon.remove(maSanPham);
			return hoaDon;
		}
		
		if(hoaDon == null)
		{
			return hoaDon;
		}
		
		ChiTietHoaDon dongHoaDon = new ChiTietHoaDon();
		if(hoaDon.containsKey(maSanPham))
		{
			dongHoaDon = hoaDon.get(maSanPham);
			dongHoaDon.setSoLuong(soLuong);
		}

		hoaDon.put(maSanPham, dongHoaDon);
		return hoaDon;
	}
	
	public HashMap<Integer, ChiTietHoaDon> XoaDongHoaDon(int maSanPham, HashMap<Integer, ChiTietHoaDon> hoaDon) {
		if(hoaDon == null)
		{
			return hoaDon;
		}
		
		if(hoaDon.containsKey(maSanPham))
		{
			hoaDon.remove(maSanPham);
		}
		return hoaDon;
	}
	
	public int TongSoSanPham(HashMap<Integer, ChiTietHoaDon> hoaDon)
	{
		int result = 0;
		for(Map.Entry<Integer, ChiTietHoaDon> dongHoaDon : hoaDon.entrySet())
		{
			result += dongHoaDon.getValue().getSoLuong();
		}
		
		return result;
	}
	
	
	public int TongTienCacSanPham(HashMap<Integer, ChiTietHoaDon> hoaDon)
	{
		int result = 0;
		for(Map.Entry<Integer, ChiTietHoaDon> dongHoaDon : hoaDon.entrySet())
		{
			result += dongHoaDon.getValue().getSoLuong()
					*dongHoaDon.getValue().getSanPham().getSanPham().getGia();
		}
		
		return result;
	}
	
	public List<ChiTietHoaDon> GetDataHoaDonByMaHoaDon(int maHoaDon)
	{
		List<ChiTietHoaDon> list = new ArrayList<ChiTietHoaDon>();
		String sql = "SELECT SanPham.MaSanPham, TenSanPham, Gia, SoLuong, MaHoaDon " + 
				"FROM SanPham INNER JOIN ChiTietHoaDon ON SanPham.MaSanPham = ChiTietHoaDon.MaSanPham " + 
				"WHERE MaHoaDon = " + maHoaDon;
		list = _jdbcTemplate.query(sql, new MapperChiTietHoaDon());
		return list;
	}
}
