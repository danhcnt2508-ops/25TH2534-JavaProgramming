package ntu.danhtm2534;

//Lớp con:Tài khoản thanh toán
//File: TaiKhoanThanhToan.java
public class TaiKhoanThanhToan extends TaiKhoan {
	private double hanMucRut;
	private double phiGiaoDich;
	
	public TaiKhoanThanhToan(String soTaiKhoan, String tenChuTaiKhoan, double soDu, double hanMucRut, double phiGiaoDich) {
		super(soTaiKhoan, tenChuTaiKhoan, soDu);
		this.hanMucRut = hanMucRut;
		this.phiGiaoDich = phiGiaoDich;
	}
	
	//ghi đè phương thức rút tiền
	@Override
	public void rutTien(double soTien) {
		//kiểm tra hạn mức rút
		if (soTien > this.hanMucRut) {
			System.out.println("Lỗi: Số tiền rút vượt quá hạn mức cho phép (" + this.hanMucRut + " )");
			return;
		}
		
		//tính tổng số tiền cần trừ
		double tongTienTru = soTien + this.phiGiaoDich;
		
		//kiểm tra số dư
		if (tongTienTru > this.soDu) {
			System.out.println("Số dư không đủ để giao dịch (đã bao gồm phí)");
		} else {
			this.soDu -= tongTienTru;
			System.out.println("Số tiền thành công: " + soTien + " | Phí: " + this.phiGiaoDich + " |Số dư còn lại: " + this.soDu);
		}
			
			
	}
	
	//thêm phương thức
	public void thanhToanHoaDon(String loaiHoaDon, double soTien) {
		double tongTienTru = soTien + this.phiGiaoDich;
		
		if (tongTienTru > this.soDu) {
			System.out.println("Số dư không đủ để thanh toán hóa đơn " + loaiHoaDon);
		} else {
			this.soDu -= tongTienTru;
			System.out.println("Thanh toán hóa đơn [" + loaiHoaDon + "] thành công: " + soTien + " | Phí: " + this.phiGiaoDich + " | Số dư còn lại: " + this.soDu);
		}
	}
}
