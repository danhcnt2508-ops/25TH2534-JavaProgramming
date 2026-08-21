package ntu.danh2534;

//Lớp con: Xe máy
//File: XeMay.java
public class XeMay extends PhuongTien{
	private double dungTichXiLanh;
	private String loaiXe;
	
	public XeMay(String hangSanXuat, int namSanXuat, double giaBan, double dungTichXiLanh, String loaiXe) {
		super(hangSanXuat, namSanXuat, giaBan);
		this.dungTichXiLanh = dungTichXiLanh;
		this.loaiXe = loaiXe;
	}
	
	//ghi đè các phương thức
	@Override	
	public double layVanTocToiDa() {
			return 80.0;
		}
		
	@Override
	public int laySoChoNgoi() {
			return 2;
		}
		
	@Override
	public void hienThiThongTin() {
			super.hienThiThongTin();
			System.out.println("Dung tích xi lanh: " + dungTichXiLanh);
			System.out.println("Loại xe: " + dungTichXiLanh);
			System.out.println("Vận tốc tối đa: " + layVanTocToiDa());
			System.out.println("Số chỗ ngồi: " + laySoChoNgoi());
		}
	
	
	
}
