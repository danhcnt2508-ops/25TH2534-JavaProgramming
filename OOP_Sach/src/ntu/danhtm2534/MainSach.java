package ntu.danhtm2534;

public class MainSach {

	public static void main(String[] args) {
		// tạo quyển sách thứ nhất
		Sach sach1 = new Sach();
		sach1.tieuDe = "Đắc Nhân Tâm";
		sach1.tacGia = "Dale Carnegie";
		sach1.gia = 100000;
		sach1.soTrang = 343;
		
		sach1.hienThiThongTin();
		System.out.println();
		
		//tạo quyển sách thứ hai
		Sach sach2 = new Sach();
		sach2.tieuDe = "Chinh phục toàn diện ngữ pháp Tiếng Anh";
		sach2.tacGia = "Hà Thị Như Hoa";
		sach2.gia = 150000;
		sach2.soTrang = 286;
				
		sach2.hienThiThongTin();
		System.out.println();
		
		//tạo quyển sách thứ ba
		Sach sach3 = new Sach();
		sach3.tieuDe = "Hệ Quản trị Cơ sở dữ liệu";
		sach3.tacGia = "Phạm Thị Thu Thúy";
		sach3.gia = 80000;
		sach3.soTrang = 135;
		
		sach3.hienThiThongTin();

	}

}
