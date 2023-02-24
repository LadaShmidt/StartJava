package HomeWork23;

public abstract class Bird extends Animal implements SpeakableInterface.Speakable{
	Bird(String name) {
		super(name);
		this.name=name;
	}
	public abstract void fly();
	
	@Override
	public void speak() {
		System.out.println(name + "sings");
	}
}
