package MiuMiuShop.Entity;

public class ThongTinKhachHangDat {
	private int maThongTinKhachHangDat;
	private String hoTen;
	private String diaChi;
	private String soDienThoai;
	public ThongTinKhachHangDat() {
		super();
	}
	
	public int getMaThongTinKhachHangDat() {
		return maThongTinKhachHangDat;
	}

	public void setMaThongTinKhachHangDat(int maThongTinKhachHangDat) {
		this.maThongTinKhachHangDat = maThongTinKhachHangDat;
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
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
}
