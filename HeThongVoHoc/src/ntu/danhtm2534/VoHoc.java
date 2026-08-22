package ntu.danhtm2534;

public class VoHoc {
	//thuộc tính chung
	protected String tenMonVo;
	protected String nguonGoc;
	protected String trietLy;
	
	//khởi tạo đầy đủ
	public VoHoc(String tenMonVo, String nguonGoc, String trietLy) {
		this.tenMonVo = tenMonVo;
		this.nguonGoc = nguonGoc;
		this.trietLy = trietLy;
	}
	
	//Phương thức hiển thị thông tin chung
	public void hienThiThongTin() {
		System.out.println("=== MÔN VÕ: " + tenMonVo.toUpperCase() + " ===");
		System.out.println("Nguồn gốc: " + nguonGoc);
		System.out.println("Triết lý: " + trietLy);
	}
	
	//phương thức dacDiemChienDau
	public void dacDiemChienDau() {
		System.out.println("Mỗi môn võ có một đặc điểm chiến đấu riêng");
	}

	//Getter
	public String getTenMonVo() {
		return tenMonVo;
	}

	public String getNguonGoc() {
		return nguonGoc;
	}

	public String getTrietLy() {
		return trietLy;
	}

	// và Setter
	public void setTenMonVo(String tenMonVo) {
		this.tenMonVo = tenMonVo;
	}

	public void setNguonGoc(String nguonGoc) {
		this.nguonGoc = nguonGoc;
	}

	public void setTrietLy(String trietLy) {
		this.trietLy = trietLy;
	}

}
