package MiuMiuShop.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import MiuMiuShop.Entity.Slide;

@Service
public interface ISlideService {
	public List<Slide> LayDanhSachSlideHienThi();
	public List<Slide> LayDanhSachSlide();
	public int SuaSlide(int id, Slide slide);
	public int XoaSlide(int id);
	public int TaoSlide(Slide slide);
	public Slide GetDataSlideById(int id);
}
