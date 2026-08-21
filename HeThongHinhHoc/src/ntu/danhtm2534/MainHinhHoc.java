package ntu.danhtm2534;

import java.util.ArrayList;

public class MainHinhHoc {

	public static void main(String[] args) {
		//1. tạo danh sách quản lý hình học
		ArrayList<HinhHoc> dsHinhHoc = new ArrayList<>();
		
		//2.Thêm dữ liệu
		dsHinhHoc.add(new HinhChuNhat("HCN01", "xanh", 3, 4));
		dsHinhHoc.add(new HinhTron("HTr01", "đỏ", 5.0));
		dsHinhHoc.add(new HinhTamGiac("HTG01","vàng", 5,6,7));
		dsHinhHoc.add(new HinhTamGiac("HTG02", "tím", 1,2,3));
		
		//3.Hiển thị thông tin tất cả các hình
		System.out.println("=== 1.DANH SÁCH TOÀN BỘ CÁC HÌNH ===");
		for (HinhHoc hh : dsHinhHoc) {
			hh.hienThiThongTin();
			System.out.println("---------------------");
		}
		
		
		//4.kiểm tra hình tam giác
		System.out.println("=== 2. KIỂM TRA HÌNH TAM GIÁC ===");
		for (HinhHoc hh : dsHinhHoc) {
			if (hh instanceof HinhTamGiac) {
				HinhTamGiac htg = (HinhTamGiac) hh;
				htg.hienThiThongTin();
				if (htg.kiemTraHopLe()) {
					System.out.println("=> Đây là hình tam giác hợp lệ.");
				} else System.out.println("=> Đây không phải là hình tam giác");
			}
			System.out.println("---------------------");
		}
		
	}
}

