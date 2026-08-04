//Định dạng đầu ra với printf()

public class PrintfDemo {

	public static void main(String[] args) {
		//Khai báo và gán giá trị biến
		String name = "Trần Mộng Danh";
		int age = 41;
		double salary = 15000000.9876;
		
		//in cơ bản
		System.out.printf("Tên: %s, Tuổi: %d, Lương: %.2f%n", name, age, salary);
		
		//Căn lề trái/phải
		System.out.printf("|%-20s|%10d|%15.2f|%n", name, age, salary);
		
		//Thêm số 0 phía trước
		System.out.printf("Số điện thoại: %010d%n", 912345678);
		
		//Định dạng tiền tệ
		System.out.printf("Lương: %,.2f VND%n", salary);
		
		//Ngày tháng
		System.out.printf("Ngày: %tF%n", new java.util.Date());
	}

}
