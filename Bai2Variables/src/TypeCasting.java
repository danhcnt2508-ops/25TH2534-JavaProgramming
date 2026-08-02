
public class TypeCasting {

	public static void main(String[] args) {
		//1.ép kiểu tự động (widening)
		//Tự động chuyển kiểu nhỏ --> lớn
		int myInt = 9;
		double myDouble = myInt; //Tự động: int -> double
		
		byte myByte = 100;
		int myInt2 = myByte; //byte -> int
		
		//2.Ép kiểu tường minh (narrowing)
		//thủ công chuyển kiểu lớp -> nhỏ
		double myDouble1 = 9.78;
		int myInt1 = (int) myDouble1; // 9 (mất phần thập phân)
		
		long bigNumber = 100000L;
		int smallNumber = (int) bigNumber;
		
		//3.Ép kiểu giữa các kiểu khác nhau (chuyển kiểu)
		//String -> int
		String strNumber = "123";
		int number = Integer.parseInt(strNumber);
		
		//int -> String
		int num = 456;
		String str = String.valueOf(num);
		String str2 = Integer.toString(num);
		
		//char -> int
		
		
	}

}
