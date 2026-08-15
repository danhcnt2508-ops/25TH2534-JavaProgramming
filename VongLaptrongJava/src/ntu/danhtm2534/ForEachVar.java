package ntu.danhtm2534;

import java.util.HashMap;
import java.util.Map;

public class ForEachVar {

	public static void main(String[] args) {
		// Sử dụng var với mảng
		var colors = new String[] {"Đỏ", "Xanh", "Vàng"};
		for (var color : colors) {
			System.out.println("Màu: " + color);
		}
		
		//Sử dụng var với Map
		Map<String, Integer> studentScores = new HashMap<>();
		studentScores.put("An", 85);
		studentScores.put("Bình", 92);
		studentScores.put("Châu", 78);
		
		for (var entry : studentScores.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

}
