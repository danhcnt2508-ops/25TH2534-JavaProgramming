package ntu.danhtm2534;

import java.util.Scanner;

public class SwitchArrow {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập và ngày bạn muốn xác định là làm việc hay nghỉ: ");
		int day = scanner.nextInt();
		
		//switch với -> (no break)
		String dayType = switch (day) {
			case 1,2,3,4,5 -> "ngày làm việc";
			case 6,7 -> "ngày nghỉ";
			default -> "ngày không hợp lệ";
		};
		
		System.out.println("Ngày thứ " + day + " là: " + dayType);

	}

}
