package ntu.danh2534;

import java.util.ArrayList;


public class MainPhuongTien {

	public static void main(String[] args) {
		//1. Tạo danh sách quản lý phương tiện
		ArrayList<PhuongTien> dsPhuongTien = new ArrayList<>();

		//Thêm dữ liệu mẫu
		dsPhuongTien.add(new XeMay("Honda", 2019,39000000.0, 135, "Vision"));
		dsPhuongTien.add(new Oto("Toyota", 2022, 560000000.0, 5, "Xăng"));
		dsPhuongTien.add(new XeMay("Honda", 2026,51000000.0, 150, "SH Mode"));
		dsPhuongTien.add(new Oto("Vinfast", 2025, 340000000.0, 5, "Điện"));
			
		//2.Hiển thị toàn bộ danh sách phương tiện
		System.out.println("=== 1.DANH SÁCH TOÀN BỘ PHƯƠNG TIỆN ===");
		for (PhuongTien pt : dsPhuongTien) {
			pt.hienThiThongTin();
			System.out.println("---------------------");
		}
		
		//3.tính thuế đối với xe ô tô
		System.out.println("Tính thuế trước bạ đối với ô tô:");
		for (PhuongTien pt : dsPhuongTien) {
			if (pt instanceof Oto) {
			Oto OT = (Oto) pt;
			System.out.println(OT.tinhThueTruocBa());
			}
		}
	}
}
