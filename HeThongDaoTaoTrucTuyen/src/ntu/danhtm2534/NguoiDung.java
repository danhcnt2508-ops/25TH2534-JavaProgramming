package ntu.danhtm2534;

//Lớp cha: Người dùng
//File: NguoiDung.java
public class NguoiDung {
	protected String id;
	protected String hoTen;
	protected String email;
	protected String ngayDangKy;
	
	
	public NguoiDung(String id, String hoTen, String email, String ngayDangKy) {
		super();
		this.id = id;
		this.hoTen = hoTen;
		this.email = email;
		this.ngayDangKy = ngayDangKy;
	}
	
	//phương thức
	public void dangNhap() {
		System.out.println(hoTen + " đã đăng nhập hệ thống.");
	}
	
	public void xemThongTin() {
		System.out.println("ID người dùng: " + this.id);
		System.out.println("Họ tên: " + this.hoTen);
		System.out.println("Email: " + this.email);
		System.out.println("Ngày đăng ký: " + this.ngayDangKy);
	}
}
