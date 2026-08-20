package ntu.danhtm2534;

import java.util.ArrayList;

public class MainNhanVien {

	public static void main(String[] args) {
		//1. Tạo danh sách quản lý nhân viên
		ArrayList<NhanVien> dsNhanVien = new ArrayList<>();

		//Thêm dữ liệu mẫu
		dsNhanVien.add(new NhanVienVanPhong("VP01", "Nguyen Van A", 5310000, 10, 50000));
		dsNhanVien.add(new QuanLy("QL01", "Tran Thi B", 10000000, 3000000, 1.5));
		dsNhanVien.add(new NhanVienKinhDoanh("KD01", "Le Thanh C", 4000000, 100000000, 5));
		dsNhanVien.add(new NhanVienVanPhong("VP02", "Phan Minh D", 5000000, 25, 50000));
		dsNhanVien.add(new NhanVienKinhDoanh("KD01", "Nguyen Thi E", 4500000, 200000000, 4));
		
		//2.Hiển thị toàn bộ danh sách nhân viên
		System.out.println("=== 1.DANH SÁCH TOÀN BỘ NHÂN VIÊN ===");
		for (NhanVien nv : dsNhanVien) {
			nv.hienThiThongTin();
			System.out.println("---------------------");
		}
		
		//3.Phương thức riêng theo chức vụ
		System.out.println("=== 2. CÔNG VIỆC RIÊNG THEO CHỨC VỤ ===");
		for (NhanVien nv : dsNhanVien) {
			if (nv instanceof QuanLy) {
				QuanLy ql = (QuanLy) nv;
				ql.hopBanGiamDoc();
			} else if (nv instanceof NhanVienKinhDoanh) {
				NhanVienKinhDoanh nvkd = (NhanVienKinhDoanh) nv;
				nvkd.chamSocKhachHang();
			}
		
		}
		
		
	}

}
