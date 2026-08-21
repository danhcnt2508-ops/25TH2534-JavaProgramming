package ntu.danh2534;

//lớp con: Ô tô
//File: Oto.java
public class Oto extends PhuongTien {
	private int soCho;
	private String kieuDongCo;
	
	public Oto(String hangSanXuat, int namSanXuat, double giaBan, int soCho, String kieuDongCo) {
		super(hangSanXuat, namSanXuat, giaBan);
		this.soCho = soCho;
		this.kieuDongCo = kieuDongCo;
	}
	
	//ghi đè các phương thức
	@Override
	public double layVanTocToiDa() {
		return 150.0;
	}
			
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Số chỗ ngồi: " + soCho);
		System.out.println("Kiểu động cơ: " + kieuDongCo);
		System.out.println("Vận tốc tối đa: " + layVanTocToiDa());
	}
			
	//thêm phương thức
	public double tinhThueTruocBa() {
		double phanTramThue = 0.10;
		return this.giaBan * phanTramThue;
	}
}
