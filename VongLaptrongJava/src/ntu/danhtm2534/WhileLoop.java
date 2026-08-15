package ntu.danhtm2534;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// in các số từ 1 đến 10
		int i = 1;
		System.out.print("Các số từ 1 đến 10: ");
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		
		//Tính giai thừa của 1 số
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào 1 số tự nhiên: ");
		int number = scanner.nextInt();
		int factorial = 1;
		int counter = 1;
			
		while (counter < number) {
			factorial *= counter;
			counter++;
		}
		
		System.out.println(number + "! =" + factorial);
		
	}

}
