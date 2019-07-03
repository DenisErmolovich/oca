package by.oca.appendixb;

public class CompileFloat {
	public static void main(String... args) {
		float f1 = 102;
		float f2 = (int) 102.0;
		float f3 = 1f * 0.0; //possible lossy conversion from double to float
		float f4 = 1f * (short)0.0;
		float f5 = 1f * (boolean)0; //int can't be converted to boolean
	}
}
