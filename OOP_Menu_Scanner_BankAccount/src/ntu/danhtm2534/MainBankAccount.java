package ntu.danhtm2534;

import java.util.Scanner;

public class MainBankAccount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Tạo 1 tài khoản nhận để test tính năng chuyển tiền
		TaiKhoanNganHang tkNhan = new TaiKhoanNganHang("9999999999", "Trường TCN Củ Chi", 0.0);
		
		System.out.println("=== TẠO TÀI KHOẢN CỦA BẠN");
		System.out.print("Nhập số tài khoản: ");
		String soTK = scanner.nextLine();
		
		System.out.print("Nhập tên chủ tài khoản: ");
		String tenChu = scanner.nextLine();
		
		System.out.print("Nhập số dư ban đầu: ");
		double soDuBanDau = scanner.nextDouble();
		
		//Khởi tạo tài khoản bằng Constructor 3
		TaiKhoanNganHang tkCaNhan = new TaiKhoanNganHang(soTK, tenChu, soDuBanDau);
		System.out.println("\n Khởi tạo tài khoản thành công.");
		
		int chon;
		do {
			System.out.println("\n==== MENU GIAO DỊCH ===");
			System.out.println("1. Kiểm tra thông tin tài khoản");
			System.out.println("2. Gửi tiền");
			System.out.println("3. Rút tiền");
			System.out.println("4. Chuyển khoản (đến TK Trường");
			System.out.println("5. Thoát");
			System.out.print("Chọn chức năng (1-5): ");
			chon = scanner.nextInt();
			
			switch (chon) {
				case 1:
					System.out.println("\n--- THÔNG TIN TÀI KHOẢN ---");
					System.out.println("Số TK: " + tkCaNhan.getSoTaiKhoan());
					System.out.println("Chủ Tk: " + tkCaNhan.getTenChuTaiKhoan());
					System.out.println("Số dư hiện tại: " + tkCaNhan.getSoDu());
					break;
					
				case 2:
					System.out.print("Nhập số tiền muốn gửi: ");
					double tienGui = scanner.nextDouble();
					tkCaNhan.guiTien(tienGui);
					break;
					
				case 3:
					System.out.print("Nhập số tiền muốn rút: ");
					double tienRut = scanner.nextDouble();
					tkCaNhan.rutTien(tienRut);
					break;
				case 4:
					System.out.print("Nhập số tiền muốn chuyển:");
					double tienChuyen = scanner.nextDouble();
					//gọi phương thức chuyển khoản sang tkNhan
					tkCaNhan.chuyenTien(tkNhan, tienChuyen);
					break;	
				case 5:
					System.out.println("Cảm ơn bạn đã sử dụng dịch vụ!");
					break;
					
				default:
					System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
			}
			
		} while (chon != 5);
		
		scanner.close();
	}

}
