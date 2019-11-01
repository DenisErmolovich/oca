package by.oca.assessment;

public class FeedingSchedule {
	public static void main(String[] args) {
		int x = 5, j = 0;
		OUTER: for (int i = 0; i < 3; ) // do-while it is one statement, you can omit {}
			INNER: do {
				i++; x++;
				if (x > 10) break INNER;
				x += 4;
				j++;
			} while (j <= 2);
		System.out.println(x);
	}
}