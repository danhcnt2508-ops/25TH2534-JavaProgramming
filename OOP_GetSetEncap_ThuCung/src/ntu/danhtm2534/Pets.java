package ntu.danhtm2534;

public class Pets {
	//1. tạo các thuộc tính
	private String name;
	private String species;
	private int age;
	private double weight;
	private boolean isHungry;
	
	
	//2. Khởi tạo có tham số
	public Pets(String name, String species, int age, double weight) {
		super();
		this.name = name;
		this.species = species;
		this.age = age;
		this.weight = weight;
		this.isHungry = true;  //mặc định là đói
	}
	
	//3. Các phương thức
	public void eat() {
		if (this.isHungry) {
			System.out.println(this.name + " đang ăn ngon lành.");
			this.isHungry = false;
		} else {
			System.out.println(this.name + " đã no nê, không muốn ăn nữa");
			
		}
	}
	
	public void makeSound() {
		if (this.species.equalsIgnoreCase("dog") || this.species.equalsIgnoreCase("chó")) {
			System.out.println(this.name + " kêu: gâu gâu");
		} else if (this.species.equalsIgnoreCase("cat") || this.species.equalsIgnoreCase("mèo")) {
			System.out.println(this.name + " kêu: meo meo");
		} else {
			System.out.println(this.name + " phát ra tiếng kêu đặc trưng của loài");
		}
	}
	
	public void getInfo() {
		System.out.println("--- Thông tin thú cưng ---");
		System.out.println("Tên: " + this.name);
		System.out.println("Loài: " + this.species);
		System.out.println("Tuổi: " + this.age);
		System.out.println("Cân nặng: " + this.weight + " kg");
		System.out.println("Đang đói? " + (this.isHungry ? "Có" : "Không"));		
	}
	
	//4. các hàm Getter và Setter
	public String getName() { return name;}
	public void setName(String name) { this.name = name; }
	
	public int getAge() { return age;}
	public void setAge(int age) {this.age = age;}
	
	
}
