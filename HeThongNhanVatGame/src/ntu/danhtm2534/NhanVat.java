package ntu.danhtm2534;

//Lớp cha: Nhân vật
//File: NhanVat.java
public class NhanVat {
	protected String ten;
	protected int capDo;
	protected int mau;
	protected int sucManh;
	
	
	public NhanVat(String ten, int capDo, int mau, int sucManh) {
		super();
		this.ten = ten;
		this.capDo = capDo;
		this.mau = 100;
		this.sucManh = sucManh;
	}
	
	//tạo phương thức
	public void tanCong(String ten, int sucManh) {
		System.out.println(ten + " đã tấn công với sức mạnh " + sucManh);
	}
	
	public void nhanSatThuong(String ten) {
		System.out.println(this.ten + " nhận sát thương");;
		
	}
	
	public void chet(String ten) {
	
		System.out.println(ten + " đã chết.");
	}
	
	public void hienThiThongTin() {
		System.out.println("=== HIỂN THỊ TÊN NHÂN VẬT ===");
		System.out.println("Tên: " + ten);
		System.out.println("Cấp độ: " + capDo);
		System.out.println("Máu: " + mau);
		System.out.println("Sức mạnh: " + sucManh);
	}

	public void tanCong() {
		// TODO Auto-generated method stub
		
	}
}
