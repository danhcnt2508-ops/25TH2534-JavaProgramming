package ntu.danhtm2534;

import java.util.ArrayList;
import java.util.List;

//Lớp con: Thái cực quyền
//File: ThaiCucQuyen.java
public class ThaiCucQuyen extends VoHoc {
	private List<String> dsChieuThuc;
	private String tuyetChieu;
	private boolean coTapThaiCucKiem;
	
	
	public ThaiCucQuyen(String tuyetChieu, boolean coTapThaiCucKiem) {
		super("Thái Cực Quyền", "Trung Quốc", "Lấy nhu khắc cương, mượn lực đánh lực");
		this.dsChieuThuc = new ArrayList<>();
		this.tuyetChieu = tuyetChieu;
		this.coTapThaiCucKiem = coTapThaiCucKiem;
	}
	
	@Override
	public void dacDiemChienDau() {
		System.out.println("Đặc điểm: Di chuyển chậm rãi, uyển chuyển, tập trung điều hòa hơi thở và khí công.");
	} 
	
	//thêm phương thức
	public void luyenKhiCong() {
		System.out.println("Hành động: Đang luyện khí công và định tâm");
	}
	
	public void bieuDienKiem() {
		if (coTapThaiCucKiem) {
            System.out.println("Hành động: Biểu diễn bài Thái Cực Kiếm với chiêu thức:" + dsChieuThuc);
        } else {
            System.out.println("Môn sinh này chỉ tập quyền cước không dùng kiếm.");
        }
	}
}
