package HomeWork11;
import static HomeWork11.Car.*;
public class CarTest {
	public static void main(String [] args) {
		Car c1 = new Car("Red", "V8", 2);
		Car c2 = new Car("black", "V8", 4);
		c1.changeDoor(4);
		c2.changeDoor(2);
		System.out.println(c1.door);
		System.out.println(c2.door);
		swapColor(c1, c2);
		System.out.println(c1.color);
		System.out.println(c2.color);
		

	}
}
