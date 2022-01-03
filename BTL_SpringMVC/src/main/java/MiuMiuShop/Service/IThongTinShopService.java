package MiuMiuShop.Service;

import org.springframework.stereotype.Service;

import MiuMiuShop.Entity.ThongTinShop;

@Service
public interface IThongTinShopService {
	public ThongTinShop LayThongTinShop();
	public int SuaThongTinShop(ThongTinShop thongTinShop);
}
