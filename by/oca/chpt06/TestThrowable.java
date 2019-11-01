package by.oca.chpt06;

public class TestThrowable {
	public static void main(String... args) {
		try {
			method();
		} catch (Throwable t) { // Compiles
			t.printStackTrace();
		}
	}

	public static void method() throws Throwable { // Compiles
		throw new Exception("Exception =)");
	}
}