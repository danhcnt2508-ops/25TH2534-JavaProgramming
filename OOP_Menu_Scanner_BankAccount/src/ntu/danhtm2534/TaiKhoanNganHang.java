package ntu.danhtm2534;

public class TaiKhoanNganHang {
	private String soTaiKhoan;
	private String tenChuTaiKhoan;
	private double soDu;
	
	
	//Constructor 1: chỉ có số tài khoản
	public TaiKhoanNganHang(String soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
		this.tenChuTaiKhoan = "Chưa xác định";
		this.soDu = 0.0;
	}


	//Constructor 2: Có số tài khoản và tên chủ TK
	public TaiKhoanNganHang(String soTaiKhoan, String tenChuTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
		this.tenChuTaiKhoan = tenChuTaiKhoan;
		this.soDu = 0.0;
	}


	//Constructor 3: Đầy đủ thông tin
	public TaiKhoanNganHang(String soTaiKhoan, String tenChuTaiKhoan, double soDu) {
		this.soTaiKhoan = soTaiKhoan;
		this.tenChuTaiKhoan = tenChuTaiKhoan;
		this.soDu = (soDu >= 0) ? soDu : 0.0;
	}
	
	//Getter/Setter
	public String getSoTaiKhoan() { return soTaiKhoan; }
	public String getTenChuTaiKhoan() { return tenChuTaiKhoan; }
	public double getSoDu() { return soDu;}
	
	public void setTenChuTaiKhoan(String ten) {
		if(ten != null && ten.length() > 0) {
			this.tenChuTaiKhoan = ten;
		}
	}
	
	//Phương thức gửi tiền vào TK
	public boolean guiTien(double soTien) {
		if(soTien > 0) {
			this.soDu += soTien;
			System.out.println("Gửi tiền thành công! Số dư mới: " + this.soDu);
			return true;
		}
		System.out.println("Số tiền gửi phải > 0.");
		return false;
	}
	
	
	//Phương thức rút tiền
	public boolean rutTien(double soTien) {
		if(soTien > 0 && soTien <= this.soDu) {
			this.soDu -= soTien;
			System.out.println("Rút tiền thành công. Số dư mới: " + this.soDu);
			return true;
		}
		System.out.println("Số tiền rút không hợp lệ.");
		return false;
	}
	
	//Phương thức chuyển khoản
	public boolean chuyenTien(TaiKhoanNganHang tkNhan, double soTien) {
		if (soTien > 0 && soTien <= this.soDu) {
			this.soDu -= soTien;
			tkNhan.guiTien(soTien);
			System.out.println("Chuyển khoản thành công " + soTien + " đ sang TK " + tkNhan.soTaiKhoan);
			return true;
		}
		System.out.println("Chuyển khoản thất bại. Số dư không đủ hoặc số tiền không hợp lệ.");
		return false;
	}
}
