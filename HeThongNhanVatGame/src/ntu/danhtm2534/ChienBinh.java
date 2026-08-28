package ntu.danhtm2534;

//Lớp con: Chiến binh
//File: ChienBinh.java
public class ChienBinh extends NhanVat {
	private double giap;
	private String vuKhi;
	
	
	public ChienBinh(String ten, int capDo, int mau, int sucManh, double giap, String vuKhi) {
		super(ten, capDo, mau, sucManh);
		this.giap = giap;
		this.vuKhi = vuKhi;
	}
	
	//Ghi đè phương thức tanCong
	@Override
	public void tanCong() {
		double satThuongChienBinh = this.sucManh * 1.5;
		System.out.println(ten + " vung " + vuKhi + " tấn công mạnh mẽ, gây " + satThuongChienBinh + " sát thương!");
	}
		
	//ghi đè phương thức nhanSatThuong
	@Override
	public void nhanSatThuong (double satThuong) {
		// Giảm 20% sát thương nhận vào nhờ có giáp
		double satThuongThucTe = satThuong * 0.8;
		System.out.println("[" + ten + " nhờ có giáp giảm 20% sát thương] -> ");
		super.nhanSatThuong(satThuongThucTe);
	}
	
	//ghi đè hiển thị thông tin
	@Override
	public void hienThiThongTin() {
		System.out.println("=== HIỂN THỊ THÔNG TIN CHIẾN BINH ===");
		super.hienThiThongTin();
		System.out.println("Giáp: " + this.giap);
		System.out.println("Vũ khí: " + this.vuKhi);
	}
	
}
