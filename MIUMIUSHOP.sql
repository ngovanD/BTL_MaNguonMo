CREATE DATABASE MIUMIUSHOP
GO

USE MIUMIUSHOP
GO

CREATE TABLE Slide(
	MaSlide int IDENTITY(1,1) PRIMARY KEY,
	TenSlide nvarchar(100),
	HinhAnh varchar(100),
	NoiDung nvarchar(300),
	Link nvarchar(100),
	TrangThai BIT
)

CREATE TABLE TaiKhoan(
	ID int IDENTITY(1,1) PRIMARY KEY,
	Email varchar(30) UNIQUE NOT NULL,
	HoTen nvarchar(100),
	MatKhau varchar(30) NOT NULL,
	LoaiTaiKhoan varchar(10)
)

CREATE TABLE ThongTinShop(
	MaLienHeShop int PRIMARY KEY,
	DiaChi nvarchar(100),
	Email varchar(30),
	SoDienThoai varchar(10),
	TenShop nvarchar(300),
)

INSERT INTO ThongTinShop VALUES(1, N'Bắc Từ Liêm, Hà Nội', 'miumiushop@gmail.com', '0654684661', N'MIUMIU Quán')

CREATE TABLE LoaiSanPham(
	MaLoaiSanPham int IDENTITY(1,1) PRIMARY KEY,
	TenLoaiSanPham nvarchar(100)
)

--CREATE TABLE MENU(
--	MaDanhMuc int IDENTITY(1,1) PRIMARY KEY,
--	TenDanhMuc nvarchar(30),
--	Link varchar(100)
--)


CREATE TABLE SanPham(
	MaSanPham int IDENTITY(1,1) PRIMARY KEY,
	TenSanPham nvarchar(200),
	HinhAnh varchar(30),
	Gia int,
	GiaGiam int,
	SoLuongCon int,
	MoTa nvarchar(1000),
	NgayTao datetime,
	NgayCapNhat datetime,
	SanPhamMoi BIT,
	NoiBat BIT,
	MaLoaiSanPham int,
	FOREIGN KEY(MaLoaiSanPham) REFERENCES LoaiSanPham(MaLoaiSanPham) ON DELETE CASCADE ON UPDATE CASCADE
)


CREATE TABLE ThongTinKhachHangDat(
	MaThongTinKhachHangDat int IDENTITY(1,1) PRIMARY KEY,
	HoTen nvarchar(100),
	DiaChi nvarchar(300),
	SoDienThoai varchar(10),
)


CREATE TABLE HoaDon(
	MaHoaDon int IDENTITY(1,1) PRIMARY KEY,
	TongTien int,
	NgayLapHoaDon datetime,
	TrangThai nvarchar(30),
	MaThongTinKhachHangDat int,
	ID int,
	FOREIGN KEY(ID) REFERENCES TaiKhoan(ID) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY(MaThongTinKhachHangDat) REFERENCES ThongTinKhachHangDat(MaThongTinKhachHangDat) ON DELETE CASCADE ON UPDATE CASCADE
)

CREATE TABLE ChiTietHoaDon(
	MaHoaDon int,
	MaSanPham int,
	SoLuong int,
	FOREIGN KEY(MaHoaDon) REFERENCES HoaDon(MaHoaDon) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY(MaSanPham) REFERENCES SanPham(MaSanPham) ON DELETE CASCADE ON UPDATE CASCADE,
	PRIMARY KEY(MaHoaDon, MaSanPham)
)



INSERT INTO Slide VALUES('AAAA A', 'banner-1.jpg', 'Test thu', 'google.com', 1)
INSERT INTO Slide VALUES('BBBB BBB', 'banner-2.jpg', 'Test thu', 'google.com', 1)

INSERT INTO LoaiSanPham VALUES(N'Đồ ăn nhanh')

INSERT INTO LoaiSanPham VALUES(N'Đồ uống')

INSERT INTO LoaiSanPham VALUES(N'Combo')

INSERT INTO TaiKhoan VALUES('Admin', N'Ngô Văn Đang', '123', 'Admin')
INSERT INTO TaiKhoan VALUES('a@gmail.com', N'Ngo Van A', '123', 'User')

INSERT INTO SanPham VALUES(N'Snack khoai tảo biển 52g', 's1.jpg', 12000, 10000, 9999, N'mô tả snack', GETDATE(), GETDATE(), 1, 1, 1)
INSERT INTO SanPham VALUES(N'Snack rong biển Tao Kae', 's2.jpg', 12000, 10000, 9999, N'mô tả snack', GETDATE(), GETDATE(), 1, 1, 1)
INSERT INTO SanPham VALUES(N'Snack mì hương gà Enaak', 's3.jpg', 12000, 10000, 9999, N'mô tả snack', GETDATE(), GETDATE(), 1, 1, 1)
INSERT INTO SanPham VALUES(N'Khoai tây vị bít tết N.Y Swing', 's4.jpg', 12000, 10000, 9999, N'mô tả snack', GETDATE(), GETDATE(), 1, 1, 1)
INSERT INTO SanPham VALUES(N'Snack khoai tây phô mai', 's5.jpg', 12000, 10000, 9999, N'mô tả snack', GETDATE(), GETDATE(), 1, 1, 1)
INSERT INTO SanPham VALUES(N'Snack khoai tảo biển OStar', 's7.jpg', 12000, 10000, 9999, N'mô tả snack', GETDATE(), GETDATE(), 1, 1, 1)
INSERT INTO SanPham VALUES(N'Snack mực vị cay ngọt Bento', 's8.jpg', 12000, 10000, 9999, N'mô tả snack', GETDATE(), GETDATE(), 1, 1, 1)
INSERT INTO SanPham VALUES(N'Snack khoai tây Peke Potato', 's10.jpg', 12000, 10000, 9999, N'mô tả snack', GETDATE(), GETDATE(), 1, 1, 1)
INSERT INTO SanPham VALUES(N'Snack vị cua hiệu Kinh Đô', 's11.jpg', 12000, 10000, 9999, N'mô tả snack', GETDATE(), GETDATE(), 1, 1, 1)
INSERT INTO SanPham VALUES(N'Snack rong biển phô mai Kimmy ', 's12.jpg', 12000, 10000, 9999, N'mô tả snack', GETDATE(), GETDATE(), 1, 1, 1)
INSERT INTO SanPham VALUES(N'Snack khoai tây BBQ ', 's13.jpg', 12000, 10000, 9999, N'mô tả snack', GETDATE(), GETDATE(), 1, 1, 1)




INSERT INTO SanPham VALUES(N'Trà sữa', 'd16.jpg', 12000, 10000, 9999, N'mô tả trà sữa', GETDATE(), GETDATE(), 1, 1, 2)
INSERT INTO SanPham VALUES(N'Trà đào', 'd17.jpg', 12000, 10000, 9999, N'mô tả trà đào', GETDATE(), GETDATE(), 1, 1, 2)
INSERT INTO SanPham VALUES(N'Trà ô long', 'd18.jpg', 12000, 10000, 9999, N'mô tả trà ô long', GETDATE(), GETDATE(), 1, 1, 2)
INSERT INTO SanPham VALUES(N'Sting lon đỏ', 'd13.jpg', 12000, 10000, 9999, N'mô tả lon đỏ', GETDATE(), GETDATE(), 1, 1, 2)
INSERT INTO SanPham VALUES(N'Sting lon vàng', 'd14.jpg', 12000, 10000, 9999, N'mô tả lon vàng', GETDATE(), GETDATE(), 1, 1, 2)
INSERT INTO SanPham VALUES(N'Mirinda', 'd15.jpg', 12000, 10000, 9999, N'mô tả mirinda', GETDATE(), GETDATE(), 1, 1, 2)
INSERT INTO SanPham VALUES(N'All Free vị lúa mạch', 'd1.jpg', 12000, 10000, 9999, N'mô tả đồ uống', GETDATE(), GETDATE(), 1, 1, 2)
INSERT INTO SanPham VALUES(N'All Free lúa mạch', 'd2.jpg', 12000, 10000, 9999, N'mô tả đồ uống', GETDATE(), GETDATE(), 1, 1, 2)
INSERT INTO SanPham VALUES(N'Nước có ga All Free', 'd3.jpg', 12000, 10000, 9999, N'mô tả đồ uống', GETDATE(), GETDATE(), 1, 1, 2)
INSERT INTO SanPham VALUES(N'24 Mountain Dew', 'd4.jpg', 12000, 10000, 9999, N'mô tả đồ uống', GETDATE(), GETDATE(), 1, 1, 2)
INSERT INTO SanPham VALUES(N'6 Mountain Dew ', 'd5.jpg', 12000, 10000, 9999, N'mô tả đồ uống', GETDATE(), GETDATE(), 1, 1, 2)
INSERT INTO SanPham VALUES(N'Mountain Dew', 'd6.jpg', 12000, 10000, 9999, N'mô tả đồ uống', GETDATE(), GETDATE(), 1, 1, 2)
INSERT INTO SanPham VALUES(N'TH True Tea ', 'd7.jpg', 12000, 10000, 9999, N'mô tả đồ uống', GETDATE(), GETDATE(), 1, 1, 2)
INSERT INTO SanPham VALUES(N'Hồng trà vải C2', 'd8.jpg', 12000, 10000, 9999, N'mô tả đồ uống', GETDATE(), GETDATE(), 1, 1, 2)
INSERT INTO SanPham VALUES(N'Hồng trà vải C2', 'd9.jpg', 12000, 10000, 9999, N'mô tả đồ uống', GETDATE(), GETDATE(), 1, 1, 2)
INSERT INTO SanPham VALUES(N'Hồng trà vị vải C2 ', 'd10.jpg', 12000, 10000, 9999, N'mô tả đồ uống', GETDATE(), GETDATE(), 1, 1, 2)
INSERT INTO SanPham VALUES(N'12 chai Pepsi Cola 1.5 ', 'd11.jpg', 12000, 10000, 9999, N'mô tả đồ uống', GETDATE(), GETDATE(), 1, 1, 2)
INSERT INTO SanPham VALUES(N'6 Sprite', 'd12.jpg', 12000, 10000, 9999, N'mô tả đồ uống', GETDATE(), GETDATE(), 1, 1, 2)

INSERT INTO SanPham VALUES(N'03 GÀ GIÒN VUI VẺ + 01 MỲ Ý SỐT BÒ BẰM + 01 KHOAI TÂY CHIÊN VỪA + 2 LY PEPSI VỪA', 'a1.png', 12000, 10000, 9999, N'mô tả đồ ăn', GETDATE(), GETDATE(), 1, 1, 3)
INSERT INTO SanPham VALUES(N'02 GÀ GIÒN VUI VẺ + 02 MỲ Ý SỐT BÒ BẰM + 01 KHOAI TÂY CHIÊN VỪA + 2 LY PEPSI VỪA', 'a2.png', 12000, 10000, 9999, N'mô tả đồ ăn', GETDATE(), GETDATE(), 1, 1, 3)
INSERT INTO SanPham VALUES(N'02 GÀ GIÒN VUI VẺ + 01 GÀ SỐT CAY + 01 MỲ Ý SỐT BÒ BẰM + 01 KHOAI TÂY CHIÊN VỪA + 2 LY PEPSI VỪA', 'a3.png', 12000, 10000, 9999, N'mô tả đồ ăn', GETDATE(), GETDATE(), 1, 1, 3)
INSERT INTO SanPham VALUES(N'03 GÀ GIÒN VUI VẺ + 02 MỲ Ý SỐT BÒ BẰM + 01 KHOAI BBQ VỪA + 03 LY PEPSI VỪA', 'a4.png', 12000, 10000, 9999, N'mô tả đồ ăn', GETDATE(), GETDATE(), 1, 1, 3)
INSERT INTO SanPham VALUES(N'01 MIẾNG GÀ GIÒN VUI VẺ + 01 MỲ Ý SỐT BÒ BẰM + 01 NƯỚC NGỌT (VỪA)', 'a5.png', 12000, 10000, 9999, N'mô tả đồ ăn', GETDATE(), GETDATE(), 1, 1, 3)

INSERT INTO SanPham VALUES(N'SANDWICH GÀ GIÒN + NƯỚC NGỌT', 'a6.png', 12000, 10000, 9999, N'mô tả đồ ăn', GETDATE(), GETDATE(), 1, 1, 3)
INSERT INTO SanPham VALUES(N'SANDWICH THỊT NƯỚNG BBQ + KHOAI TÂY + NƯỚC NGỌT', 'a7.png', 12000, 10000, 9999, N'mô tả đồ ăn', GETDATE(), GETDATE(), 1, 1, 3)
INSERT INTO SanPham VALUES(N'SANDWICH THỊT NƯỚNG BBQ + NƯỚC NGỌT', 'a8.png', 12000, 10000, 9999, N'mô tả đồ ăn', GETDATE(), GETDATE(), 1, 1, 3)
INSERT INTO SanPham VALUES(N'SANDWICH THỊT NƯỚNG BBQ', 'a9.png', 12000, 10000, 9999, N'mô tả đồ ăn', GETDATE(), GETDATE(), 1, 1, 3)
INSERT INTO SanPham VALUES(N'SANDWICH GÀ GIÒN', 'a10.png', 12000, 10000, 9999, N'mô tả đồ ăn', GETDATE(), GETDATE(), 1, 1, 3)
INSERT INTO SanPham VALUES(N'SANDWICH GÀ GIÒN + NƯỚC NGỌT + KHOAI TÂY', 'a11.png', 12000, 10000, 9999, N'mô tả đồ ăn', GETDATE(), GETDATE(), 1, 1, 3)





































SELECT * FROM Slide
SELECT * FROM LoaiSanPham
SELECT * FROM SanPham
SELECT * FROM TaiKhoan 
SELECT * FROM ThongTinShop
SELECT * FROM ThongTinKhachHangDat
SELECT * FROM ChiTietHoaDon
SELECT * FROM HoaDon


drop table TaiKhoan

delete SanPham



SELECT MaSanPham, TenSanPham, HinhAnh, Gia, GiaGiam, SoLuongCon, MoTa, NgayTao, NgayCapNhat, SanPhamMoi, NoiBat, LoaiSanPham.MaLoaiSanPham, LoaiSanPham.TenLoaiSanPham
FROM SanPham INNER JOIN LoaiSanPham ON SanPham.MaLoaiSanPham = LoaiSanPham.MaLoaiSanPham
WHERE SanPham.MaSanPham = 1


;WITH Results_CTE AS
(
    SELECT MaSanPham, TenSanPham, HinhAnh, Gia, GiaGiam, SoLuongCon, MoTa, NgayTao, NgayCapNhat, SanPhamMoi, NoiBat, LoaiSanPham.MaLoaiSanPham, LoaiSanPham.TenLoaiSanPham, ROW_NUMBER() OVER (ORDER BY MaSanPham) AS RowNum
    FROM SanPham INNER JOIN LoaiSanPham ON SanPham.MaLoaiSanPham = LoaiSanPham.MaLoaiSanPham
	WHERE LoaiSanPham.MaLoaiSanPham = 12
)
SELECT *
FROM Results_CTE
WHERE RowNum >= 9
AND RowNum < 9 + 9

SELECT * FROM taiKhoan WHERE TenDangNhap = 'aaa' AND MatKhau = '123'



;WITH Results_CTE AS   
(  
    SELECT MaSanPham, TenSanPham, HinhAnh, Gia, GiaGiam, SoLuongCon, MoTa, NgayTao, NgayCapNhat, SanPhamMoi, NoiBat, LoaiSanPham.MaLoaiSanPham, LoaiSanPham.TenLoaiSanPham, ROW_NUMBER() OVER (ORDER BY MaSanPham, LoaiSanPham.MaLoaiSanPham) AS RowNum   
    FROM SanPham INNER JOIN LoaiSanPham ON SanPham.MaLoaiSanPham = LoaiSanPham.MaLoaiSanPham   
 	 WHERE LoaiSanPham.MaLoaiSanPham = 12    
)  
SELECT *  
FROM Results_CTE   
WHERE RowNum >=   19   
AND RowNum <=   (25);

INSERT INTO HoaDon(TongTien, NgayLapHoaDon, TrangThai, MaThongTinLienHe_KhachHang, ID) 
VALUES (18000, GETDATE(), N'Chờ xác nhận', 1, 26)


INSERT INTO ThongTinLienHe_KhachHang (DiaChi, SoDienThoai)
VALUES('111', '0000')

INSERT INTO ThongTinLienHe_KhachHang (DiaChi, SoDienThoai) VALUES('njjnljn', '0373559622')

SELect SCOPE_IDENTITY() AS 'maHoaDon'


SELECT HoaDon.MaHoaDon, HoaDon.TongTien, HoaDon.NgayLapHoaDon, HoaDon.TrangThai,
	SanPham.MaSanPham, SanPham.TenSanPham, SanPham.Gia, ThongTinLienHe_KhachHang.HoTen, 
	ThongTinLienHe_KhachHang.MaThongTinLienHe_KhachHang, ThongTinLienHe_KhachHang.DiaChi, ThongTinLienHe_KhachHang.SoDienThoai, ChiTietHoaDon.SoLuong
FROM HoaDon INNER JOIN ThongTinLienHe_KhachHang ON HoaDon.MaThongTinLienHe_KhachHang = ThongTinLienHe_KhachHang.MaThongTinLienHe_KhachHang
INNER JOIN ChiTietHoaDon ON HoaDon.MaHoaDon = ChiTietHoaDon.MaHoaDon
INNER JOIN SanPham ON SanPham.MaSanPham = ChiTietHoaDon.MaSanPham
WHERE HoaDon.MaHoaDon = 5

SELECT SanPham.MaSanPham, TenSanPham, Gia, SoLuong, MaHoaDon
FROM SanPham INNER JOIN ChiTietHoaDon ON SanPham.MaSanPham = ChiTietHoaDon.MaSanPham
WHERE MaHoaDon = 1

SELECT SanPham.MaSanPham, TenSanPham, Gia, SoLuong FROM SanPham INNER JOIN ChiTietHoaDon ON SanPham.MaSanPham = ChiTietHoaDon.MaSanPham WHERE MaHoaDon = 1

SELECT * FROM ThongTinKhachHangDat WHERE MaThongTinTinKhachHangDat = 4


UPDATE HoaDon SET HoaDon.NgayLapHoaDon = N'Xác nhận' WHERE HoaDon.MaHoaDon = 1

UPDATE ThongTinLienHe_KhachHang SET HoTen = '', DiaChi ='', SoDienThoai = '' WHERE MaThongTinLienHe_KhachHang = 1

SELECT TOP 3 * FROM SanPham WHERE NoiBat = 1

UPDATE SanPham 
SET TenSanPham = N'Trà ô long 2', HinhAnh = 'h01.png', Gia = 2000, MoTa = N'Mô tả ô long', NgayCapNhat = GETDATE(), SanPhamMoi = 1, NoiBat = 1, MaLoaiSanPham = 13 
WHERE MaSanPham = 2







SELECT * FROM SanPham WHERE TenSanPham LIKE '%Dew%'


SELECT LoaiSanPham.MaLoaiSanPham, LoaiSanPham.TenLoaiSanPham, COUNT(SanPham.MaSanPham) AS SoLuongSanPham
FROM LoaiSanPham left join SanPham on LoaiSanPham.MaLoaiSanPham = SanPham.MaLoaiSanPham
group by LoaiSanPham.MaLoaiSanPham, LoaiSanPham.TenLoaiSanPham

SELECT * FROM HoaDon WHERE TrangThai = N'Chờ xác nhận'



SELECT sum(TongTien) AS TongTien
FROM HoaDon 
WHERE MONTH(NgayLapHoaDon) = MONTH(GETDATE()) AND YEAR(NgayLapHoaDon) = YEAR(GETDATE())

SELECT Sum(SoLuong) AS SoLuong
FROM HoaDon inner join ChiTietHoaDon on HoaDon.MaHoaDon = ChiTietHoaDon.MaHoaDon
WHERE MONTH(NgayLapHoaDon) = MONTH(GETDATE()) AND YEAR(NgayLapHoaDon) = YEAR(GETDATE())

SELECT Sum(SoLuong) AS SoLuong FROM HoaDon inner join ChiTietHoaDon on HoaDon.MaHoaDon = ChiTietHoaDon.MaHoaDon WHERE MONTH(NgayLapHoaDon)
= MONTH(GETDATE()) AND YEAR(NgayLapHoaDon) = YEAR(GETDATE())


SELECT Sum(SoLuong) AS SoLuong 
FROM HoaDon inner join ChiTietHoaDon on HoaDon.MaHoaDon = ChiTietHoaDon.MaHoaDon 
WHERE MONTH(NgayLapHoaDon) = MONTH(GETDATE()) AND YEAR(NgayLapHoaDon) = YEAR(GETDATE())

SELECT SanPham.MaSanPham, TenSanPham, Sum(SoLuong) AS SoLuong
FROM HoaDon inner join ChiTietHoaDon on HoaDon.MaHoaDon = ChiTietHoaDon.MaHoaDon
inner join SanPham on ChiTietHoaDon.MaSanPham = SanPham.MaSanPham
WHERE MONTH(NgayLapHoaDon) = MONTH(GETDATE()) AND YEAR(NgayLapHoaDon) = YEAR(GETDATE())
group by  SanPham.MaSanPham, TenSanPham
ORDER BY  Sum(SoLuong) DESC

SELECT SanPham.MaSanPham, TenSanPham, Sum(SoLuong) AS SoLuong FROM HoaDon inner join ChiTietHoaDon on HoaDon.MaHoaDon = ChiTietHoaDon.MaHoaDon inner join SanPham on ChiTietHoaDon.MaSanPham = SanPham.MaSanPham WHERE MONTH(NgayLapHoaDon) = MONTH(GETDATE()) AND YEAR(NgayLapHoaDon) = YEAR(GETDATE()) group by SanPham.MaSanPham, TenSanPham ORDER BY Sum(SoLuong) DESC