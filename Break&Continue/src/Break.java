
public class Break {

	public static void main(String[] args) {
		// Tìm số đầu tiên chia hết cho 7 và 5
		System.out.print("Số đầu tiên chia hết cho 7 và 5:");
		
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0 && i % 5 == 0) {
				System.out.println(i);
				break; //Thoát khi tìm thấy số đầu tiên
			}
		}
		
		//Break với nhãn (labeled break)
		outerLoop:
			for (int i = 1; i <= 3; i++) {
				System.out.println("Vòng ngoài: " + i);
				
				for (int j = 1; j <= 3; j++) {
					System.out.println(" Vòng trong: " + j);
					
					if (i == 2 && j == 2) {
						break outerLoop; //Thoát cả 2 vòng lặp
					}
				}
			}
		
	}

}
