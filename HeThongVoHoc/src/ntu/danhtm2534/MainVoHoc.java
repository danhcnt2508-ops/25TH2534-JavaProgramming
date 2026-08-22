package ntu.danhtm2534;

public class MainVoHoc {

	public static void main(String[] args) {
		ThaiCucQuyen tcq = new ThaiCucQuyen("Tứ lạng bát thiên cân", true);
		VinhXuanQuyen vxq = new VinhXuanQuyen(true, "Tiểu Niệm Đầu");
		ThieuLamQuyen tlq = new ThieuLamQuyen("Thiếu Lâm côn", 12);
		Judo jd = new Judo("Đai đen", 40);
		
		tcq.hienThiThongTin();
		tcq.dacDiemChienDau();
		tcq.luyenKhiCong();
		tcq.bieuDienKiem();
		System.out.println();
		
		vxq.hienThiThongTin();
		vxq.dacDiemChienDau();
		vxq.tapMocNhan();
		vxq.luyenChiSao();
		System.out.println();
		
		tlq.hienThiThongTin();
		tlq.dacDiemChienDau();
		tlq.luyenNoiCong();
		tlq.bieuDienBinhKhi();
		System.out.println();
		
		jd.hienThiThongTin();
		jd.dacDiemChienDau();
		jd.vatDoiPhuong();
		jd.sietKhop();
	
	}

}
