package by.oca.chpt06;

public class SwallowException {
	public static void main(String... args) {
		String result = new SwallowException().exceptions();
		System.out.println(result); // beforecatchfinallydone
	}

	public String exceptions() {
		String result = "";
		String v = null;
		try {
			try {
				result += "before";
				v.length();
				result += "after";
			} catch (NullPointerException e) {
				result += "catch";
				throw new RuntimeException("Catch block"); // Java swallows this exception
			} finally {
				result += "finally";
				throw new Exception("Finally block");
			}
		} catch (Exception e) {
			result += "done";
			e.printStackTrace();
		}
		return result;
	}
}
