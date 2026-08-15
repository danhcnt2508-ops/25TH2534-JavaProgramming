package ntu.danhtm2534;

public class VonglapForcoban {

	public static void main(String[] args) {
		// In các số từ 1 đến 10
		System.out.print("Các số từ 1 đến 10: ");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//Đếm ngược từ 10 đến 1
		System.out.print("Đếm ngược: ");
		for(int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//Tăng bước nhảy
		System.out.print("Số chẵn từ 2 đến 20: ");
		for (int i = 2; i <= 20; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//Đếm ngươc từ 20 đến 0
		System.out.print("Đếm ngược đến 0: ");
		for (int i = 20; i >= 0; i-=2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
