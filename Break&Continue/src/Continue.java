
public class Continue {

	public static void main(String[] args) {
		// In số lẻ từ 1 đến 10
		System.out.print("Số lẻ từ 1 đến 10: ");
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;	//bỏ qua số chẵn
			}
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//Bỏ qua số chia hết cho 3
		System.out.print("Số không chia hết cho 3: ");
		
		for (int i = 1; i <= 20; i++) {
			if(i % 3 == 0) {
				continue;
			} 
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
