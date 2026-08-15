package ntu.danhtm2534;

import java.util.Scanner;

public class SwitchTraditional {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số thứ tự của ngày: ");
		int dayOfWeek = scanner.nextInt();
		String dayName;
		
		switch (dayOfWeek) {
			case 1:
				dayName = "Thứ Hai";
				break;
			case 2:
				dayName = "Thứ Ba";
				break;
			case 3:
				dayName = "Thứ Tư";
				break;
			case 4:
				dayName = "Thứ Năm";
				break;
			case 5:
				dayName = "Thứ Sáu";
				break;
			case 6:
				dayName = "Thứ Bảy";
				break;
			case 7:
				dayName = "Chủ nhật";
				break;
			default:
				dayName = "Ngày nhập không hợp lệ";
		}
		
		System.out.println("Ngày thứ " + dayOfWeek + " của tuần là: " + dayName);
	}

}
