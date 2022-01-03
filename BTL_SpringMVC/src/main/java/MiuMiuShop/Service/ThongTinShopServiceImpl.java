package MiuMiuShop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiuMiuShop.Dao.ThongTinShopDao;
import MiuMiuShop.Entity.ThongTinShop;

@Service
public class ThongTinShopServiceImpl implements IThongTinShopService{

	@Autowired
	ThongTinShopDao thongTinShopDao;
	public ThongTinShop LayThongTinShop() {
		// TODO Auto-generated method stub
		return thongTinShopDao.LayThongTinShop();
	}
	
	public int SuaThongTinShop(ThongTinShop thongTinShop) {
		return thongTinShopDao.SuaThongTinShop(thongTinShop);
	}

}
