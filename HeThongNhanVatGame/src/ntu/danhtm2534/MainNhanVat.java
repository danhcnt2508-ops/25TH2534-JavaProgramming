package ntu.danhtm2534;

public class MainNhanVat {

	public static void main(String[] args) {
		System.out.println("=== KHỞI TẠO NHÂN VẬT ===");
		ChienBinh cb = new ChienBinh("Arthur", 10, 500, 50, 30,"Kiếm" );
		PhapSu ps = new PhapSu("Gandalf", 12, 300, 40, "Cầu Lửa", 50);
		CungThu ct1 = new CungThu("Legolas", 11, 350, 45, 50.0, 3);
		CungThu ct2 = new CungThu("Robinhood", 15, 500, 50, 70.0, 5);
		
		cb.hienThiThongTin();
		ps.hienThiThongTin();
		ct1.hienThiThongTin();
		ct2.hienThiThongTin();
		
		
		System.out.println("\n=== KIỂM TRA PHƯƠNG THỨC TẤN CÔNG ===");
		cb.tanCong();
		ps.tanCong();
		ct2.tanCong();
		
		
		System.out.println("\n=== KIỂM TRA PHƯƠNG THỨC RIÊNG CỦA PHÁP SƯ");
		ps.suDungPhepThuat();
		ps.tanCong();
		ps.hoiMana(40);
		ps.suDungPhepThuat();
		
		
		System.out.println("\n=== KIỂM TRA PHƯƠNG THỨC RIÊNG CỦA CUNG THỦ");
		ct2.banTen();
		ct2.banTen();
		ct2.banTen();
		ct2.banTen();
		ct2.banTen();
		ct2.banTen();
		
		System.out.println("\n=== KIỂM TRA PHƯƠNG THỨC NHẬN SÁT THƯƠNG ===");
		cb.nhanSatThuong(100);
		
		ps.nhanSatThuong(350);
		
		
	}

}
