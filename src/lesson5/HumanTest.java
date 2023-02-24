package lesson5;

public class HumanTest {
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.name = "Gob";
		h1.car = new Car3("red", "V8");
		h1.bA = new BancAccount(8856,56.95);
		h1.info();
	}
	
	
}
