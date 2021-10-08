package AnonymousInnerClasses;

class B {
	void disp() {
		System.out.println("In b class");
	}
}

//This C class portion we can eliminate by using anonymous class
class C extends B {
	void disp() {
		System.out.println("In c class");
	}
}

public class Ano0 {

	public static void main(String[] args) {
		C c = new C();
		c.disp();
	}

}
