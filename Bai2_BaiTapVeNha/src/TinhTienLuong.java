/**
 * Bài 1.Tính tiền lương
 * Viết chương trình tính lương nhân viên 
 */

/**
 * Nhập số giờ làm và lương theo giờ
 * Tính tổng lương
 * Nếu làm trên 40 giờ, những giờ vượt tính 1.5 lần
 */
import java.util.Scanner;

public class TinhTienLuong {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// Khai báo biên
		System.out.print("Nhập số giờ làm: ");
		int soGioLam = scanner.nextInt();
		System.out.print("Nhập lương/giờ: ");
		double luongTheoGio = scanner.nextDouble();
		

		//Công thức tính lương
		double tongLuong;
			
		
		
		if (soGioLam <= 40) {
			tongLuong = soGioLam * luongTheoGio;
		} else tongLuong = 40 * luongTheoGio + (soGioLam - 40) * 1.5 * luongTheoGio;
		
		//In kết quả
		System.out.println("Lương của nhân viên: " + tongLuong + " đồng");
		System.out.println("Tiền lương của nhân viên (VND): " + String.format("%,.0f", tongLuong) + " đ");
	}

}
