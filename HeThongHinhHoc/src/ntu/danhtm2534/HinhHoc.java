package ntu.danhtm2534;

//Lớp Cha: Hình học
//File: HinhHoc.java
public class HinhHoc {
	//thuộc tính chung
	protected String ten;
	protected String mauSac;
	
	//khởi tạo có tham số
	public HinhHoc(String ten, String mauSac) {
		super();
		this.ten = ten;
		this.mauSac = mauSac;
	}
	
	//Phương thức
	double dienTich;
	public double tinhDienTich() {
		return dienTich;
	}
	
	double chuVi;
	public double tinhChuVi() {
		return chuVi;
	}
	
	public void hienThiThongTin() {
		System.out.println("Tên: " + ten);
		System.out.println("Màu sắc: " + mauSac);
	}
}
