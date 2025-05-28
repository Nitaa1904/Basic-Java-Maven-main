import Counter;

public class Driver {

	public static void main(String[] args) {

		// NullPointerException potensi
		String name = null;
		System.out.println("Length: " + name.length());

		// Infinite loop tanpa break
		while (true) {
			System.out.println("This is an infinite loop");
		}
	}
}


