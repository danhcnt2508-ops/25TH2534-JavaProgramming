import java.util.Scanner;

public class InfiniteLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Vòng lặp vô hạn có điều kiện dừng
		while (true) {
			System.out.print("Nhập số (0 để dừng): ");
			int number = scanner.nextInt();
			
			if (number == 0) {
				System.out.println("Đã dừng chương trình.");
				break;
			}
			
			System.out.println("Bạn đã nhập số: " + number);
		}
		
		scanner.close();

	}

}
