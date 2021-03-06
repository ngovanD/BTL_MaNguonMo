package MiuMiuShop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MiuMiuShop.Dao.LoaiSanPhamDao;
import MiuMiuShop.Dao.SanPhamDao;
import MiuMiuShop.Dto.LoaiSanPhamDto;
import MiuMiuShop.Dto.SanPhamDto;
import MiuMiuShop.Entity.LoaiSanPham;
@Service
public class LoaiSanPhamServiceImpl implements ILoaiSanPhamService{
	@Autowired
	private SanPhamDao sanPhamDao; 
	@Autowired
	private LoaiSanPhamDao loaiSanPhamDao; 
	
	
	
	public List<SanPhamDto> LayDanhSachSanPham() {
		return sanPhamDao.GetDataSanPhamDto();
	}
	
	public List<SanPhamDto> LayDanhSachSanPhamCungLoaiByID(int id) {
		return sanPhamDao.GetDataAllSanPhamByID(id);
	}
	
	public List<SanPhamDto> GetDataSanPhamPaginate(int start, int end)
	{
		return sanPhamDao.GetDataSanPhamPaginate(start, end);
	}
	
	public List<SanPhamDto> GetDataSanPhamPaginateById(int id, int start, int end)
	{
		return sanPhamDao.GetDataSanPhamPaginateById(id, start, end);
	}
	

	public List<LoaiSanPhamDto> GetDataLoaiSanPham() {
		// TODO Auto-generated method stub
		return loaiSanPhamDao.GetDataLoaiSanPham();
	}

	public int ThemLoaiSanPham(LoaiSanPham loaiSanPham) {
		// TODO Auto-generated method stub
		return loaiSanPhamDao.ThemLoaiSanPham(loaiSanPham);
	}

	public int SuaLoaiSanPham(int id, LoaiSanPhamDto loaiSanPham) {
		// TODO Auto-generated method stub
		return loaiSanPhamDao.SuaLoaiSanPham(id, loaiSanPham);
	}

	public int XoaLoaiSanPham(int id) {
		// TODO Auto-generated method stub
		return loaiSanPhamDao.XoaLoaiSanPham(id);
	}

	public LoaiSanPhamDto LayLoaiSanPhamTheoID(int id) {
		// TODO Auto-generated method stub
		return loaiSanPhamDao.LayLoaiSanPhamTheoID(id);
	}

}

