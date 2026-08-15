package ntu.danhtm2534;

import java.util.Scanner;

public class DoWhileMenu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("\n=== MENU CHƯƠNG TRÌNH ===");
			System.out.println("1. Tính tổng hai số");
			System.out.println("2. Tính hiệu 2 số");
			System.out.println("3. Tính tích hai số");
			System.out.println("4. Tính thương hai số");
			System.out.println("5. Thoát chương trình");
			System.out.print("Chọn chức năng (1-5): ");
			
			choice = scanner.nextInt();
			
			switch (choice) {
				case 1:
					System.out.print("Nhập số thứ nhất: ");
					double a1 = scanner.nextDouble();
					System.out.print("Nhập số thứ hai: ");
					double b1 = scanner.nextDouble();
					System.out.print("Tổng: " + (a1+b1));
					break;
				
				case 2:
					System.out.print("Nhập số thứ nhất: ");
					double a2 = scanner.nextDouble();
					System.out.print("Nhập số thứ hai: ");
					double b2 = scanner.nextDouble();
					System.out.print("Hiệu: " + (a2-b2));
					break;
					
				case 3:
					System.out.print("Nhập số thứ nhất: ");
					double x1 = scanner.nextDouble();
					System.out.print("Nhập số thứ hai: ");
					double y1 = scanner.nextDouble();
					System.out.print("Tích: " + (x1*y1));
					break;
					
				case 4:
					System.out.print("Nhập số thứ nhất: ");
					double x2 = scanner.nextDouble();
					System.out.print("Nhập số thứ hai: ");
					double y2 = scanner.nextDouble();
					if (y2 != 0) {
					System.out.print("Tổng: " + (x2/y2));
					} else {
						System.out.println("Vui lòng nhập mẫu số khác 0.");
					}
					break;
					
				case 5:
					System.out.print("Cảm ơn bạn đã sử dụng.");
					break;
					
				default:
					System.out.print("Lựa chọn không hợp lệ.");
			}
		
		} while (choice != 5);
		
		scanner.close();

	}

}
