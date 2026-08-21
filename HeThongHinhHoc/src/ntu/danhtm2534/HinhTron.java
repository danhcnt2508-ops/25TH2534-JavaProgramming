package ntu.danhtm2534;

//Lớp con: Hình tròn
//File: HinhTrong.java
public class HinhTron extends HinhHoc {
	private static final int PI = 0;
	private double banKinh;
	
	
	public HinhTron(String ten, String mauSac, double banKinh) {
		super(ten, mauSac);
		this.banKinh = banKinh;
	}
	
	//ghi đè phương thức
	@Override
	public double tinhDienTich() {
		//double PI = 3.1415;
		return Math.PI * banKinh * banKinh;
	}
	
	@Override
	public double tinhChuVi() {
		return 2 * Math.PI * banKinh;
	}
	
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Hình tròn có bán kính là: " + banKinh);
		System.out.println("Hình tròn có diện tích là: " + tinhDienTich());
		System.out.println("Hình tròn có chu vi là: " + tinhChuVi());
	}
	
}
