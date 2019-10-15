package by.oca.chpt05;

public class Kangaroo extends Marsupial {
	static boolean isBiped() {
	//boolean isBiped() {
		return true;
	}

	void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped());
	}

	public static void main(String... args) {
		Kangaroo joey = new Kangaroo();
		joey.getMarsupialDescription(); // Marsupial walks on two legs: false
		joey.getKangarooDescription(); // Kangaroo hops on two legs: true
	}
}

class Marsupial {
	static boolean isBiped() {
	//boolean isBiped() {
		return false;
	}

	void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs: " + isBiped());
	}
}
