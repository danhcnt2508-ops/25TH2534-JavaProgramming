package ntu.danhtm2534;


//Chương trình chính
//File MainDongVat.java
public class MainDongVat {

	public static void main(String[] args) {
		System.out.println("=== HỆ THỐNG QUẢN LÝ ĐỘNG VẬT ===\n");
		
		//Tạo đối tượng chó
		ConCho cho1 = new ConCho ("Lucky", 3, 15.5, "Husky", true);
		System.out.println("THÔNG TIN CHÓ: ");
		cho1.hienThiThongTin();
		cho1.an();
		cho1.sua();
		cho1.duoiMeo();
		
		System.out.println("\n----\n");
		
		//Tạo đối tượng mèo
		ConMeo meo1 = new ConMeo("Mimi", 2, 4.3, "Tam thể", true);
		System.out.println("THÔNG TIN MÈO");
		meo1.hienThiThongTin();
		meo1.an();
		meo1.ngu();
		meo1.keu();
		meo1.batChuot();

		System.out.println("\n---\n");
		
		//Tính đa hình cơ bản: DongVat có thể tham chiếu đến đối tượng con
		System.out.println("SỬ DỤNG TÍNH ĐA HÌNH: ");
		DongVat dongVat1 = new ConCho("Max", 4, 12.0, "Poodle", false);
		DongVat dongVat2 = new ConMeo("Tom", 1, 3.5, "Đen", false);
		
		dongVat1.an();		//Gọi phương thức của ConCho
		dongVat2.an();		//Gọi phương thức của ConMeo (đã ghi đè)
		
		//Kiểm tra kiểu đối tượng
		System.out.println("\n Kiểm tra kiểu đối tượng: ");
		System.out.println("dongVat1 có phải là ConCho không? " +
							(dongVat1 instanceof ConCho));
		System.out.println("dongVat1 có phải là DongVat không? " + 
							(dongVat1 instanceof DongVat));
	}

}
