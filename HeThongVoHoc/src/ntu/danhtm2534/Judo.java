package ntu.danhtm2534;

//Lớp con: Judo
//File: Judo.java
public class Judo extends VoHoc {
	private String mauDai; 	//màu đai
	private int soKyThuatQuat;	//số lượng kỹ thuật quật
	
	public Judo(String mauDai, int soKyThuatQuat) {
		super("Judo (Nhu đạo)", "Nhật Bản", "Lấy nhu thắng cương, tối đa hóa lực");
		this.mauDai = mauDai;
        this.soKyThuatQuat = soKyThuatQuat;
	
	}
	
	@Override
	public void dacDiemChienDau() {
		System.out.println("Đặc điểm: Kỹ thuật quật ngã, vật và khóa siết trên mặt thảm.");
	}
	
	public void vatDoiPhuong() {
        System.out.println("Hành động: Sử dụng một trong " + soKyThuatQuat + " kỹ thuật quật ngã đối phương (Võ sinh đai " + mauDai + ").");
    }

    public void sietKhop() {
        System.out.println("Hành động: Áp dụng đòn khóa khớp hoặc siết cổ đối thủ trên thảm đấu.");
    }
	
}
