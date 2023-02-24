package Lesson21;

public class HumanMain {
	public static void main(String[] args) {
		Human pit = new Human("male");
		pit.setName("Pit");
		pit.setAge(24);
		pit.setWeight(70);
		System.out.println(pit.getName());
		System.out.println(pit.getAge());
		System.out.println(pit.getWeight());
	}

}
