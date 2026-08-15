package ntu.danhtm2534;

public class ForEachArray {

	public static void main(String[] args) {
		// Duyệt mảng số nguyên
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		//in các số trong mảng
		System.out.print("Các số trong mảng: ");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		//tính tổng các số trong mảng
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		System.out.println("Tổng: " + sum);
		
		//Tìm số lớn nhất
		int max = numbers[0];
		for (int num : numbers) {
			if(num > max) {
				max = num;
			}
		}
		System.out.println("Số lớn nhất là: " + max);

	}

}
