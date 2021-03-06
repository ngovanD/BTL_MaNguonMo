package MiuMiuShop.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import MiuMiuShop.Dto.LoaiSanPhamDto;
import MiuMiuShop.Dto.SanPhamDto;
import MiuMiuShop.Entity.LoaiSanPham;

@Service
public interface ILoaiSanPhamService {
	public List<SanPhamDto> LayDanhSachSanPhamCungLoaiByID(int id);
	public List<SanPhamDto> GetDataSanPhamPaginate(int start, int end);
	public List<SanPhamDto> GetDataSanPhamPaginateById(int id, int start, int end);
	
	public List<LoaiSanPhamDto> GetDataLoaiSanPham();
	public LoaiSanPhamDto LayLoaiSanPhamTheoID(int id);
	public int ThemLoaiSanPham(LoaiSanPham loaiSanPham);
	public int SuaLoaiSanPham(int id, LoaiSanPhamDto loaiSanPhamDto);
	public int XoaLoaiSanPham(int id);
}