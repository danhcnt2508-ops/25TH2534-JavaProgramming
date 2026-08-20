package ntu.danhtm2534;

//Lớp con: Hình chữ nhật
//File: HinhChuNhat
public class HinhChuNhat extends HinhHoc {
	private int chieuDai;
	private int chieuRong;
	
	public HinhChuNhat(String ten, String mauSac, int chieuDai, int chieuRong) {
		super(ten, mauSac);
		this.chieuDai =chieuDai;
		this.chieuRong = chieuRong;
	}
	
	//ghi đè phương thức của HinhHoc
	@Override
	public double tinhDienTich() {
		dienTich = (double) chieuDai * chieuRong;
		return dienTich;
	}
	
	@Override
	public double tinhChuVi() {
		chuVi = (double) (chieuDai + chieuRong) * 2;
		return chuVi;
	}
	
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("HCN có chiều dài là: " + chieuDai);
		
		
		
	}
}
