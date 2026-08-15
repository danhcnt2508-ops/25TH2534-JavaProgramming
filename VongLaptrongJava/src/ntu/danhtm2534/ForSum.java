package ntu.danhtm2534;

public class ForSum {

	public static void main(String[] args) {
		// Tính tổng từ 1 đến 100
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("Tổng từ 1 đến 100 là: " + sum);
		
		//Tính tổng các số chẳn từ 1 đến 100
		int evenSum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			}
		}
		System.out.println("Tổng các số chẳn từ 1 đến 100: " + evenSum);
		
		//Tính tổng các số lẻ từ 1 đến 100
		int oddSum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				oddSum += i;
			}
		}
		System.out.println("Tổng các số lẻ từ 1 đến 100:" + oddSum);
	}

}
