package ntu.danhtm2534;

//Lớp con: Quản lý
//File: QuanLy.java
public class QuanLy extends NhanVien {
	private double phuCapChucVu;
	private double heSoKinhNghiem;
	
	public QuanLy(String maNV, String hoTen, double luongCoBan,
				  double phuCapChucVu, double heSoKinhNghiem) {
		super(maNV, hoTen, luongCoBan);
		this.phuCapChucVu = phuCapChucVu;
		this.heSoKinhNghiem = heSoKinhNghiem;
	}
	
	//ghi đè phương thức tính lương
	@Override
	public double tinhLuong() {
		return (luongCoBan * heSoKinhNghiem) + phuCapChucVu;
	}
	
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Phụ cấp chức vụ: " + phuCapChucVu);
		System.out.println("Hệ số kinh nghiệm: " + heSoKinhNghiem);
		System.out.println("Tổng lương: " + this.tinhLuong());
		System.out.println("Chức vụ: Quản lý");
	}
	
	//Phương thức riêng của quản lý
	public void hopBanGiamDoc() {
		System.out.println(hoTen + " đang họp với Ban Giám đốc...");
	}

}
