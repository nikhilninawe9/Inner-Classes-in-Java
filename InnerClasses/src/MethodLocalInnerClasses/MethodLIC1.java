package MethodLocalInnerClasses;

//MethodLocalInnerClasses => Inner class inside the method..
public class MethodLIC1 {
	public void m1() {
		class Inner {
			public void display() {
				System.out.println("Method local inner class!");
			}
		}
		Inner i = new Inner();
		i.display();
	}

	public static void main(String[] args) {
		MethodLIC1 m = new MethodLIC1();
		m.m1();
	}

}
