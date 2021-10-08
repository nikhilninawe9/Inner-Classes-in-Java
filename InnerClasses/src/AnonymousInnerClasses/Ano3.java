package AnonymousInnerClasses;

interface Ac {
	void m1();
}

public class Ano3 {

	public static void main(String[] args) {
		Ac ac = new Ac() {

			@Override
			public void m1() {
				System.out.println("In m1 method of anony interface");
			}
		};
		ac.m1();
	}

}
