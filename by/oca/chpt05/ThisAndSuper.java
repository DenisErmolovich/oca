package by.oca.chpt05;

public class ThisAndSuper {
	public static void main(String... args) {
		new ThisAndSuperChild("");
	}
}

class ThisAndSuperParent {
	ThisAndSuperParent () {
		System.out.println("Parent constructor");
	}
}

class ThisAndSuperChild extends ThisAndSuperParent {
	ThisAndSuperChild () {
		System.out.println("Child constructor");
	}

	ThisAndSuperChild (String s) {
		super();
		this(); // Compile error. We can't use super() and this() at the same constructor
		System.out.println("Child constructor with params");
	}
}
