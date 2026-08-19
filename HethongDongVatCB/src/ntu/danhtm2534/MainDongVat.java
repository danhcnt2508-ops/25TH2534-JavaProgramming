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
		

	}

}
