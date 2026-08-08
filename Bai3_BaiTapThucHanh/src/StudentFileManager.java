/*
 * Bài tập 3.Quản lý sinh viên với file
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentFileManager {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=== NHẬP THÔNG TIN SINH VIÊN ===");
		System.out.print("Mã sinh viên: ");
		String id = scanner.nextLine();
		
		System.out.print("Họ và tên: ");
		String name = scanner.nextLine();
		
		System.out.print("Điểm Toán: ");
		double math = scanner.nextDouble();
		
		System.out.print("Điểm Lý: ");
		double physics = scanner.nextDouble();
		
		System.out.print("Điểm Hóa: ");
		double chemistry = scanner.nextDouble();
		
		double average = (math + physics + chemistry)/3;
		
		//Ghi vào file
		try {
			FileWriter writer = new FileWriter("students.txt", true);
			writer.write("=== SINH VIÊN ===\n");
			writer.write("Mã SV: " + id + "\n");
			writer.write("Họ tên: " + name + "\n");
			writer.write(String.format("Điểm Toán: %.1f\n", math));
			writer.write(String.format("Điểm Lý: %.1f\n", physics));
			writer.write(String.format("Điểm Hóa: %.1f\n", chemistry));
			writer.write(String.format("Điểm TB: %.2f\n", average));
			writer.write("================\n\n");
			writer.close();
			
			System.out.println("\nĐã lưu thông tin vào file students.txt");
		} catch (IOException e) {
			System.out.println("Lỗi ghi file: " + e.getMessage());
		}
		
		scanner.close();
	}

}
