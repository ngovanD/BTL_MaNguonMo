package MiuMiuShop.Entity;

public class Slide {
	private int maSlide;
	private String tenSlide;
	private String hinhAnh;
	private String noiDung;
	private String link;
	private boolean trangThai;

	public Slide() {
		super();
	}

	public int getMaSlide() {
		return maSlide;
	}

	public void setMaSlide(int maSlide) {
		this.maSlide = maSlide;
	}

	public String getTenSlide() {
		return tenSlide;
	}

	public void setTenSlide(String tenSlide) {
		this.tenSlide = tenSlide;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

}
