package Lesson23;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		Car c1 = new Car("red", "v6");
		Car c2 = new Car("blac", "v5");
		Car c3 = new Car("red", "v6");
		ArrayList<Car> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		System.out.println(c1.equals(c3));
	}
}
