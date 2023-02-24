package HomeWork23;
import HomeWork23.SpeakableInterface.Speakable;

public class Main {
	public static void main(String[] args) {
		Mechenosec mechenosec = new Mechenosec("Nemo");
		mechenosec.eat();
		mechenosec.swim();
		mechenosec.sleep();
		System.out.println(mechenosec.name);
///////////////////////////////////////////////////////////	
		Animal penguin1 = new Penguin("Pit");
		Speakable penguin2 = new Penguin("Pit");
		//penguin.sleep(); - не вызывает ни один метод
		penguin2.speak();
///////////////////////////////////////////////////////////		
		Animal lion = new Lion("Simba");
		lion.eat();
		lion.sleep();
		//lion.run(); - ошибка 
		System.out.println(lion.name);
///////////////////////////////////////////////////////////		
		Mammal lion2 = new Lion("Nala");
		lion2.eat();
		lion2.sleep();
		lion2.run();
		lion2.speak();
		System.out.println(lion2.name);
///////////////////////////////////////////////////////////		
		Speakable[] speakableArray = {penguin2, lion2};
		Animal[] animalArray = {penguin1,lion, lion2, mechenosec};
		
		for(Speakable elements: speakableArray ) {
			if(elements instanceof Penguin) {
				System.out.println(((Penguin)elements).name);
				elements.speak();
				((Penguin) elements).fly();
				((Penguin) elements).sleep();
				((Penguin) elements).eat();
			}
			if(elements instanceof Lion) {
				System.out.println(((Lion)elements).name);
				elements.speak();
				((Lion) elements).eat();
				((Lion) elements).sleep();
				((Lion) elements).run();
			}
		}
///////////////////////////////////////////////////////////		
		for(Animal elements: animalArray) {
			if(elements instanceof Penguin) {
				System.out.println(elements.name);
				elements.eat();
				elements.sleep();
				((Penguin) elements).fly();
				((Penguin) elements).speak();				
			}
			if(elements instanceof Lion) {
				System.out.println(elements.name);
				elements.eat();
				elements.sleep();
				((Lion) elements).run();
				((Lion) elements).speak();
			}
			if(elements instanceof Mechenosec) {
				System.out.println(elements.name);
				elements.eat();
				elements.sleep();
				((Fish) elements).swim();
			}
		}
///////////////////////////////////////////////////////////		

		
		
	}

}
