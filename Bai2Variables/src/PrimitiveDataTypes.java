
public class PrimitiveDataTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//kiểu số nguyên
		byte tuoi = 25;
		short soLuong = 1000;
		int danSo = 1000000;
		long tongDanSo = 8000000000L;
		System.out.println(tuoi);
		System.out.println(soLuong);
		System.out.println(danSo);
		System.out.println(tongDanSo);
		
		//kiểu số thực
		float diemTrungBinh = 8.5f; //f chỉ kiểu float
		double pi = 3.141592653589793;
		double canBacHai = Math.sqrt(25);
		System.out.println(diemTrungBinh);
		System.out.println(pi);
		System.out.println(canBacHai);
		
		//kiểu ký tự
		char kyTu = 'a';
		char kyTuUnicode = '\u0061';
		char kyTuSo = 97;
		char kyTuDacBiet = '\n';
		System.out.println(kyTu);
		System.out.println(kyTuUnicode);
		System.out.println(kyTuSo);
		System.out.println(kyTuDacBiet);
		
		//kiểu boolean
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		boolean isAdult = (tuoi >=18);
		System.out.println(isJavaFun);
		System.out.println(isFishTasty);
		System.out.println(isAdult);
	}

}
