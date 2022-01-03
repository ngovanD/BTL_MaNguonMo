package MiuMiuShop.Dto;

public class LoaiSanPhamDto {
	private int maLoaiSanPham;
	private String tenLoaiSanPham;
	private int soLuongSanPham;
	public LoaiSanPhamDto() {
		super();
	}
	public int getMaLoaiSanPham() {
		return maLoaiSanPham;
	}
	public void setMaLoaiSanPham(int maLoaiSanPham) {
		this.maLoaiSanPham = maLoaiSanPham;
	}
	public String getTenLoaiSanPham() {
		return tenLoaiSanPham;
	}
	public void setTenLoaiSanPham(String tenLoaiSanPham) {
		this.tenLoaiSanPham = tenLoaiSanPham;
	}
	public int getSoLuongSanPham() {
		return soLuongSanPham;
	}
	public void setSoLuongSanPham(int soLuongSanPham) {
		this.soLuongSanPham = soLuongSanPham;
	}
}
