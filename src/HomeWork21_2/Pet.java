package HomeWork21_2;

public class Pet extends Animal{
	String name;
	int tail = 1;
	int paw = 4;
	public Pet() {
	    System.out.println("i am pet");
	    eyes = 2;
	}
	public void run() {
		System.out.println("Pet runs");
	}
	public void jump() {
		System.out.println("Pet jumps");
	}

}
