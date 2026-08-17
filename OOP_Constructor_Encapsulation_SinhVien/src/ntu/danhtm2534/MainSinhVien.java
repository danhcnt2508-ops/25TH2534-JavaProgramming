package ntu.danhtm2534;

//Chương trình chính
public class MainSinhVien {

	public static void main(String[] args) {
		// Tạo sinh viên với constructor mặc định
		SinhVien sv1 = new SinhVien();
		sv1.setTen("Nguyễn Văn Biển");
		sv1.setTuoi(20);
		sv1.setMaSV("SV001");
		sv1.setDiemTB(8.5);
		sv1.hienThiThongTin();
		
		System.out.println("\n---\n");
		
		// Tạo sinh viên với constructor có tham số
		SinhVien sv2 = new SinhVien("Trần Thị Hải", 21, "SV002");
		sv2.setDiemTB(7.2);
		sv2.hienThiThongTin();
		
		System.out.println("\n---\n");
		
		//Test validation
		SinhVien sv3 = new SinhVien();
		sv3.setTuoi(15); 		//kiểm tra độ tuổi
		sv3.setDiemTB(12.5); 	//kiểm tra điểm
		sv3.setMaSV("ABC123");	//kiểm tra mã SV
		
		//truy cập thoongqa getter
		System.out.println("\nTên sv1: " + sv1.getTen());
		System.out.println("Điểm TB sv2: " + sv2.getDiemTB());

	}

}
