package MiuMiuShop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiuMiuShop.Dao.SlideDao;
import MiuMiuShop.Entity.Slide;

@Service
public class SlideServiceImpl implements ISlideService{
	@Autowired
	private SlideDao slideDao;
	
	
	public List<Slide> LayDanhSachSlide(){
		return slideDao.LayDanhSachSlide();
	}

	public List<Slide> LayDanhSachSlideHienThi() {
		// TODO Auto-generated method stub
		return slideDao.LayDanhSachSlideHienThi();
	}
	
	public int SuaSlide(int id, Slide slide) {
		return slideDao.SuaSlide(id, slide);
	}
	
	public int XoaSlide(int id) {
		return slideDao.XoaSlide(id);
	}
	
	public int TaoSlide(Slide slide) {
		return slideDao.TaoSlide(slide);
	}
	
	public Slide GetDataSlideById(int id) {
		return slideDao.GetDataSlideById(id);
	}

}
