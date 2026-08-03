/**
 * 
 */

/**
 * 
 */
public class Operators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Toán tử số học
		int a = 10, b = 3;
		
		System.out.println(a+b);	//kq cộng = 13
		System.out.println(a-b);	//kq trừ = 7
		System.out.println(a*b);	//kq nhân = 30
		System.out.println(a/b);	//kq chia, số nguyên =3
		System.out.println((double) a/b); //kq chia ra kq số thực 3.3333
		System.out.println(a%b);	//chia lấy dư = 1
		System.out.println(++a);	//tăng trước = 11
		System.out.println(b--);	//giảm sau = 3
		System.out.println(b);		//b = 2
		
		//Toán tử gán
		int x = 10;
		x += 5;			//x=x+5 => 15
		x -= 3;			//x=x-3 => 12
		x *= 2;			//x=x*2 => 24
		x /= 4;			//x=x/4	=> 6
		x %= 4;			//x=x%4 => 2
		System.out.println(x);	//2
		
		
		//Toán tử so sánh
		int a1 = 10, b1 = 20;
		
		System.out.println(a1 == b1); //false
		System.out.println(a1 != b1); //true
		System.out.println(a1 > b1);  //false
		System.out.println(a1 < b1);	//true
		System.out.println(a1 >= 10);	//true
		System.out.println(b1 <= 20);	//true
		
		//Toán tử logic
		boolean x1 = true, y1 = false;
		
		System.out.println(x1 && y1);	//false AND
		System.out.println(x1 || y1);	//true OR
		System.out.println(!x1);			//false NOT
		
		//Toán tử với điều kiện
		int age = 18;
		boolean hasLicense = true;
		boolean canDrive = (age >= 18) && hasLicense;	//true
		System.out.println(canDrive);
		
		//Toán tử ba ngôi
		int age1 = 20;
		String status = (age1 > 18) ? "Adult" : "Minor"; // status = "Adult"
		
		int score = 85;
		String grade = (score >= 90) ? "A" :
					   (score >= 80) ? "B" :
					   (score >= 70) ? "C" :
					   (score >= 60) ? "D" : "F";
		System.out.println("grade = " + grade);		//grade = "B"
		
	}

}
