package NormalInnerClasses;

////Example 2: variables with different names
//Inner class can access outer class private variables but outer cant of inner class
//public class Outer2 {
//	private int a = 100;
//	private int b = 200;
//
//	class Inner {
//		int x = 100;
//		int y = 400;
//
//		void add(int i, int j) {
//			System.out.println(i + j);
//			System.out.println(x + y);
//			System.out.println(a + b);
//		}
//	}
//
//	public static void main(String[] args) {
//		/*
//		 * Outer2 o = new Outer2(); Outer2.Inner i = o.new Inner(); i.add(25, 50);
//		 */
//		// Or we can do like
//		new Outer2().new Inner().add(25, 75);
//	}
//}

//Example 2: variables with same names
public class Outer2 {
	private int a = 100;
	private int b = 200;

	class Inner {
		int a = 100;
		int b = 400;

		void add(int a, int b) {
			System.out.println(a + b);
			System.out.println(this.a + this.b);
			System.out.println(Outer2.this.a + Outer2.this.b);
		}
	}

	public static void main(String[] args) {
		/*
		 * Outer2 o = new Outer2(); Outer2.Inner i = o.new Inner(); i.add(25, 50);
		 */
		// Or we can do like
		new Outer2().new Inner().add(25, 50);
	}
}
