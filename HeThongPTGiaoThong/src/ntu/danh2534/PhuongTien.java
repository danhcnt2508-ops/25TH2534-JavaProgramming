package ntu.danh2534;

//lớp cha: Phương tiện
//File: PhuongTien.java
public class PhuongTien {
	protected String hangSanXuat;
	protected int namSanXuat;
	protected double giaBan;
	
	
	public PhuongTien(String hangSanXuat, int namSanXuat, double giaBan) {
		super();
		this.hangSanXuat = hangSanXuat;
		this.namSanXuat = namSanXuat;
		this.giaBan = giaBan;
	}
	
	//phương thức
	public double layVanTocToiDa() {
		return 0.0;
	}
	
	public int laySoChoNgoi() {
		return 0;
	}
	
	public void hienThiThongTin() {
		System.out.println("Hãng sản xuất: " + hangSanXuat);
		System.out.println("Năm sản xuất: " + namSanXuat);
		System.out.println("Giá bán: " + giaBan);
	}
}
