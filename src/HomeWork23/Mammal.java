package HomeWork23;

public abstract class Mammal extends Animal implements SpeakableInterface.Speakable{
	Mammal(String name){
		super(name);
		this.name=name;
	}
	public abstract void run();

}
