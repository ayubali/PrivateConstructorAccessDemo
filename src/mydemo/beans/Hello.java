package mydemo.beans;

public class Hello {

	private Hello() {
		System.out.println("constructor");
	}

	public void hello() {
		System.out.println("Say hello spring, I love you.");
	}
}
