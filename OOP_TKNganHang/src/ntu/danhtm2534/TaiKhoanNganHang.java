package ntu.danhtm2534;

public class TaiKhoanNganHang {
	//tạo thuộc tính
	String soTaiKhoan;
	String tenChuTaiKhoan;
	Double soDu;
	
	//tạo các phương thức
	//Thêm tiền vào tài khoản
	void guiTien(double soTien) {
		soDu += soTien;
	}
	
	//Rút tiền từ tài khoản
	boolean rutTien(double soTien) {
		if (soTien >= soDu)
		return true;
		else return false;
	}
	
	
	//Chuyển tiền sang tài khoản khác
	double chuyenTien(TaiKhoanNganHang taiKhoanKhac, double soTien) {
		
	return soDu -= soTien;	
	}
	
	
	//hiển thị số dư hiện tại
	void hienThiSoDu() {
		System.out.println("Số dư hiện tại là: " + soDu + " đồng"); 
	}
	
}
