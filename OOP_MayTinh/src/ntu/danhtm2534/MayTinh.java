package ntu.danhtm2534;

public class MayTinh {
	//tạo thuộc tính
	String hang;
	int ram;
	int oCung;
	double gia;
	
	//tạo phương thức kiểm tra cấu hình
	void kiemTraCauHinh() {
		System.out.println("Hãng máy tính: " + hang);
		System.out.println("Dung lượng RAM: " + ram + " GB");
		System.out.println("Dung lượng ổ cứng: " + oCung + " GB");
		System.out.println("Giá: " + gia + " đồng");
	}
	
	//tạo phương thức có thể chơi game
	boolean coTheChoiGame() {
		if (ram >= 8)
		return true;
		else return false;
	
	}
	
	//phương thức tính thuế từ giá
	Double tinhThue() {
		return gia * 0.1;
	}
	
}
