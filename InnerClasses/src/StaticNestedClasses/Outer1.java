package StaticNestedClasses;

//Normal inner class both instance and static members
public class Outer1 {
	int a = 10;
	static int b = 20;

	static class Inner {
		void disp() {
			// System.out.println(a);// instance variable not allowed in static inner class.
			System.out.println(b);
		}
	}

	public static void main(String[] args) {
		new Outer1.Inner().disp();
	}

}
