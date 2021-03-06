package MiuMiuShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import MiuMiuShop.Dto.PaginatesDto;
import MiuMiuShop.Service.LoaiSanPhamServiceImpl;
import MiuMiuShop.Service.PaginatesServiceImpl;
import MiuMiuShop.Service.SanPhamServiceImpl;

@Controller
public class LoaiSanPhamController extends BaseController {

	@Autowired
	private LoaiSanPhamServiceImpl loaiSanPhamSevice;
	@Autowired
	private SanPhamServiceImpl sanPhamService;
	@Autowired
	private PaginatesServiceImpl paginateService;

	private int tongSanPham1Trang = 12;

	@RequestMapping(value = "tat-ca-san-pham")
	public ModelAndView Index() {

		_mvShare.setViewName("user/sanpham/tatcasanpham");

		int totalData = loaiSanPhamSevice.LayDanhSachSanPham().size();
		_mvShare.addObject("tongSanPham", totalData);
		PaginatesDto paginateInfo = paginateService.GetInfoPaginates(totalData, tongSanPham1Trang, 1);
		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("tatCaSanPhamCungLoaiTrong1Trang",
				loaiSanPhamSevice.GetDataSanPhamPaginate(paginateInfo.getStart(), paginateInfo.getEnd()));
		
		_mvShare.addObject("sanPhamMoi", sanPhamService.GetDataSanPhamMoi());

		return _mvShare;
	}
	
	@RequestMapping(value = "tat-ca-san-pham/{currentPage}")
	public ModelAndView Index(@PathVariable String currentPage) {
		_mvShare.setViewName("user/sanpham/tatcasanpham");

		int totalData = loaiSanPhamSevice.LayDanhSachSanPham().size();
		_mvShare.addObject("tongSanPham", totalData);
		PaginatesDto paginateInfo = paginateService.GetInfoPaginates(totalData, tongSanPham1Trang, Integer.parseInt(currentPage));
		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("tatCaSanPhamCungLoaiTrong1Trang",
				loaiSanPhamSevice.GetDataSanPhamPaginate(paginateInfo.getStart(), paginateInfo.getEnd()));
		
		_mvShare.addObject("sanPhamMoi", sanPhamService.GetDataSanPhamMoi());

		return _mvShare;
	}
	
	

	@RequestMapping(value = "loai-san-pham/{id}")
	public ModelAndView SanPham(@PathVariable String id) {

		_mvShare.setViewName("user/sanpham/loaisanpham");

		int totalData = loaiSanPhamSevice.LayDanhSachSanPhamCungLoaiByID(Integer.parseInt(id)).size();
		_mvShare.addObject("tongSanPham", totalData);
		_mvShare.addObject("tenLoaiSanPham", loaiSanPhamSevice.LayDanhSachSanPhamCungLoaiByID(Integer.parseInt(id)).get(0).getLoaiSanPham().getTenLoaiSanPham());
		PaginatesDto paginateInfo = paginateService.GetInfoPaginates(totalData, tongSanPham1Trang, 1);
		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("maLoaiSanPham", id);
		_mvShare.addObject("tatCaSanPhamCungLoaiTrong1Trang", loaiSanPhamSevice
				.GetDataSanPhamPaginateById(Integer.parseInt(id), paginateInfo.getStart(), paginateInfo.getEnd()));
		
		_mvShare.addObject("sanPhamMoi", sanPhamService.GetDataSanPhamMoi());

		return _mvShare;
	}

	@RequestMapping(value = "/loai-san-pham/{id}/{currentPage}")
	public ModelAndView SanPham(@PathVariable String id, @PathVariable String currentPage) {
		_mvShare.setViewName("user/sanpham/loaisanpham");

		int totalData = loaiSanPhamSevice.LayDanhSachSanPhamCungLoaiByID(Integer.parseInt(id)).size();
		_mvShare.addObject("tongSanPham", totalData);
		_mvShare.addObject("tenLoaiSanPham", loaiSanPhamSevice.LayDanhSachSanPhamCungLoaiByID(Integer.parseInt(id)).get(0).getLoaiSanPham().getTenLoaiSanPham());
		PaginatesDto paginateInfo = paginateService.GetInfoPaginates(totalData, tongSanPham1Trang,
				Integer.parseInt(currentPage));
		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("maLoaiSanPham", id);
		_mvShare.addObject("tatCaSanPhamCungLoaiTrong1Trang", loaiSanPhamSevice
				.GetDataSanPhamPaginateById(Integer.parseInt(id), paginateInfo.getStart(), paginateInfo.getEnd()));
		
		_mvShare.addObject("sanPhamMoi", sanPhamService.GetDataSanPhamMoi());

		return _mvShare;
	}
}