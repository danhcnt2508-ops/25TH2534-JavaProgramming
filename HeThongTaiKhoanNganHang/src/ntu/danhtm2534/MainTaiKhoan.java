package ntu.danhtm2534;

import java.util.ArrayList;
import java.util.Scanner;


public class MainTaiKhoan {

	public static void main(String[] args) {
		//1. Tạo danh sách tài khoản, biến nhập liệu,lựa chọn
		ArrayList<TaiKhoan> dsTaiKhoan = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int chon;
		
		//2.Tạo bảng lựa chọn chức năng
		do {
			System.out.println("\n=== HỆ THỐNG QUẢN LÝ TÀI KHOẢN NGÂN HÀNG ===");
			System.out.println("1. Thêm tài khoản tiết kiệm");
			System.out.println("2. Thêm tài khoản thanh toán");
			System.out.println("3. Hiển thị thông tin tất cả tài khoản");
			System.out.println("4. Hiển thị thông tin tài khoản theo số tài khoản");
			System.out.println("5. Gọi phương thức riêng (Tính lãi suất/ Thanh toán hóa đơn)");
			System.out.println("6. Rút tiền");
			System.out.println("0. Thoát");
			System.out.println("Chọn chức năng: ");
			chon = Integer.parseInt(scanner.nextLine());
			
			//thực thi theo từng lựa chọn từ 0 đến 6
			switch (chon) {
				case 1:
					System.out.print("Nhập số tài khoản: ");
					String stk1 = scanner.nextLine();
					System.out.print("Nhập tên chủ tài khoản: ");
					String ten1 = scanner.nextLine();
					System.out.print("Nhập số dư: ");
					double sd1 = Double.parseDouble(scanner.nextLine());
					System.out.print("Nhập kỳ hạn (tháng): ");
					int kyHan = Integer.parseInt(scanner.nextLine());
					System.out.print("Nhập lãi suất (vd:0.06): ");
					double laiSuat = Double.parseDouble(scanner.nextLine());
					System.out.print("Nhập số tháng gửi tính đến hiện tại: ");
					int soThang = Integer.parseInt(scanner.nextLine());
					
					TaiKhoan tkTietKiem = new TaiKhoanTietKiem(stk1, ten1, sd1, kyHan, laiSuat, soThang);
					dsTaiKhoan.add(tkTietKiem);
					System.out.println("Thêm tài khoản tiết kiệm thành công.");
					break;
					
				case 2: 
					System.out.print("Nhập số tài khoản: ");
					String stk2 = scanner.nextLine();
					System.out.print("Nhập tên chủ tài khoản: ");
					String ten2 = scanner.nextLine();
					System.out.print("Nhập số dư: ");
					double sd2 = Double.parseDouble(scanner.nextLine());
					System.out.print("Nhập hạn mức rút: ");
					double hanMuc = Double.parseDouble(scanner.nextLine());
					System.out.print("Nhập phí giao dịch: ");
					double phi = Double.parseDouble(scanner.nextLine());
					
					TaiKhoan tkThanhToan = new TaiKhoanThanhToan(stk2, ten2, sd2, hanMuc, phi);
					dsTaiKhoan.add(tkThanhToan);
					break;
					
					
				case 3: 
					System.out.println("\n--- DANH SÁCH TÀI KHOẢN ---");
					for (TaiKhoan tk : dsTaiKhoan) {
						
						tk.hienThiThongTin();
						System.out.println("----------------------");
					}
					break;
					
					
				case 4:
					System.out.print("Nhập số tài khoản cần tìm: ");
					String timStk = scanner.nextLine();
					boolean found = false;
					for (TaiKhoan tk : dsTaiKhoan) {
                        if (tk.getSoTaiKhoan().equalsIgnoreCase(timStk)) {
                            tk.hienThiThongTin();
                            found = true;
                            break;
                        }
                    }
					if(!found) {
						System.out.println("Không tìm thấy số tài khoản này");
					}
					break;
					
				case 5: 
					System.out.print("Nhập số tài khoản cần gọi phương thức riêng: ");
					String stkRieng = scanner.nextLine();
					boolean foundRieng = false;
					for (TaiKhoan tk : dsTaiKhoan) {
						if (tk.getSoTaiKhoan().equalsIgnoreCase(stkRieng)) {
							foundRieng = true;
							if(tk instanceof TaiKhoanTietKiem) {
								TaiKhoanTietKiem tktk = (TaiKhoanTietKiem) tk;
								double tienLai = tktk.tinhLaiSuat(tktk.getSoDu());
								System.out.println("Tiền lãi dự tính: " + tienLai);
							} else if (tk instanceof TaiKhoanThanhToan) {
								TaiKhoanThanhToan tktt = (TaiKhoanThanhToan) tk;
								System.out.print("Nhập loại hóa đơn (vd: điện, nước): ");
								String loaiHD = scanner.nextLine();
								System.out.print("Nhập số tiền hóa đơn: ");
								double tienHD = Double.parseDouble(scanner.nextLine());
								tktt.thanhToanHoaDon(loaiHD, tienHD);
							}
							break;
						}
					}
					if (!foundRieng) {
						System.out.println("Không tìm thấy tài khoản");
					}
					break;
					
				case 6:
					System.out.print("Nhập số tài khoản muốn rút tiền: ");
					String stkRut = scanner.nextLine();
					System.out.print("Nhập số tiền muốn rút: ");
					double tienRut = Double.parseDouble(scanner.nextLine());
					for (TaiKhoan tk : dsTaiKhoan) {
						if(tk.getSoTaiKhoan().equalsIgnoreCase(stkRut)) {
							tk.rutTien(tienRut);
							break;
						}
					}				
					break;
					
				case 0: 
					System.out.println("Đã thoát chương trình.");
					break;
					
				default: 
					System.out.println("Lựa chọn không hợp lệ!");
			}
		
		} while (chon != 0);
		scanner.close();
		
		
		//3.Thực hiện từng loại chức năng
		

	}

}
