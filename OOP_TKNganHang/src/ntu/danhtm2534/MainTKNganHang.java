package ntu.danhtm2534;

public class MainTKNganHang {

	public static void main(String[] args) {
		// tạo 2 tài khoản ngân hàng
		TaiKhoanNganHang TKNH1 = new TaiKhoanNganHang("612020123456", "Trần Mộng Danh", 1000000.0);
		TaiKhoanNganHang TKNH2 = new TaiKhoanNganHang("612020987654", "Trần Mộng Được", 2000000.0);
			
		//Gọi phương thức TKNH1
		System.out.println("=== THAO TÁC TRÊN TKNH1 === ");
		TKNH1.guiTien(2000000.0);
		TKNH1.rutTien(500000.0);
		TKNH1.chuyenTien(TKNH2, 700000.0);
		TKNH1.hienThiSoDu();
		
		//Gọi phương thức TKNH2
		System.out.println("=== THAO TÁC TRÊN TKNH2 ===");
		TKNH2.guiTien(2000000.0);
		TKNH2.rutTien(500000.0);
		TKNH2.chuyenTien(TKNH1, 500000.0);
		TKNH2.hienThiSoDu();
		
		//HIỂN THỊ LẠI TKNH1 sau khi nhận từ KTNH2
		System.out.println("=== KIỂM TRA LẠI TKNH1 === ");
		TKNH1.hienThiSoDu();
 
	}

}
