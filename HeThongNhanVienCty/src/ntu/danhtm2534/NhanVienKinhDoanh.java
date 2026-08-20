package ntu.danhtm2534;

//Lớp con: Nhân viên kinh doanh
//File: NhanVienKinhDoanh.java

public class NhanVienKinhDoanh extends NhanVien {
	private double doanhSo;
	private double tyLeHoaHong;
	
	public NhanVienKinhDoanh(String maNV, String hoTen, double luongCoBan,
							 double doanhSo, double tyLeHoaHong) {
		super(maNV, hoTen, luongCoBan);
		this.doanhSo = doanhSo;
		this.tyLeHoaHong = tyLeHoaHong;
	}
	
	@Override
	public double tinhLuong() {
		return luongCoBan + (doanhSo * tyLeHoaHong/100);
	}
	
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Doanh số: " + doanhSo);
		System.out.println("Tỷ lệ hoa hồng: " + tyLeHoaHong);
		System.out.println("Tổng lương: " + this.tinhLuong());
		System.out.println("Chức vụ: Nhân viên kinh doanh");
	}
	
	//Phương thức riêng
	public void chamSocKhachHang() {
		System.out.println(hoTen + " đang chăm sóc khách hàng....");
	}
	
}
