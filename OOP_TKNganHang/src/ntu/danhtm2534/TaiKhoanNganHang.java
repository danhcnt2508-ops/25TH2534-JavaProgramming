package ntu.danhtm2534;

public class TaiKhoanNganHang {
	//tạo thuộc tính
	private String soTaiKhoan;
	private String tenChuTaiKhoan;
	private double soDu = 0.0;
	
	//hàm khởi tạo (constructor) gán dữ liệu khi tạo mới
	public TaiKhoanNganHang(String soTaiKhoan, String tenChuTaiKhoan, double soDu_BanDau) {
		this.soTaiKhoan = soTaiKhoan;
		this.tenChuTaiKhoan = tenChuTaiKhoan;
		this.soDu = soDu_BanDau;
	}
	
	//tạo các phương thức
	//nạp tiền vào tài khoản
	public void guiTien(double soTien) {
		if(soTien > 0) {
			soDu += soTien;
			System.out.println(tenChuTaiKhoan + " nạp thành công " + soTien + " đồng");
		} else {
			System.out.println("Số tiền nạp phải lớn hơn 0");
		}
	}
	
	//Rút tiền từ tài khoản
	public boolean rutTien(double soTien) {
		//kiểm tra điều kiện với số tiền rút
		if (soTien > 0 && soTien <= soDu) {
			soDu -= soTien;
			System.out.println(tenChuTaiKhoan + " rút thành công số tiền " + soTien + " đồng");
			return true;
		} else {
			System.out.println(tenChuTaiKhoan + " rút thất bại. Số dư không đủ hoặc số tiền không hợp lệ.");
			return false;
		}
	}
	
	
	//Chuyển tiền sang tài khoản khác
	public boolean chuyenTien(TaiKhoanNganHang taiKhoanKhac, double soTien) {
		//kiểm tra tài khoản nhận, số tiền chuyển
		if (taiKhoanKhac == null || soTien <= 0) {
			System.out.println("Giao dịch không thành công: Tài khoản nhận hoặc số tiền không hợp lệ.");
			return false;
		}
		
		//kiểm tra số dư tài khoản gốc trước khi chuyển
		if (this.soDu >= soTien) {
			this.soDu -= soTien;
			taiKhoanKhac.soDu += soTien;
			System.out.println(this.tenChuTaiKhoan + " đã chuyển thành công " + soTien + " đồng cho " + taiKhoanKhac.tenChuTaiKhoan);
			return true;
		} else {
			System.out.println("Giao dịch không thành công. Tài khoản " + this.tenChuTaiKhoan + " không đủ số dư.");
			return false;
		} 	
	}
	
	
	//hiển thị số dư hiện tại
	public void hienThiSoDu() {
		System.out.println("Tài khoản [" + soTaiKhoan + " - " + tenChuTaiKhoan + "] Số dư hiện tại là: " + soDu + " đồng");
		System.out.println("--------------------------------------------------");
	}
	
}
