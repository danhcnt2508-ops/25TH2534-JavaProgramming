package ntu.danhtm2534;

public class MainPets {

	public static void main(String[] args) {
		//Tạo một đối tượng thú cưng mới
		Pets myDog = new Pets("Lu", "Chó", 3, 12.5);
		
		//Gọi phương thức
		myDog.getInfo();
		myDog.makeSound();
		myDog.eat();
		myDog.eat(); //Kiểm tra cho ăn lần nữa xem thông báo là gì

	}

}
