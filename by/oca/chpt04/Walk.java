package by.oca.chpt04;

public class Walk {
	public static void walk(int start, int... nums) {
		System.out.println(nums.length);
	}

	public static void walkInteger(Integer statr, Integer... nums) {
		System.out.println(nums.length);
	}

	public static void main(String[] args) {
		walk(1);
		walk(1, 2);
		//walk(1, null); // NPE

		walkInteger(1);
		walkInteger(1, 2);
		walkInteger(1, (Integer) null); // Works only with cast
	}
}