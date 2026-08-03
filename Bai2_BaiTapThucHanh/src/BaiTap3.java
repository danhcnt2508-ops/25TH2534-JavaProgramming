//Bài tập 3. Tính chỉ số BMI

public class BaiTap3 {

	public static void main(String[] args) {
		//BMI = cân nặng (kg) / (chiều cao (m) * chiều cao (m))
		
		//khai báo biến và gán giá trị
		double weight = 65.5;	//kg
		double height = 1.70;	//m
		
		//công thức tính bmi
		double bmi = weight / (height * height);
		
		//in thông tin ban đầu
		System.out.println("Cân nặng: " + weight + " kg");
		System.out.println("Chiều cao: " + height + " m");
		System.out.println("Chỉ số BMI: " + bmi);
		
		//Phân loại BMI
		if (bmi < 18.5) {
			System.out.println("Phân loại: Thiếu cân");
		} else if (bmi < 25) {
			System.out.println("Phân loại: Bình thường");
		} else if (bmi < 30) {
			System.out.println("Phân loại: Thừa cân");
		} else {
			System.out.println("Phân loại: Béo phì");
		}
	}

}
