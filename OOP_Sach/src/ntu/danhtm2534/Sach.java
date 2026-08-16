package ntu.danhtm2534;

public class Sach {
	//Tạo thuộc tính
	String tieuDe;
	String tacGia;
	long gia;
	int soTrang;
	
	//Tạo phương thức
	void hienThiThongTin() {
		System.out.println("Tiêu đề của sách là: " + tieuDe);
		System.out.println("Tác giả của sách là: " + tacGia);
		System.out.println("Giá của sách: " + gia + " đồng");
		System.out.println("Sách có số trang: " + soTrang + " trang");
	}
}
