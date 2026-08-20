package ntu.danhtm2534;

//lớp cha: Nhân viên
//File: NhanVien.java

public class NhanVien {
	protected String maNV;
	protected String hoTen;
	protected double luongCoBan;
	
	//constructor đầy đủ
	public NhanVien(String maNV, String hoTen, double luongCoBan) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
	}
	
	//Phương thức tính lương - sẽ được ghi đè ở lớp con
	public double tinhLuong() {
		return luongCoBan;
	}
	
	public void hienThiThongTin() {
		System.out.println("Mã NV: " + maNV);
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Lương cơ bản: " + luongCoBan);
	}	
}
