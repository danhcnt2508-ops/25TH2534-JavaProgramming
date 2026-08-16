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
		//System.out.print("Mời nhập phần từ thứ " + i + ":");
			System.out.print("a[" + i + "]= ");
			
			//cho người dùng nhập, cất vào biến tạm
		Integer tam = banPhim.nextInt();
			//thêm vào cuối danh sách
		dsSoNguyen.add(tam);
		}
		
		//b.in danh sách vừa nhập
		//nhập bằng for
		System.out.print("DANH SÁCH VỪA NHẬP LÀ: \n");
		for (int i = 0; i < dsSoNguyen.size(); i++) {
			//lấy giá trị phần từ ở vị trí i, cất vào biến tạm
			Integer tam = dsSoNguyen.get(i);
			System.out.println(tam + " ");
		}
		
		//nhập bằng foreach
		System.out.print("IN DANH SÁCH VỪA NHẬP BẰNG FOREACH: \n");
		for (Integer x : dsSoNguyen) {
			System.out.print(x + " ");
			
		}
		
		//c. Đếm số phần tử chẳn
		int soLuongPTchan = 0;
		
		for (Integer x : dsSoNguyen) {
			if (x % 2 == 0) {
				soLuongPTchan += 1;
			}
		}
		
		System.out.println("\nSố lượng phần tử chẵn trong danh sách là: " + soLuongPTchan);
		
		//d. Tính tổng các phần từ: Thuật toán cộng dồn
		
		int TongDS = 0;
		
		for (Integer x : dsSoNguyen) {
			
			TongDS += x;	
		}
		System.out.println("\nTổng các phần tử trong danh sách là: " + TongDS);
		
		}

}
