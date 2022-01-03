package MiuMiuShop.Entity;

public class ThongTinShop {
	private int maLienheShop;
	private String diaChi;
	private String email;
	private String soDienThoai;
	private String tenShop;
	public ThongTinShop() {
		super();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMaLienheShop() {
		return maLienheShop;
	}
	public void setMaLienheShop(int maLienheShop) {
		this.maLienheShop = maLienheShop;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getTenShop() {
		return tenShop;
	}
	public void setTenShop(String tenShop) {
		this.tenShop = tenShop;
	}
}
