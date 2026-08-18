package ntu.danhtm2534;

public class SanPham {
	private String maSP;
	private String tenSP;
	private double gia;
	private int soLuong;
	
	//constructor mặc định
	public SanPham() {
		maSP = "DU001";
		tenSP = "Coca Cola";
		
	}

	//constructor có tham số
	public SanPham(String maSP, String tenSP, double gia, int soLuong) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.gia = gia;
		this.soLuong = soLuong;
	}
	
	//Getter/Setter với validation
	public String getMaSP() { return maSP;}
	public String getTenSP() { return tenSP;}
	
	public void setGia(double gia) {
		if (gia > 0) {
			this.gia = gia;
		} else System.out.println("Giá phải lớn hơn 0");
	}
	
	public void setSL(int SL) {
		if (SL >= 0) {
			soLuong = SL;
		} else System.out.println("Số lượng phải lớn hơn hoặc bằng 0");
	}
	
	//tạo phương thức tính tiền
	public boolean tinhThanhTien(double gia, int soLuong) {
		if (gia > 0 && soLuong >= 0) {
			double thanhTien = gia * soLuong;
			System.out.println("Thành tiền là: " + thanhTien);
			return true;
		}
		System.out.println("Giá phải > 0 và số lượng phải >= 0");
		return false;
	}
	
	//tạo phương thức hiển thị thông tin
	public void hienThiThongTin() {
		System.out.println("=== THÔNG TIN SẢN PHẨM ===");
		System.out.println("Mã SP: " + this.maSP);
		System.out.println("Tên SP: " + this.tenSP);
		System.out.println("Giá: " + this.gia);
		System.out.println("Số lượng: " + this.soLuong);
	}
	
	
}
