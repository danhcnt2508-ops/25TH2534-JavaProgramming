package ntu.danhtm2534;

public class MainNguoiDung {

	public static void main(String[] args) {
		System.out.println("====== HỆ THỐNG ĐÀO TẠO TRỰC TUYỂN ======\n");

        //kiểm tra lớp cha
		System.out.println("----1.Kiểm thử đối tượng NguoiDung ---");
		NguoiDung nd1 = new NguoiDung("ND001", "Trần Văn A", "tranvana@gmail.com", "20/8/2026");
		NguoiDung nd2 = new NguoiDung("ND002", "Nguyễn Văn B", "nguyenvanb@gmail.com", "20/8/2026");
        nd1.dangNhap();
        nd2.xemThongTin();
        System.out.println();
        
        //kiểm tra lớp con: HocVien
        System.out.println("----2. Kiểm thử đối tượng HocVien ----");
        HocVien hv = new HocVien("HV101", "Nguyễn Anh Thư", "nguyenanhthu@gmail.com", "21/8/2026");
        hv.dangNhap();
        hv.thamGiaKhoaHoc("Lập trình Java cơ bản");
        hv.thamGiaKhoaHoc("Cấu trúc dữ liệu và giải thuật");
        hv.nopBaiTap("Bài tập thực hành chương 8 Java");
        hv.xemKetQuaHocTap();
        System.out.println();
        
        //kiểm tra lớp con: GiangVien
        System.out.println("----3. Kiểm thử đối tượng GiangVien ----");
        GiangVien gv = new GiangVien("GV201", "Mai Cường Thọ", "thomc@ntu.edu.vn", "15/01/2025", "Lập trình thiết bị di động");
        gv.dangNhap();
        gv.taoKhoaHoc("Lập trình Java cơ bản đến nâng cao");
        gv.chamBai(hv.hoTen);
        gv.traoDoiVoiHocVien(hv.hoTen);
        System.out.println();
        
        //kiểm thử lớp con: QuanTriVien
        System.out.println("----3. Kiểm thử đối tượng QuanTriVien ----");
        QuanTriVien qtv = new QuanTriVien("QTV01", "Admin", "danhcnt2508@gmail.com", "01/01/2025", "Toàn quyền hệ thống");
		qtv.dangNhap();
		qtv.duyetKhoaHoc("Lập trình Java cơ bản đến nâng cao");
		qtv.xemBaoCao();
		qtv.khoaTaiKhoan(nd1.id);
		
		System.out.println("KIỂM THỬ HOÀN TẤT");


	}

}
