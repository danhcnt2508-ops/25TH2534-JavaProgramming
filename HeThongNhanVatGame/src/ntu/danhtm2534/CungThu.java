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
		if(soTen > 0) {
			soTen--;
			double satThuongBanTen = this.sucManh * 1.8;
			System.out.println(ten + " bắn một mũi tên từ xa mang theo " + satThuongBanTen 
								+ " sát thương! (Số mũi tên còn lại: " + soTen + ")");
        } else {
        	System.out.println(ten + " đã hết tên! Không thể bắn từ xa.");
        }
	}
	
	//Ghi đè phương thức tanCong
	@Override
	public void tanCong() {
		double satThuongTheoTam = this.sucManh * (1 + (tamBan/100));
		System.out.println(ten + " tấn công ở khoảng cách " + tamBan + "m, gây "
							+ satThuongTheoTam + " sát thương.");
	}
	
	//ghi đè hiển thị thông tin
			@Override
			public void hienThiThongTin() {
				System.out.println("=== HIỂN THỊ THÔNG TIN CUNG THỦ ===");
				super.hienThiThongTin();
				System.out.println("Tầm bắn: " + this.tamBan);
				System.out.println("Số tên: " + this.soTen);
			}
}
