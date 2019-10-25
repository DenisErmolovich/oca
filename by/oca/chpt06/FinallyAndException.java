package by.oca.chpt06;

public class FinallyAndException {
	public static void main(String... args) {
		try {
			try {
				throw new RuntimeException("Try block");
			} catch(RuntimeException e) {
				throw new RuntimeException("Catch block"); // Java swallow this exception!
			} finally {
				throw new Exception("Finally block");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
