package by.oca.chpt04;

public class OverloadingOrder {
	public static void glide(int param) {
		System.out.println("int");
	}

	public static void glide(long param) {
		System.out.println("long");
	}

	public static void glide(Integer param) {
		System.out.println("Integer");
	}

	public static void glide(int... param) {
		System.out.println("int...");
	}

	public static void main(String[] args) {
		glide(0); // Order exact match, lerger primitive, autoboxing, vararg. Since Java 1.4
	}
}