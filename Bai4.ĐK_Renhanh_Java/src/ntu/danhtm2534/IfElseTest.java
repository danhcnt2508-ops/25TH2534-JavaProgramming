package ntu.danhtm2534;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		
		System.out.println("Hãy nhập vào 1 số nguyên: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if(number % 2 == 0) {
			System.out.print(number + " là số chẵn.");
		} else {
			System.out.print(number + " là số lẻ.");
		}

	}

}
