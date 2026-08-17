package ntu.danhtm2534;

public class ConMeo {
	//tạo thuộc tính
	String ten;
	int tuoi;
	String mauLong;
	double canNang;
	
	//tạo phương thức
	public void thongTin() {
		System.out.println("Tên con mèo: " + ten);
		System.out.println("Tuổi: " + tuoi);
		System.out.println("Màu lông: " + mauLong);
		System.out.println("Cân nặng: " + canNang);
	}
	public void keu() {
		System.out.println("Con mèo kêu meo meo");	
	}
	
	public void an(String thucAn) {
		System.out.println("Mèo thường thích ăn " + thucAn);
	}
	
	public void ngu() {
		System.out.println("Con mèo hay ngủ ngày.");
	}
}
