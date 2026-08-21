package ntu.danhtm2534;

//Lớp con: Chiến binh
//File: ChienBinh.java
public class ChienBinh extends NhanVat {
	private String giap;
	private String vuKhi;
	
	
	public ChienBinh(String ten, int capDo, int mau, int sucManh, String giap, String vuKhi) {
		super(ten, capDo, mau, sucManh);
		this.giap = giap;
		this.vuKhi = vuKhi;
		// TODO Auto-generated constructor stub
	}
	
	//Ghi đè phương thức tanCong
	@Override
	public void tanCong(String ten, int sucManh) {
		System.out.println(ten + " đã tấn công với sức mạnh " + (sucManh * 1.5));
	}
		
	//ghi đè phương thức nhanSatThuong
	@Override
	public void nhanSatThuong (String ten) {
		System.out.println("Sát thương" + this.ten + " nhận giảm 20%");
		
	}
	
	//ghi đè hiển thị thông tin
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Giáp: " + this.giap);
		System.out.println("Vũ khí: " + this.vuKhi);
		
		
	}
	
}
