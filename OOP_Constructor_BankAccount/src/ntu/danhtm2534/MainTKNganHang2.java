package ntu.danhtm2534;

public class MainTKNganHang2 {

	public static void main(String[] args) {
		//1. Kiểm tra Constructor 1: chỉ có số tài khoản
		TaiKhoanNganHang tk1 = new TaiKhoanNganHang("1234567890");
		System.out.println("--- Tài khoản 1 ---");
		System.out.println("Số TK: " + tk1.getSoTaiKhoan());
		System.out.println("Chủ TK: " + tk1.getTenChuTaiKhoan());
		System.out.println("Số dư: " + tk1.getSoDu());
		
		//2. Kiểm tra constructor 2: số tài khoản và tên chủ tk
		TaiKhoanNganHang tk2 = new TaiKhoanNganHang("9876543210", "Nguyễn Chí Phong");
		System.out.println("\n--- Tài khoản 2 ---");
		System.out.println("Số TK: " + tk2.getSoTaiKhoan());
		System.out.println("Chủ TK: " + tk2.getTenChuTaiKhoan());
		System.out.println("Số dư: " + tk2.getSoDu());
		
		//3.Kiểm tra constructor 3: đầy đủ thông tin
		TaiKhoanNganHang tk3 = new TaiKhoanNganHang("1111222233", "Trần Văn Trọn", 5000000.0);
		System.out.println("\n--- Tài khoản 3 ---");
		System.out.println("Số TK: " + tk3.getSoTaiKhoan());
		System.out.println("Chủ TK: " + tk3.getTenChuTaiKhoan());
		System.out.println("Số dư: " + tk3.getSoDu());
		
		//4. Kiểm tra các phương thức trên tk3
		System.out.println("\n--- Giao dịch trên tài khoản 3 ---");
		tk3.guiTien(2000000.0);
		tk3.rutTien(1500000.0);
		tk3.rutTien(10000000.0);
		
		//5. Kiểm tra đổi tên chủ tk
		tk3.setTenChuTaiKhoan("Trần Mộng Danh VIP");
		System.out.println("Tên chủ TK mới: " + tk3.getTenChuTaiKhoan());
		System.out.println("Số dư cuối là: " + tk3.getSoDu());

		//6. Chuyển tiền từ tài khoản 3 sang tkNhan
		tk3.chuyenTien(tk2, 1000000.0);
		System.out.println("Số dư trong tk2: " + tk2.getSoDu());
		System.out.println("Số dư trong tk3: " + tk3.getSoDu());
	}

}
