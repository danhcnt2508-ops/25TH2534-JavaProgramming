package ntu.danhtm2534;

public class MainMayTinh {

	public static void main(String[] args) {
		// tạo máy tính thứ nhất
		MayTinh MT1 = new MayTinh();
		MT1.hang = "Sony Vaio";
		MT1.ram = 16;
		MT1.oCung = 500;
		MT1.gia = 16500000;
		
		MT1.kiemTraCauHinh();
				
		String test =Boolean.toString(MT1.coTheChoiGame());
		if(test == "true") {
			System.out.println("Máy tính có thể chơi game");
		} else System.out.println("Máy tính chưa thể chơi game, hãy nâng cấp");
		
		
		System.out.println("Thuế cần đóng là: " + MT1.tinhThue());

	}

}
