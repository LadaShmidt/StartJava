package HomeWork23;

public class Penguin extends Bird{
	Penguin(String name){
		super(name);
		this.name = name;
	}
	@Override
	public void eat() {
		System.out.println("Penguin likes eats a fish");
	}
	@Override
	public void sleep() {
		System.out.println("Penguins sleaps together");
	}
	@Override
	public void fly() {
		System.out.println("Penguin cants fly");
	}
	@Override
	public void speak() {
		System.out.println("Penguin dont sings");
	}

}
