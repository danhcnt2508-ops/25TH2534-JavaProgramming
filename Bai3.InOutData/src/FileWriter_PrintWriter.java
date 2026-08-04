//Đọc và ghi file văn bản

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter_PrintWriter {

	public static void main(String[] args) {
		//Sử dụng FileWriter
		try {
			FileWriter writer = new FileWriter("data.txt");
			writer.write("Dòng 1: Học Java\n");
			writer.write("Dòng 2: Nhập xuất file\n");
			writer.close();
			System.out.println("Đã ghi file thành công!");
		} catch (IOException e) {
			System.out.println("Lỗi ghi file: " + e.getMessage());
		}
		
		//Sử dụng PrintWriter
		try {
			PrintWriter pw = new PrintWriter("output.txt");
			pw.println("Tên: Nguyễn Văn Biển");
			pw.printf("Tuổi: %d%n", 41);
			pw.printf("Điểm: %.2f%n", 8.5);
			pw.close();
		} catch (IOException e) {
			System.out.println("Lỗi: " + e.getMessage());
		}
	}

}
