package ntu.danhtm2534;

//Lớp con: Thiếu lâm quyền
//File: ThieuLamQuyen.java
public class ThieuLamQuyen extends VoHoc {
	private String loaiBinhKhi;
	private int soCapDoNoiCong;
	
	public ThieuLamQuyen(String tenMonVo, String nguonGoc, String trietLy, String loaiBinhKhi, int soCapDoNoiCong) {
		super("Thiếu Lâm Quyền", "Trung Quốc", "Cương mãnh, toàn diện, mô phỏng loài vật");
		this.loaiBinhKhi = loaiBinhKhi;
		this.soCapDoNoiCong = soCapDoNoiCong;
	}
	
	@Override
	public void dacDiemChienDau() {
		System.out.println("Đặc điểm: Đòn thế mạnh mẽ, dứt khoát, kết hợp với mô phỏng động vật");
	}
	
	public void bieuDienBinhKhi() {
		System.out.println("Hành động: Biểu diễn binh khí sở trường là " + loaiBinhKhi + ".");
	}
	
	public void luyenNoiCong() {
		System.out.println("Hành động: Luyện công lực cấp độ " + soCapDoNoiCong + " (Thiếu Lâm Kim Chung Trạo)");
	}
}
