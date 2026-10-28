import java.util.Scanner;

public class BasicTrialDivision {
	
	
	static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		
		//check divisibility from 2 to n-1
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;
		
		return true;
		
		
	}

	public static void main(String[] args) {
		System.out.print("Nhap vao so tu nhien n: ");
		Scanner scanner = new Scanner(System.in);
		String neutural = scanner.nextLine();
		int n = Integer.parseInt(neutural);
		if (isPrime(n)) {
			System.out.println("'true");
		} else {
			System.out.println("false");
		}
	}

}
