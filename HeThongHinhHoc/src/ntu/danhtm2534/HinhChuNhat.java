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
		return (double) chieuDai * chieuRong;
	}
	
	@Override
	public double tinhChuVi() {
		return (double) (chieuDai + chieuRong) * 2;
	}
	
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("HCN có chiều dài là: " + chieuDai);
		System.out.println("HCN có chiều rộng là: " + chieuRong);
		System.out.println("HCN có diện tích là: " + tinhDienTich());
		System.out.println("HCN có chu vi là: " + tinhChuVi());
	}
}
