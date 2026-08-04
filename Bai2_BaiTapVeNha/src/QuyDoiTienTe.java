/**
 * Bài 2.Quy đổi tiền tệ
 * Viết chương trình quy đổi
 * USD sang VND (1USD = 26.263 VND)
 * EUR sang VND (1 EUR = 30.239 VND)
 */
import java.util.Scanner;

public class QuyDoiTienTe {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	//Khai báo giá USD
	System.out.print("Nhập giá USDtoVND: ");
	double giaUSDtoVND = scanner.nextDouble();
		
	//Nhập số tiền USD
	System.out.print("Số tiền USD: ");
	double tienUSD = scanner.nextDouble();
	
	//Công thức và in kết quả đổi
	double tienDoiUSDtoVND = tienUSD * giaUSDtoVND;
	System.out.printf("%,.2f USD đổi sang VND là: %,.2f đồng\n",tienUSD,tienDoiUSDtoVND);
	
	//Khai báo giá EUR
	System.out.print("Nhập giá EURtoVND: ");
	double giaEURtoVND = scanner.nextDouble();
			
	//Nhập số tiền EUR
	System.out.print("Số tiền EUR: ");
	double tienEUR = scanner.nextDouble();
		
	//Công thức và in kết quả đổi
	double tienDoiEURtoVND = tienEUR * giaEURtoVND;
	System.out.printf("%,.2f EUR đổi sang VND là: %,.2f đồng",tienEUR,tienDoiEURtoVND);
		
	scanner.close();
	}

}
