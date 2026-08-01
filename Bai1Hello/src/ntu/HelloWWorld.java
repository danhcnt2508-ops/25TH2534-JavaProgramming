/**
 * 
 */
package ntu;

/**
 * 
 */
public class HelloWWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//var - tự động suy luận kiểu
		var message = "Hello, World with var";
		var number = 42;
		var list = java.util.List.of("Java","Modern","Features");
		
		System.out.println(message);
		System.out.println("Number: " + number);
		System.out.println("List: " + list);
	}

}
