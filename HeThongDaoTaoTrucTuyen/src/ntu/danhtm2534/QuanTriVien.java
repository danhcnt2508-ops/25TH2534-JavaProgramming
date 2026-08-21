package ntu.danhtm2534;

//Lớp: Quản trị viên
//File: QuanTriVien.java
public class QuanTriVien extends NguoiDung {
	private String quyenHan;
	
	public QuanTriVien(String id, String hoTen, String email, String ngayDangKy, String quyenHan) {
		super(id, hoTen, email, ngayDangKy);
		this.quyenHan = quyenHan;
	}
	
	public void duyetKhoaHoc(String tenKhoaHoc) {
		System.out.println("Quản trị viên " + hoTen + " đã duyệt khóa học: " + tenKhoaHoc);
	}
	
	public void khoaTaiKhoan(String idNguoiDung) {
		System.out.println("Đã khóa tài khoản có ID: " + idNguoiDung);
	}
	
	public void xemBaoCao() {
		System.out.println("Quản trị viên " + hoTen + " đang xem báo cáo hệ thống.");
	}

}
