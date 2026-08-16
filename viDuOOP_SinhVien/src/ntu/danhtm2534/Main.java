package ntu.danhtm2534;

public class Main {

	public static void main(String[] args) {
		// tạo đối tượng sinhVien1 từ lớp SinhVien
		SinhVien sinhVien1 = new SinhVien();
		sinhVien1.ten = "Trần Mộng Danh";
		sinhVien1.tuoi = 41;
		sinhVien1.maSV = "25TH2534";
		
		//tạo đối tượng sinhVien2
		SinhVien sinhVien2 = new SinhVien();
		sinhVien2.ten = "Trần Lê Hùng Cường";
		sinhVien2.tuoi = 32;
		sinhVien2.maSV = "25TH2502";
		
		//gọi phương thức
		sinhVien1.hocBai("Lập trình thiết bị di động");
		sinhVien2.hocBai("Lập trình hướng đối tượng");

	}

}
