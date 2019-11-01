package by.oca.assessment;

public class LoopWithOneStatement {
	public static void main(String[] args) {
		OUTER: for (int i = 0; i < 3; i++)
			INNER: do { // one statement, you can omit {}
				System.out.println("The inner statement");
			} while (false);
		System.out.println("The next statement");
	}
}