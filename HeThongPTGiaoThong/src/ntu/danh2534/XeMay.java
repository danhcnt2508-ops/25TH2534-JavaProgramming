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
		// TODO Auto-generated constructor stub
	}
	
	
	
}
