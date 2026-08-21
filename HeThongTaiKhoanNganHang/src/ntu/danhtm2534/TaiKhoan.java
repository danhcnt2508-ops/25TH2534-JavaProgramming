package ntu.danhtm2534;

//Lớp cha: Tài khoản
//File: TaiKhoan.java
public class TaiKhoan {
	protected String soTaiKhoan;
	protected String tenChuTaiKhoan;
	protected double soDu;
	
	
	
	public TaiKhoan(String soTaiKhoan, String tenChuTaiKhoan, double soDu) {
		super();
		this.soTaiKhoan = soTaiKhoan;
		this.tenChuTaiKhoan = tenChuTaiKhoan;
		this.soDu = (soDu >= 0) ? soDu : 0.0;
	}
	
		
	public String getSoTaiKhoan() {
		return soTaiKhoan;
	}

	public void setSoTaiKhoan(String soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
	}

	public double getSoDu() {
		return soDu;
	}

	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}

	public String getTenChuTaiKhoan() {
		return tenChuTaiKhoan;
	}

	public void setTenChuTaiKhoan(String ten) {
		if(ten != null && ten.length() > 0) {
			this.tenChuTaiKhoan = ten;
		}
	}
	
	//phương thức
	public boolean guiTien(double soTien) {
		if(soTien > 0) {
			this.soDu += soTien;
			System.out.println("Gửi tiền thành công. Số dư hiện tại là: " + this.soDu);
			return true;
		} else 
			System.out.println("Số tiền gửi phải > 0");
			return false;
	}
	
	public void rutTien(double soTien) {
		if (soTien > 0 && soTien <= this.soDu) {
			this.soDu -= soTien;
			System.out.println("Rút tiền thành công. Số dư hiện tại là: " + this.soDu);
			
		} else
			System.out.println("Số tiền rút không hợp lệ.");
			
	}
	
	public void hienThiThongTin() {
		System.out.println("=== THÔNG TIN TÀI KHOẢN ===");
		System.out.println("Số tài khoản: " + this.soTaiKhoan);
		System.out.println("Chủ tài khoản: " + this.tenChuTaiKhoan);
		System.out.println("Số dư hiện tại lại: " + this.soDu);
		
	}
	
}
