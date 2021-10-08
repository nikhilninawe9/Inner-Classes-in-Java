package NormalInnerClasses;

public class Outer3 {
	class Inner {
		// in inner classes, static declaration is not allowed so main method wont work
		// || static blocks also not allowed.
		// Note: modifier static is only allowed in constant variable declarations
		// so modifier static is only allowed in constant variable declararions [final
		// declarations are allowed]

		// so if i want to use static variable then
		final static int a = 0;
	}
}
