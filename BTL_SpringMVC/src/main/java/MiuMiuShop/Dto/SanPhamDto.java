package MiuMiuShop.Dto;

import MiuMiuShop.Entity.LoaiSanPham;
import MiuMiuShop.Entity.SanPham;

public class SanPhamDto {
	private SanPham sanPham;
	private LoaiSanPham loaiSanPham;
	public SanPhamDto() {
		super();
	}
	public SanPham getSanPham() {
		return sanPham;
	}
	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
	public LoaiSanPham getLoaiSanPham() {
		return loaiSanPham;
	}
	public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}
	
	
}
