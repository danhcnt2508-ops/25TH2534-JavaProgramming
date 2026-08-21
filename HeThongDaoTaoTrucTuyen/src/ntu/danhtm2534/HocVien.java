package ntu.danhtm2534;

import java.util.ArrayList;
import java.util.List;

//Lớp con: Học viên
//File: HocVien.java
public class HocVien extends NguoiDung {
	private List<String> danhSachKhoaHoc;
	private double diemSoTrungBinh;
	
	public HocVien(String id, String hoTen, String email, String ngayDangKy) {
		super(id, hoTen, email, ngayDangKy);
		this.danhSachKhoaHoc = new ArrayList<>();
		this.diemSoTrungBinh = diemSoTrungBinh;
	}
	
	//thêm phương thức
	public void thamGiaKhoaHoc(String tenKhoaHoc) {
		danhSachKhoaHoc.add(tenKhoaHoc);
		System.out.println(hoTen + " đã tham gia khóa học: " + tenKhoaHoc);
	}
	
	public void nopBaiTap(String tenBaiTap) {
		System.out.println(hoTen + " đã nộp bài tập: " + tenBaiTap);
	}
	
	
	public void xemKetQuaHocTap() {
		System.out.println("Điểm trung bình của " + hoTen + " là: " + diemSoTrungBinh);
	}
	
}
