package mydemo.app;

import java.lang.reflect.Constructor;

public abstract class TestPrivateConstructor {

	public static void main(String[] args) {

		try {
			Class cls = Class.forName("mydemo.beans.Hello");
			Constructor cons[] = cls.getDeclaredConstructors();
			cons[0].setAccessible(true);
			cons[0].newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
