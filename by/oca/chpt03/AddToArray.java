package by.oca.chpt03;

import java.util.*;

public class AddToArray {
	public static void main(String... args) {
		List<String> bird = new ArrayList<>();
		bird.add("hawk");
		//bird.set(1, "robin"); // runtime exception
		bird.add(1, "robin"); // it's ok
		System.out.print(bird);
	}
}