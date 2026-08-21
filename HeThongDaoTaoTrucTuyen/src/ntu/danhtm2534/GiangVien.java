package ntu.danhtm2534;

import java.util.ArrayList;
import java.util.List;

//Lớp con: Giảng viên
//File: GiangVien.java
public class GiangVien extends NguoiDung {
	private String chuyenMon;
	private List<String> danhSachKhoaHocGiangDay;
	
	public GiangVien(String id, String hoTen, String email, String ngayDangKy,
					  String chuyenMon) {
		super(id, hoTen, email, ngayDangKy);
		this.chuyenMon = chuyenMon;
		this.danhSachKhoaHocGiangDay = new ArrayList<>();
	}
	
	//Thêm phương thức
	public void taoKhoaHoc() {
		
	}
	
	public void chamBai() {
		
	}
	
	public void traoDoiVoiHocVien() {
		
	}
	
}
