package ntu.danhtm2534;

//Lớp con: Pháp sư
//File: PhapSu.java
public class PhapSu extends NhanVat {
	private String phepThuat;
	private int mana;
	
	public PhapSu(String ten, int capDo, int mau, int sucManh, String phepThuat, int mana) {
		super(ten, capDo, mau, sucManh);
		this.phepThuat = phepThuat;
		this.mana = mana;
	}
	
	//Ghi đè phương thức tanCong
	@Override
	public void tanCong(String ten, int mana) {
		int soLanTanCong;
		for(soLanTanCong = 1; soLanTanCong <= 10; soLanTanCong++) {
		System.out.println(ten + " đã tấn công với sức mạnh " + sucManh + " tiêu hao " + mana + " của đối thủ");
		}
	}
	
	//Thêm phương thức
	public int hoiMana() {
		return ++mana;
	}
	
	public void suDungPhepThuat() {
		return;
	}
	
	
}
