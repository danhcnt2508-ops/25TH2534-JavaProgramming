package ntu.danhtm2534;

//Lớp con: Chó
//File: ConCho.java

public class ConCho extends DongVat {
	//Thuộc tính riêng của Chó
	private String giongCho;
	private boolean coTheTrongNha;
	
	
	//Constructor của lớp con phải gọi constructor của lớp cha
	public ConCho(String ten, int tuoi, double canNang, 
			String giongCho, boolean coTheTrongNha) {
		super(ten, tuoi, canNang);  //gọi constructor của DongVat
		this.giongCho = giongCho;
		this.coTheTrongNha = coTheTrongNha;
	}
	
	//Phương thức riêng của Chó
	public void sua() {
		System.out.println(ten + " đang sủa: Gâu Gâu!");
		
	}
	
	public void duoiMeo() {
		System.out.println(ten + " đang đuổi mèo...");
	}
	
	//ghi đè phương thức của lớp cha
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin(); // gọi phương thức của lớp cha
		System.out.println("Giống chó: " + giongCho);
		System.out.println("Có thể trông nhà: " + (coTheTrongNha));
	}
}
