package ntu.danhtm2534;

//Lớp con: Vịnh Xuân Quyền
//File: VinhXuanQuyen.java
public class VinhXuanQuyen extends VoHoc {
	private boolean dungMocNhan;
	private String baiQuyenNenTang;
	
	public VinhXuanQuyen(boolean dungMocNhan, String baiQuyenNenTang) {
		super("Vịnh Xuân Quyền", "Trung Quốc", "Trung tuyến luận, cận chiến nhanh");
		this.dungMocNhan = dungMocNhan;
		this.baiQuyenNenTang = baiQuyenNenTang;
		
	}
	
	@Override
	public void dacDiemChienDau() {
		System.out.println("Đặc điểm: Sử dụng đấm liên hoàn đường thẳng, cận chiến tốc độ cao.");
	}
	
	//thêm phương thức
	public void tapMocNhan() {
        if (dungMocNhan) {
            System.out.println("Hành động: Luyện tập các góc đánh trên cọc gỗ mộc nhân với bài " + baiQuyenNenTang + ".");
        }
    }
	
	public void luyenChiSao() {
        System.out.println("Hành động: Thực hành bài tập dính tay (Chi xao) cảm nhận lực đối thủ.");
    }
	
}
