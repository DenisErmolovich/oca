package by.oca.chpt06;

public class InvalidCatch {
	public void valid() throws NoSuchFieldException { // Throwa that you want
		// Do nothing...
	}

	public void invalid() {
		try {
			// Do nothing...
		} catch (NoSuchFieldException e) { // Catch only checked exceptions which can be thrown
			e.printStackTrace();
		}
	}
}