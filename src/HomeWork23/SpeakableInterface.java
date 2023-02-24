package HomeWork23;

public class SpeakableInterface {
	interface Speakable{
		default void speak() {
			System.out.println("Somebody speaks");
		}
	}

}
