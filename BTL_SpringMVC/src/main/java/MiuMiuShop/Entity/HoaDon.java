package MiuMiuShop.Entity;

import java.sql.Date;

public class HoaDon {
	private int maHoaDon;
	private int tongTien;
	private Date ngayLapHoaDon;
	private String trangThai;
	private int maThongTinTinKhachHangDat;
	private int id; //id tai khoan
	public HoaDon() {
		super();
	}
	public int getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public int getTongTien() {
		return tongTien;
	}
	public void setTongTien(int tongTien) {
		this.tongTien = tongTien;
	}
	public Date getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}
	public void setNgayLapHoaDon(Date ngayLapHoaDon) {
		this.ngayLapHoaDon = ngayLapHoaDon;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public int getMaThongTinTinKhachHangDat() {
		return maThongTinTinKhachHangDat;
	}
	public void setMaThongTinTinKhachHangDat(int maThongTinTinKhachHangDat) {
		this.maThongTinTinKhachHangDat = maThongTinTinKhachHangDat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
