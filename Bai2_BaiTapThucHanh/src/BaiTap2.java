//Bài tập 2. Chuyển đổi nhiệt độ

public class BaiTap2 {

	public static void main(String[] args) {
		// Chuyển từ Celsius sang Fahremheit
		//Công thức: F = (C × 9/5) + 32
		
		//Khai báo biến và gán giá trị ban đầu
		double celsius = 25.0;
		
		//Khai báo và tính toán
		double fahrenheit = (celsius * 9/5) + 32;
		
		//In kết quả
		System.out.println(celsius + "°C = " + fahrenheit + "°F");
		
	}

}
