/*Bài 3: Giải phương trình bậc 1: ax + b = 0
	* Nhập a, b
	* Tính và in nghiệm x
  
 */
import java.util.Scanner;


public class Phuongtrinhbac1 {

	public static void main(String[] args) {
		//Cho phương trình bâc 1
		System.out.println("Cho phương trình bậc 1: ax + b = 0");
		
		Scanner scanner = new Scanner(System.in);
		//Nhập biến
		System.out.print("Nhập vào giá trị a: ");
		int a = scanner.nextInt();
		System.out.print("Nhập vào giá trị b: ");
		int b = scanner.nextInt();
		double x;
		
		//Giải phương trình
		if(a != 0) {
			x = -b/a;
			System.out.println("Phương trình có nghiệm là %,.2", x)
		} else if(b = 0) {
			
		}
		
	}

}
