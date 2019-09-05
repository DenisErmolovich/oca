package by.oca.chpt03;

public class ArrayAndCasting {
	public static void main(String... args) {
		String[] strings = { "stringValue" };
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
		//againStrings[0] = new StringBuilder(); // compilation error
		objects[0] = new StringBuilder(); // runtime exception
	}
}