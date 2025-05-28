import Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();

		// Duplicate code and unused variables
		int a = 1;
		int b = 2;
		int c = a + b;

		System.out.println("Count: " + counter.getCount());
		counter.increment();
		System.out.println("Count: " + counter.getCount());

		int x = 1;
		int y = 2;
		int z = x + y;

		// Unused method
		printDebugInfo();
	}

	// Method never used
	private static void printDebugInfo() {
		System.out.println("This is a debug method");
	}
}

