//Đọc file

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class BufferedReader_Scanner {

	public static void main(String[] args) {
		// Sử dụng BufferedReader
		System.out.println("=== Đọc bằng BufferedReader ===");
		try {
			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Lỗi đọc file: " + e.getMessage());
		}
		
		//Sử dụng Scanner
		System.out.println("\n=== Đọc bằng Scanner ===");
		try {
			Scanner fileScanner = new Scanner (new java.io.File("output.txt"));
			while (fileScanner.hasNextLine()) {
				System.out.println(fileScanner.nextLine());
			}
			fileScanner.close();
		} catch (IOException e) {
			System.out.println("Lỗi: " + e.getMessage());
		}

	}

}
