package MiuMiuShop.Entity;

import MiuMiuShop.Dto.SanPhamDto;

public class ChiTietHoaDon {
	private int maHoaDon;
	private SanPhamDto sanPham;
	private int soLuong;
	public ChiTietHoaDon() {
	}
	public int getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public SanPhamDto getSanPham() {
		return sanPham;
	}
	public void setSanPham(SanPhamDto sanPham) {
		this.sanPham = sanPham;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	

}
