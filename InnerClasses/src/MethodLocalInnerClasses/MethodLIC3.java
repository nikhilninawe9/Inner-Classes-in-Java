package MethodLocalInnerClasses;

//MethodLocalInnerClasses => Inner class inside the method..
public class MethodLIC3 {
	public void m1() {
		class Inner1 {
			public void display1() {
				System.out.println("Method local inner1 class!");
			}
		}
		class Inner2 extends Inner1 {
			public void display2() {
				System.out.println("Method local inner2 class!");
			}
		}
		Inner2 i = new Inner2();
		i.display1();
		i.display2();
	}

	public static void main(String[] args) {
		MethodLIC3 m = new MethodLIC3();
		m.m1();
	}

}
