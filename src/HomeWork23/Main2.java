package HomeWork23;
import HomeWork23.SpeakableInterface.Speakable;

public class Main2 {
	public static void main(String[] args) {
		Animal penguin1 = new Penguin("Pit");
		Bird penguin2 = new Penguin("Bit");
		Penguin penguin3 = new Penguin("Mit");
		Speakable penguin4 = new Penguin("Git");
		
		Animal lion1 = new Lion("Pik");
		Mammal lion2 = new Lion("Bik");
		Lion lion3 = new Lion("Mik");
		Speakable lion4 = new Lion("Gik");
		
		Animal mechenosec1 = new Mechenosec("Pin");
		Fish mechenosec2 = new Mechenosec("Bin");
		Mechenosec mechenosec3 = new Mechenosec("Min");
		
		Animal[] animalArray = {penguin1, penguin2, penguin3, lion1, lion2, lion3, mechenosec1, mechenosec2, mechenosec3};
		Speakable[] speakableArray = {penguin2, penguin3, penguin4,lion2, lion3, lion4};
		
		for(Animal element: animalArray) {
			if(element instanceof Penguin) {
				System.out.println(element.name);
				element.eat();
				element.sleep();
				Penguin penguin = (Penguin)element;
				penguin.fly();
				penguin.speak();
			}
			if(element instanceof Lion) {
				System.out.println(element.name);
				element.eat();
				element.sleep();
				Lion lion = (Lion)element;
				lion.run();
				lion.speak();
			}
			if(element instanceof Mechenosec) {
				System.out.println(element.name);
				element.eat();
				element.sleep();
				Mechenosec mechenosec = (Mechenosec)element;
				mechenosec.swim();
			}			
		}
		for(Speakable element: speakableArray) {
			if(element instanceof Penguin) {
				element.speak();
				Penguin penguin = (Penguin)element;
				System.out.println(penguin.name);
				penguin.eat();
				penguin.fly();
				penguin.sleep();
			}
			if(element instanceof Lion) {
				element.speak();
				Lion lion = (Lion)element;
				System.out.println(lion.name);
				lion.eat();
				lion.run();
				lion.sleep();
			}
		}
	}

}
