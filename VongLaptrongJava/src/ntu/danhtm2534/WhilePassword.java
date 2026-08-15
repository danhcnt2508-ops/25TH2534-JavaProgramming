package ntu.danhtm2534;

import java.util.Scanner;

public class WhilePassword {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String correctPassword = "java12345";
		String userPassword;
		int attempts = 3;
		
		while (attempts > 0) {
			System.out.print("Nhập mật khẩu (" + attempts + " lần còn lại): ");
			userPassword = scanner.nextLine();
			
			if(userPassword.equals(correctPassword)) {
				System.out.println("Đăng nhập thành công.");
				break;
			} else {
				attempts--;
				if(attempts > 0) {
					System.out.println("Mật khẩu sai. Vui lòng nhập lại.");
				}
			}
		}
		
		if (attempts == 0) {
			System.out.println("Tài khoản bị khóa.");
		}
		
		scanner.close();
	}

}
