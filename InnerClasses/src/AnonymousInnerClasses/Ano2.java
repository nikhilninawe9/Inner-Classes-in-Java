package AnonymousInnerClasses;

abstract class Ab {
	abstract void m1();
}

public class Ano2 {

	public static void main(String[] args) {
		Ab ab = new Ab() {

			@Override
			void m1() {
				System.out.println("In m1 method of anony abstract class");
			}
		};
		ab.m1();
	}

}
