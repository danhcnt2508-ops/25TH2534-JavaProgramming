package ntu.danhtm2534;

//lớp con: Hình tam giác
//File: HinhTamGiac.java
public class HinhTamGiac extends HinhHoc {
	private int canhA;
	private int canhB;
	private int canhC;
	
	
	public HinhTamGiac(String ten, String mauSac,int canhA, int canhB, int canhC) {
		super(ten, mauSac);
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
	}
	
	//ghi đè phương thức của HinhHoc
		@Override
		public double tinhDienTich() {
			//sử dung côn thức Heron
			double p = tinhChuVi() / 2;
			return Math.sqrt(p * (p-canhA) * (p-canhB) * (p-canhC));
		}
		
		@Override
		public double tinhChuVi() {
			return canhA + canhB + canhC;
		}
		
		@Override
		public void hienThiThongTin() {
			super.hienThiThongTin();
			System.out.println("Hình " + ten + " có cạnh thứ nhất là: " + canhA);
			System.out.println("Hình " + ten + " có cạnh thứ hai là: " + canhB);
			System.out.println("Hình " + ten + " có cạnh thứ ba là: " + canhC);
			System.out.println("Hình " + ten + " có diện tích là: " + tinhDienTich());
			System.out.println("Hình " + ten + " có chu vi là: " + tinhChuVi());
		}
	
		//phương thức riêng
		public boolean kiemTraHopLe() {
			if (canhA > 0 && canhB > 0 && canhC > 0 &&
				((canhA + canhB) > canhC) && ((canhA + canhC) > canhB) && ((canhB + canhC) > canhA)) {
				return true;
			} else return false;
		}
}
