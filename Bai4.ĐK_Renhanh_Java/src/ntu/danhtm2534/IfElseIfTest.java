package ntu.danhtm2534;
import java.util.Scanner;

public class IfElseIfTest {

	public static void main(String[] args) {
		System.out.print("Nhập vào điểm của bạn (>=0): ");
		Scanner scanner = new Scanner(System.in);
		int diemTB = scanner.nextInt();
		
		String xepLoai;
		
		if (diemTB >= 9) {
			xepLoai = "Xuất sắc";
		} else if (diemTB >= 8) {
			xepLoai = "Giỏi";
		} else if (diemTB >= 7) {
			xepLoai = "Khá";
		} else if (diemTB >= 5) {
			xepLoai = "Trung bình";
		} else xepLoai = "Yếu";
		
		System.out.println("Điểm trung bình: " + diemTB);
		System.out.println("Xếp loại: " + xepLoai);

	}

}
