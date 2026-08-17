package ntu.danhtm2534;

public class MainPets {

	public static void main(String[] args) {
		ConMeo meoDen = new ConMeo();
		meoDen.ten = "Mun";
		meoDen.tuoi = 1;
		meoDen.mauLong = "Đen";
		meoDen.canNang = 1.0;
		
		meoDen.thongTin();
		meoDen.keu();
		meoDen.an("chuột");
		meoDen.ngu();
	}

}
