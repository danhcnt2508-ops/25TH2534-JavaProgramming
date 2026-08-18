package ntu.danhtm2534;

public class MainSanPham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SanPham SP1 = new SanPham();
		SP1.getTenSP();
		SP1.hienThiThongTin();
		
		
		SanPham SP2 = new SanPham("TU002", "Pepsi", 15000, 3);
		SP2.setGia(18000);
		SP2.hienThiThongTin();
		
		
	}

}
