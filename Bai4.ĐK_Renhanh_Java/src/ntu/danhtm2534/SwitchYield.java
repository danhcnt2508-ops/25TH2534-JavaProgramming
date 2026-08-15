package ntu.danhtm2534;

import java.util.Scanner;

public class SwitchYield {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào tên màu bạn muốn tra mã: ");
		String color = scanner.nextLine();
		
		//Switch với yield
		String colorCode = switch (color) {
			case "RED" -> {
				System.out.println("Tìm mã màu...");
				yield "FF0000";
			}
			case "GREEN" -> {
				System.out.println("Tìm mã màu...");
				yield "00FF00";
			}
			case "BLUE" -> {
				System.out.println("Tìm mã màu...");
				yield "0000FF";	
			}
			default -> {
				System.out.println("Tìm mã màu...");
				yield "Chưa xác định";
			}
		};
		
		System.out.println("Màu " + color + " có mã màu là: " + colorCode);
	}

}
