/*
 * Tạo chương trình nhật ký cá nhân (ghi và đọc từ file)
 */
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Nhatky_canhan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=== NHẬT KÝ CÁ NHÂN ===");
		String NhatKy1 = scanner.nextLine();
		
		//Ghi nhật ký vào file
				try {
					FileWriter writer = new FileWriter("nhatky.txt", true);
					writer.write("=== NHẬT KÝ CÁ NHÂN ===\n");
					writer.write(NhatKy1 + "\n");
					writer.close();
					
					System.out.println("\nĐã lưu nhật ký vào file nhatky.txt");
				} catch (IOException e) {
					System.out.println("Lỗi ghi file: " + e.getMessage());
				}
		//Đọc file nhật ký
				try {
					BufferedReader br = new BufferedReader(new FileReader("nhatky.txt"));
					String line;
					while ((line = br.readLine()) != null) {
						System.out.println(line);
					}
					br.close();
				} catch (IOException e) {
					System.out.println("Lỗi đọc file: " + e.getMessage());
				}

				scanner.close();

	}

}
