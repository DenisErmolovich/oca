package by.oca.chpt03;

import java.time.*;
import java.time.format.*;

public class PeriodAndChaining {
	public static void main(String... args) {
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 23);
		Period p = Period.ofDays(1).ofYears(2); // Works only the last period, without chaining
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(f.format(d)); // 5/10/13 11:22 AM
	}
}
