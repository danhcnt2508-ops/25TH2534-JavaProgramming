package ntu.danhtm2534;

public class CungThu extends NhanVat {
	private double tamBan;
	private int soTen;
	
	public CungThu(String ten, int capDo, int mau, int sucManh, double tamBan, int soTen) {
		super(ten, capDo, mau, sucManh);
		this.tamBan = tamBan;
		this.soTen = soTen;
		
	}

}
