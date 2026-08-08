/**
 * Bài 2.Quy đổi tiền tệ
 * Viết chương trình quy đổi
 * USD sang VND (1USD = 26.263 VND)
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class QuydoiTienteUSD_VND {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			//Khai báo giá USD
			System.out.print("Nhập giá USDtoVND: ");
			double giaUSDtoVND = scanner.nextDouble();
				
			//Nhập số tiền USD
			System.out.print("Số tiền USD: ");
			double tienUSD = scanner.nextDouble();
			
			//Công thức và in kết quả đổi
			double tienDoiUSDtoVND = tienUSD * giaUSDtoVND;
			System.out.printf("%,.2f USD đổi sang VND là: %,.2f đồng\n",tienUSD,tienDoiUSDtoVND);
			
		} catch (InputMismatchException e) {
            System.out.println("Lỗi: Bạn phải nhập vào 1 số hợp lệ (số nguyên hoặc số thực)!");
            
        } finally {
        	 System.out.println("Chương trình kết thúc.");
             scanner.close();
		}

	}

}
