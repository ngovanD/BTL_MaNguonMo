package MiuMiuShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import MiuMiuShop.Entity.LoaiSanPham;
import MiuMiuShop.Entity.MapperLoaiSanPham;

@Repository
public class LoaiSanPhamDao extends BaseDao{

	public List<LoaiSanPham> GetDataLoaiSanPham()
	{
		List<LoaiSanPham> list = new ArrayList<LoaiSanPham>();
		String sql = "SELECT * FROM LoaiSanPham";
		list = _jdbcTemplate.query(sql, new MapperLoaiSanPham());
		return list;
	}
}
