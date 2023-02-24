package HomeWork11;

public class Car{
	String color;
	static String c;
	String engine;
	int door;
	Car(String color, String engine, int door){
		this.color = color;
		this.engine = engine;
		this.door = door;
	}
	
	void changeDoor(int door){
		this.door = door;
	}
	static void swapColor(Car c1, Car c2){
		c = c1.color;        //с = red
		c1.color = c2.color; //c1 = black
		c2.color = c;        //c2 = red 
		
	}

}
