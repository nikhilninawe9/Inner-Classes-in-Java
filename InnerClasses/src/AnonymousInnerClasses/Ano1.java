package AnonymousInnerClasses;

class A {
	void disp() {
	}
}

public class Ano1 {
	A a = new A() {

		@Override
		void disp() {
			System.out.println("Good Evening");
			System.out.println(a.getClass().getName());// AnonymousInnerClasses.Ano1$1
		}
	};

	public static void main(String[] args) {
		Ano1 ano = new Ano1();
		ano.a.disp();
	}
}
//eliminating the overriding class directly creating the object of parent class || not like Ano0