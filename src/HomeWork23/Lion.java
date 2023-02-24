package HomeWork23;

public class Lion extends Mammal{
	Lion(String name){
		super(name);
		this.name = name;
	}
	@Override
	public void sleep() {
		System.out.println("The lion sleeps most of the day");
	}
	@Override
	public void eat() {
		System.out.println("The lion likes to aet a meat");
	}
	@Override
	public void run() {
		System.out.println("The lion is not the fastest cat");
	}

}
