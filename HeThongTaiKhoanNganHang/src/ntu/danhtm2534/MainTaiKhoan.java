package ntu.danhtm2534;

import java.util.ArrayList;
import java.util.Scanner;


public class MainTaiKhoan {

	public static void main(String[] args) {
		//1. Tạo danh sách tài khoản, biến nhập liệu,lựa chọn
		ArrayList<TaiKhoan> dstaiKhoan = new ArrayList<>();
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
					break;
				case 2: 
					break;
				case 3: 
					break;
				case 4: 
					break;
				case 5: 
					break;
				case 6: 
					break;
				case 0: 
					break;
				default: 
					System.out.println("Lựa chọn không hợp lệ!");
			}
			
			
		} while (chon != 0);
		scanner.close();
		
		
		//3.Thực hiện từng loại chức năng
		

	}

}
