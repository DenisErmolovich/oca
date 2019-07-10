package by.oca.chpt01;

public class Chick {
	private String name = "Fluffy";
	{
		System.out.println("setting field");
	}

	public Chick() {
		name = "Tiny";
		System.out.println("setting constructor");
	}

	public static void main(String... args) {
		System.out.println("very first line in main()");
		Chick chick = new Chick();
		System.out.println(chick.name);
	}
}