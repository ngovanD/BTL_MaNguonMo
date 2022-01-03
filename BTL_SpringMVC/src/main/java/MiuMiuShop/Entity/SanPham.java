package MiuMiuShop.Entity;

import java.sql.Date;

public class SanPham {
	private int maSanPham;
	private String tenSanPham;
	private String hinhAnh;
	private int gia;
	private int giaGiam;
	private int soLuongCon;
	private String moTa;
	private Date ngayTao;
	private Date ngayCapNhat;
	private boolean sanPhamMoi;
	private boolean noiBat;
	private int maLoaiSanPham;
	public SanPham() {
		super();
	}
	public int getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public int getGiaGiam() {
		return giaGiam;
	}
	public void setGiaGiam(int giaGiam) {
		this.giaGiam = giaGiam;
	}
	public int getSoLuongCon() {
		return soLuongCon;
	}
	public void setSoLuongCon(int soLuongCon) {
		this.soLuongCon = soLuongCon;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public Date getNgayTao() {
		return ngayTao;
	}
	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}
	public Date getNgayCapNhat() {
		return ngayCapNhat;
	}
	public void setNgayCapNhat(Date ngayCapNhat) {
		this.ngayCapNhat = ngayCapNhat;
	}
	public boolean isSanPhamMoi() {
		return sanPhamMoi;
	}
	public void setSanPhamMoi(boolean sanPhamMoi) {
		this.sanPhamMoi = sanPhamMoi;
	}
	public boolean isNoiBat() {
		return noiBat;
	}
	public void setNoiBat(boolean noiBat) {
		this.noiBat = noiBat;
	}
	public int getMaLoaiSanPham() {
		return maLoaiSanPham;
	}
	public void setMaLoaiSanPham(int maLoaiSanPham) {
		this.maLoaiSanPham = maLoaiSanPham;
	}
}
