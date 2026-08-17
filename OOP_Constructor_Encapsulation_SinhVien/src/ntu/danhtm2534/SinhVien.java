package ntu.danhtm2534;

public class SinhVien {
	//thuộc tính private - chỉ truy cập trong lớp
	private String ten;
	private int tuoi;
	private String maSV;
	private double diemTB;
	
	//Constructor mặc định
	public SinhVien() {
		this.ten = "Chưa có tên";
		this.tuoi = 18;
		this.maSV = "SV000";
		this.diemTB = 0.0;
	}
	
	//Constructor có tham số
	public SinhVien(String ten, int tuoi, String maSV) {
		this.ten = ten;
		this.setTuoi(tuoi); //sử dụng setter đển validate
		this.maSV = maSV;
		this.diemTB = 0.0;
	}
	
	//Getter - lấy giá trị thuộc tính
	public String getTen() {
		return ten;
	}
	
	public int getTuoi() {
		return tuoi;
	}
	
	public String getMaSV() {
		return maSV;
	}
	
	public double getDiemTB() {
		return diemTB;
	}
	
	//SETTER - Gán giá trị với kiểm tra
	
	
	
	
}
