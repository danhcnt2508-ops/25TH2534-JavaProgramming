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
		dienTich = PI * banKinh * banKinh;
		return dienTich;
	}
	
	@Override
	public double tinhChuVi() {
		chuVi = 2 * PI * banKinh;
		return chuVi;
	}
	
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Hình tròn có bán kính là: " + banKinh);
		System.out.println("Hình tròn có diện tích là: " + dienTich);
		System.out.println("Hình tròn có chu vi là: " + chuVi);
	}
	
}
