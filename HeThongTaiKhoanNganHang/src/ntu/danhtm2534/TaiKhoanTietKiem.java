package ntu.danhtm2534;

import java.util.Scanner;

//Lớp con: Tài khoản tiết kiệm
//File: TaiKhoanTietKiem.java

public class TaiKhoanTietKiem extends TaiKhoan {
	private int kyHan;
	private double laiSuat;
	private int soThangGuiHienTai;
	
	public TaiKhoanTietKiem(String soTaiKhoan, String tenChuTaiKhoan, double soDu, int kyHan, double laiSuat, int soThangGuiHienTai) {
		super(soTaiKhoan, tenChuTaiKhoan, soDu);
		this.kyHan = kyHan;
		this.laiSuat = laiSuat;
		this.soThangGuiHienTai = soThangGuiHienTai;
	}
	
	//ghi đè phương thức rút tiền; kiểm tra số tháng thực tế đã gửi
	@Override
	public void rutTien(double soTien) {
		if (this.soThangGuiHienTai < this.kyHan) {
			System.out.println("Lỗi: không được rút tiền trước kỳ hạn (" + this.kyHan + " tháng)!");
		} else {
			super.rutTien(soTien);
		}
	}

	
	//phương thức riêng, lãi suất/năm
	public double tinhLaiSuat(double soTien) {
		return this.soDu * this.kyHan * (this.laiSuat/12);
	}
	
}
