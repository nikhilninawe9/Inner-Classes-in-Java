package MethodLocalInnerClasses;

//MethodLocalInnerClasses => Inner class inside the method..
//abstract inner class means object creation is not possible..
public class MethodLIC2 {
	public void m1() {
		abstract class Inner {
			public void display() {
				System.out.println("Method local inner class!");
			}
		}
		// Inner i = new Inner();
		// i.display();
	}

	public static void main(String[] args) {
		MethodLIC2 m = new MethodLIC2();
		m.m1();
	}

}
