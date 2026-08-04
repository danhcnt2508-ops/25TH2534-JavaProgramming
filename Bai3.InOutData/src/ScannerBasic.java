//Nhập dữ liệu từ bàn phím
import java.util.Scanner;

public class ScannerBasic {

	public static void main(String[] args) {
		//Tạo đối tượng scanner
		Scanner scanner = new Scanner(System.in);

		//Đọc các kiểu dữ liệu khác nhau
		System.out.print("Nhập tên: ");
		String name = scanner.nextLine();
		
		System.out.print("Nhập tuối: ");
		String ageInput = scanner.nextLine();
		int age = Integer.parseInt(ageInput);
		
		System.out.print("Nhập chiều cao (m): ");
		String heightInput = scanner.nextLine();
		double height = Double.parseDouble(heightInput);
		
		
		System.out.print("Bạn có thích Java không? (true/false): ");
		String likesJavaInput = scanner.nextLine();
		boolean likesJava = Boolean.parseBoolean(likesJavaInput);
		
		//Hiển thị kết quả
		System.out.printf("%n=== THÔNG TIN ===");
		System.out.printf("%nTên: %s", name);
		System.out.printf("%nTuổi: %d", age);
		System.out.printf("%nChiều cao: %.2f m", height);
		System.out.printf("%nThích Java: %b", likesJava);
		
		//Đóng scanner
		scanner.close();
	}

}
