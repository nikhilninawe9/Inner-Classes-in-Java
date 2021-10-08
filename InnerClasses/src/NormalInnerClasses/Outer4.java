package NormalInnerClasses;

public class Outer4 {
	Outer4() {
		System.out.println("Outer class constructor");
	}

	{
		System.out.println("Outer class Instance block");
	}

	static {
		System.out.println("Outer class Static block");
	}

	class Inner {
		Inner() {
			System.out.println("Inner class constructor");
		}

		{
			System.out.println("Inner class Instance block");
		}
		// Inner class static blocks are not allowed only static varibles are allowed
		// with final keyword
	}

	public static void main(String[] args) {
		new Outer4().new Inner();
	}
}
