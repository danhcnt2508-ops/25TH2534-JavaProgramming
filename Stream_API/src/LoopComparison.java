import java.util.List;

public class LoopComparison {

	public static void main(String[] args) {
		List<String> names = List.of("An", "Bình", "Châu", "Dũng");
		
		System.out.println("1. For truyền thống:");
		for (int i = 0; i < names.size(); i++) {
			System.out.println("- " + names.get(i));
		}
		
		System.out.println("\n2. Enhanced for loop:");
		for (String name : names) {
			System.out.println("- " + name);
		}
		
		System.out.println("\n3. Stream API với forEach:");
		names.stream().forEach(name -> System.out.println("- " + name));
		
		System.out.println("\n4. Method reference:");
		names.forEach(System.out :: println);
	}

}
