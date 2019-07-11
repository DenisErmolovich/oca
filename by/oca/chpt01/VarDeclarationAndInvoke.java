package by.oca.chpt01;

public class VarDeclarationAndInvoke {
	public static void main(String... args) {
		new VarDeclarationAndInvoke().boo();
	}

	public void boo() {
		System.out.println(foo); // It's ok
		System.out.println(baz); // Won't compile

		String baz = "zoo";
	}

	String foo = "bar";
}