//Bài tập 4. Tính tiền điện
/* Tính tiền điện theo bậc thang:
	- 0 - 50kWh		: 	1.678 đ/kWh
	- 51 - 100kWh	: 	1.734 đ/kWh
	- 101 - 200kWh	: 	2.014 đ/kWh
	- 201 - 300kWh	:	2.536 đ/kWh
	- trên 300 kWh	: 	2.834 đ/kWh
*/

public class BaiTap4 {

	public static void main(String[] args) {
		//khai báo biến và gán giá trị
		int soDien = 250; //kWh
		double tienDien = 0;
		
		//sử dụng câu điều kiện để tính tiền điện
		if (soDien <= 50) {
			tienDien = soDien * 1678;
		} else if (soDien <= 100) {
			tienDien = 50 * 1678 + (soDien -50) * 1734;
		} else if (soDien <= 200) {
			tienDien = 50 * 1678 + 50 * 1734 + (soDien - 100) * 2014;
		} else if (soDien <= 300) {
			tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (soDien - 200) * 2536;
		} else tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (soDien - 300) * 2834;
		
		//In kết quả tính tiền theo số điện
		
		System.out.println("Số điện:" + soDien + "kWh");
		System.out.println("Tiền điện:" + tienDien + " đồng");
		System.out.println("Tiền điện (VND): " + String.format("%,.0f", tienDien) + " đ");

	}

}
