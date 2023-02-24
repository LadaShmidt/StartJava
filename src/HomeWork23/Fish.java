package HomeWork23;

public abstract class Fish extends Animal {
	Fish(String name) {
		super(name);
		this.name = name;
	}
	@Override
	public void sleep() {
		System.out.println("it's always interesting to watch how fish sleep");
	}
	public abstract void swim();
	

}
