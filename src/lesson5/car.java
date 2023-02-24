package lesson5;

public class car {
	String color;
	String engine;
	int accerelotion;
	
	int gas (int speed) {
		accerelotion += speed;
		return speed;
	}
	int brake (int speed) {
		accerelotion -= speed;
		return speed;
	}
	void showInfo() {
		System.out.println("cvet: "+ color + " motor: " + engine + " skorost: " + accerelotion	);
	
	
	}
	

}
