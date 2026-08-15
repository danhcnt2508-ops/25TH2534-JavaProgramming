package ntu.danhtm2534;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào tên màu tiếng Anh: ");
		String color = scanner.nextLine();
		
		switch (color) {
			case "RED":
				System.out.println(color + " là màu đỏ");
				break;
			case "GREEN":
				System.out.println(color + " là màu xanh lá");
				break;
			case "BLUE":
				System.out.println(color + " là màu xanh dương");
				break;	
			case "Yellow":
				System.out.println(color + " là màu vàng");
				break;
			default:
				System.out.println("Màu khác");
		}
		

	}

}
