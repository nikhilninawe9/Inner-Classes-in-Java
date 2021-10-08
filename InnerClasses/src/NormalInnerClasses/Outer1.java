package NormalInnerClasses;

//example 1: [Normal Inner Class]
public class Outer1 {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m2();
	}
}

class Outer {

	private int a = 10;
	private int b = 20;

	void m1() {
		System.out.println("Outer class mi()");
	}

	class Inner {
		int x = 30;
		int y = 40;

		void m2() {// inner class access outer class data
			System.out.println("Inner class m2()");
			System.out.println(x + y);
			System.out.println(a + b);
			m1();
		}
	}
}
