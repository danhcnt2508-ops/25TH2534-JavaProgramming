package ntu.danhtm2534;

//Lớp cha: Động vật
//File: DongVat.java

public class DongVat {
	//Thuộc tính protected - cho phép lớp con truy cập
	protected String ten;
	protected int tuoi;
	protected double canNang;
	
	//Constructor
	public DongVat(String ten, int tuoi, double canNang) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.canNang = canNang;
	}
	
	//Phương thức chung cho mọi động vật
	public void an() {
		System.out.println(ten + " đang ăn....");
	}
	
	public void ngu() {
		System.out.println(ten + " đang ngủ...");
	}
	
	public void hienThiThongTin() {
		System.out.println("Tên: " + ten);
		System.out.println("Tuổi: " + tuoi + "tuổi");
		System.out.println("Cân nặng: " + canNang + " kg");
	}
}
