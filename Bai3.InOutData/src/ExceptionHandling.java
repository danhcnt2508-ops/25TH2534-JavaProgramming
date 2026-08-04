//Xử lý ngoại lệ

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Nhập số nguyên: ");
			int number = scanner.nextInt();
			
			System.out.print("Nhập số chia: ");
			int divisor = scanner.nextInt();
			
			int result = number / divisor;
			System.out.println("Kết quả: " + result);
			
		} catch (InputMismatchException e) {
			System.out.println("Lỗi: Bạn phải nhập số nguyên!");
		
		} catch (ArithmeticException e) {
			System.out.println("Lỗi: Không thể chia cho 0!");
		
		} catch (Exception e) {
			System.out.println("Lỗi không xác định: " + e.getMessage());
		
		} finally {
			System.out.println("Chương trình kết thúc.");
			scanner.close();
		}

	}

}
