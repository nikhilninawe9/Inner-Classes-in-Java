package StaticNestedClasses;

public class Outer2 {
	int a = 10;
	static int b = 20;

	static class Inner {
		public static void main(String[] args) {
			System.out.println("Static inner class main method");// can have main method inside static inner class
		}
	}

}
