package ntu.danhtm2534;

public class CungThu extends NhanVat {
	private double tamBan;
	private int soTen;
	
	public CungThu(String ten, int capDo, int mau, int sucManh, double tamBan, int soTen) {
		super(ten, capDo, mau, sucManh);
		this.tamBan = tamBan;
		this.soTen = soTen;
	}
	
	//thêm phương thức
	public void banTen() {
		return;
	}
	
	//Ghi đè phương thức tanCong
	@Override
	public void tanCong(String ten, int sucManh) {
		System.out.println(ten + " đã tấn công với sức mạnh " + sucManh);
		System.out.println("Sát thương phụ thuộc vào: " + this.tamBan);
	}
}
