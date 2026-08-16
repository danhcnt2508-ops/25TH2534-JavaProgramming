package ntu.danhtm2534;

import java.util.Scanner;

public class MainHinhChuNhat {

	public static void main(String[] args) {
		// Tạo HCN thứ nhất
		HinhChuNhat HCN1 = new HinhChuNhat();
		//Nhập vào giá trị chiều dài, chiều rộng
		System.out.println("Tạo Hình chữ nhật thứ nhất:");
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Nhập vào giá trị chiều dài: ");
		HCN1.chieuDai = scanner1.nextDouble();
		
		do {
		System.out.println("Nhập vào giá trị chiều rộng: ");
		HCN1.chieuRong = scanner1.nextDouble();
		} while (HCN1.chieuRong > HCN1.chieuDai);
			
		System.out.println("Hình chữ nhật thứ nhất có thông số sau: ");
		HCN1.tinhChuVi();
		HCN1.tinhDienTich();
		HCN1.laHinhVuong();
		HCN1.hienThiThongTin();
		
		
		//Tạo HCN thứ hai
		HinhChuNhat HCN2 = new HinhChuNhat();
		System.out.println("Tạo Hình chữ nhật thứ hai:");
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Nhập vào giá trị chiều dài: ");
		HCN2.chieuDai = scanner2.nextDouble();
		do {
		System.out.println("Nhập vào giá trị chiều rộng: ");
		HCN2.chieuRong = scanner2.nextDouble();
		} while (HCN2.chieuRong > HCN2.chieuDai);
		
		System.out.println("Hình chữ nhật thứ hai có thông số sau: ");
		HCN2.tinhChuVi();
		HCN2.tinhDienTich();
		HCN2.laHinhVuong();
		HCN2.hienThiThongTin();
	}

}
