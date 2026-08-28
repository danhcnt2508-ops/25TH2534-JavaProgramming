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
	public void tanCong() {
		if(this.mana >= 10) {
			this.mana -= 10;
			System.out.println(ten + " bắn tia sáng ma thuật, gây " + sucManh + " sát thương (Tiêu hao 10 Mana. Mana còn lại: " + this.mana + ").");
		} else {
			System.out.println(ten + " không đủ mana để tấn công! Cần hồi mana.");
		}
	}
	
	//Thêm phương thức
	
	public void suDungPhepThuat() {
		if (this.mana >= 30) {
            this.mana -= 30;
            double satThuongPhep = this.sucManh * 2.5;
            System.out.println(ten + " niệm chú thi triển phép [" + phepThuat + "], gây " + satThuongPhep +
            		" sát thương phép hoành tráng! (Mana còn lại: " + this.mana + ")");
        } else {
            System.out.println(ten + " không đủ mana để thi triển phép thuật [" + phepThuat + "].");
        }
	}
	
	public void hoiMana(int luongHoi) {
		this.mana += luongHoi;
		System.out.println(ten + " đã hồi phục " + luongHoi + " Mana. Mana hiện tại: " + this.mana);
	}
	
	//ghi đè hiển thị thông tin
		@Override
		public void hienThiThongTin() {
			System.out.println("=== HIỂN THỊ THÔNG TIN PHÁP SƯ ===");
			super.hienThiThongTin();
			System.out.println("Phép thuật: " + this.phepThuat);
			System.out.println("Mana: " + this.mana);
		}
}
