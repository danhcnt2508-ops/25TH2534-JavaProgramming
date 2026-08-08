/**
 * Bài tập 1. Tính tổng 2 số
 * Nhập 2 số
 * tính tổng và in ra kết quả
 */

import java.util.Scanner;

public class SumTwoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập số thứ nhất: ");
		double num1 = scanner.nextDouble();
		
		System.out.print("Nhập số thứ hai: ");
		double num2 = scanner.nextDouble();
		
		double sum = num1 + num2;
		System.out.printf("Tổng của %.2f + %.2f là %.2f%n", num1, num2, sum);
		
		scanner.close();
		

	}

}
