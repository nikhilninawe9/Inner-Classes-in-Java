package MethodLocalInnerClasses;

//MethodLocalInnerClasses => Inner class inside the method..
//We can create inner class inside the for loop
public class MethodLIC5 {

	public void m1() {
		for (int i = 0; i < 10; i++) {
			class Inner1 {
				public void display1() {
					System.out.println("Method local inner1 class!");
				}
			}
			new Inner1().display1();
		}
	}

	public static void main(String[] args) {
		MethodLIC5 m = new MethodLIC5();
		m.m1();
	}

}
