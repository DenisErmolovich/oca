package by.oca.appendixb;

public class Example {
	public static void main(String... args) {
		int x = 0;
		while(++x < 5) {
			x += 1;
		}
		String message = x < 5 ? "Greater than" : "Less then";
		System.out.println(message + "," + x); //Less than,5
	}
}
