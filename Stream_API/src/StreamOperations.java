import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("Danh sách gốc: " + numbers);
		
		//Filter: lọc số chẵn
		System.out.print("Số chẵn: ");
		numbers.stream()
			.filter(n -> n % 2 == 0)
			.forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		// Map: chuyển đổi
		System.out.print("Bình phương: ");
		numbers.stream()
		.map(n -> n * n)
		.forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		//Sắp xếp giảm dần
		System.out.print("Sắp xếp giảm dần: ");
		numbers.stream()
		.sorted((a, b) -> b - a)
		.forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		//Limit và Skip
		System.out.print("Phần từ từ 3 đến 7");
		numbers.stream()
				.skip(2)
				.limit(5)
				.forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		//Collect để tạo list mới
		List<Integer> evenSquares = numbers.stream()
				.filter(n -> n % 2 == 0)
				.map(n -> n * n)
				.collect(Collectors.toList());
		System.out.println("Bình phương số chẵn: " + evenSquares);
		
		List<Integer> evenSquares2 = numbers.stream()
				.filter(n -> n % 2 != 0)
				.map(n -> n * n)
				.collect(Collectors.toList());
		System.out.println("Bình phương số lẻ: " + evenSquares2);
		
		
	}

}
