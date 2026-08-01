/**
 * 
 */

import java.util.Date;
import java.util.Scanner;

/**
 * 
 */
public class ReferenceTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Kiểu tham chiếu cơ bản
		//String  - chuỗi ký tự
		String hoTen = "Trần Mộng Danh";
		String email = "danhcnt2508@gmail.com";
		
		System.out.println(hoTen);
		System.out.println(email);
		
		//Array - Mảng
		int[] mangSo = {0,1,2,3,4,5,6,7,8,9};
		String[] mangTen = {"Cường", "Danh", "Quân"};
		
		System.out.println(mangSo);
		System.out.println(mangTen);
		
		//Class - Lớp đối tượng
				
		Scanner scanner = new Scanner(System.in);
		Date ngayHienTai = new Date();
		System.out.println(ngayHienTai);
		

	}

}
