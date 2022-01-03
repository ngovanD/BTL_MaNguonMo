package MiuMiuShop.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import MiuMiuShop.Dto.SanPhamDto;
import MiuMiuShop.Entity.MapperSanPham;
import MiuMiuShop.Entity.SanPham;

@Service
public interface ISanPhamService  {
	public SanPhamDto LaySanPhamByID(int id);
	public List<SanPham> GetDataSanPhamNoiBat();
	public List<SanPham> GetDataSanPhamMoi();
	public List<SanPham> GetDataSanPhamNgauNghien();
	public List<SanPham> LaySanPhamByTen(String text);
	
	public List<SanPham> LayDanhSachSanPham(); 
	public int TaoSanPham(SanPham sanPham);
}