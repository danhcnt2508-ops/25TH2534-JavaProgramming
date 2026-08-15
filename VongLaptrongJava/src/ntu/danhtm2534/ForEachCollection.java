package ntu.danhtm2534;

import java.util.ArrayList;
import java.util.List;

public class ForEachCollection {

	public static void main(String[] args) {
		// Duyệt List
		List<String> fruits = new ArrayList<>();
		fruits.add("Táo");
		fruits.add("Chuối");
		fruits.add("Cam");
		fruits.add("Xoài");
		
		System.out.println("Danh sách trái cây: ");
		for (String fruit : fruits) {
			System.out.println("- " + fruit);
		}
		
		//Duyệt và xử lý
		List<Integer> scores = List.of(85, 90, 70, 96, 88);
		int total = 0;
		
		for (int score : scores) {
			total += score;
		}
		
		double average = (double) total /scores.size();
		System.out.println("Điểm trung bình: " + average);

	}

}
