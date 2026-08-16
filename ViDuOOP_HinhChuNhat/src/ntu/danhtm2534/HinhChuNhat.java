package ntu.danhtm2534;

public class HinhChuNhat {
	// Thuộc tính
	double chieuDai;
	double chieuRong;
	
	// Phương thức tính chu vi
	double tinhChuVi() {
		return (chieuDai + chieuRong) * 2;
		
	}
	
	// Phương thức tính diện tích
	double tinhDienTich() {
		return chieuDai * chieuRong;
	}
	
	//Phương thức kiểm tra có phải hình vuông không
	boolean laHinhVuong() {
		return chieuDai == chieuRong;
	}
	
	// Phương thức hiển thị thông tin
	void hienThiThongTin() {
		System.out.println("Chiều dài: " + chieuDai);
		System.out.println("Chiều rộng: " + chieuRong);
		System.out.println("Chu vi: " + tinhChuVi());
		System.out.println("Diện tích: " + tinhDienTich());
		System.out.println("Là hình vuông: " + (laHinhVuong() ? "Có" : "Không"));
	}
}
