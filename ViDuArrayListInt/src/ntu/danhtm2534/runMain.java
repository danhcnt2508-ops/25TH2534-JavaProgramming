package ntu.danhtm2534;

import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		// Khai báo biến danh sách, chứa các số nguyên
		ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>();
		//a.Nhập 10 phần từ
		Scanner banPhim = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i++) {
		//nhập 1 phần từ
			//in 1 hướng dẫn cho người dùng
		System.out.print("Mời nhập phần từ thứ " + i + ":");
			//cho người dùng nhập
		Integer tam = banPhim.nextInt();
			//thêm vào cuối danh sách
		dsSoNguyen.add(tam);
		}
		
		//in thử danh sách
		System.out.print(dsSoNguyen);
		}

}
