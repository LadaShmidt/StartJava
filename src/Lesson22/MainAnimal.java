package Lesson22;

public class MainAnimal {
	public void get(Animal animal) {
		System.out.println("A");
	}
	public void get(Mouse mouse) {
		System.out.println("M");
	}
	public static void main(String[] args) {
		MainAnimal ma = new MainAnimal();
		Animal animal = new Mouse();
		ma.get(animal); 
		
	}

}
