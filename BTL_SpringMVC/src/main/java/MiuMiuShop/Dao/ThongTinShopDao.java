package MiuMiuShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import MiuMiuShop.Entity.MapperThongTinShop;
import MiuMiuShop.Entity.ThongTinShop;

@Repository
public class ThongTinShopDao extends BaseDao{
	public ThongTinShop LayThongTinShop()
	{
		List<ThongTinShop> list = new ArrayList<ThongTinShop>();
		String sql = "SELECT * FROM ThongTinShop";
		list = _jdbcTemplate.query(sql, new MapperThongTinShop());
		return list.get(0);
	}
	
	public int SuaThongTinShop(ThongTinShop thongTinShop) {
		// TODO Auto-generated method stub
		String sql = "UPDATE ThongTinShop SET DiaChi = N'" + thongTinShop.getDiaChi() 
		+"', SoDienThoai = '"+ thongTinShop.getSoDienThoai()+"', TenShop = N'" + thongTinShop.getTenShop()+"', Email = '"+thongTinShop.getEmail() + "'";  
		int check = _jdbcTemplate.update(sql);
		return check;
	}
}
