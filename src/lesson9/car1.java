package lesson9;

public class car1 {
	String color;
	String engine;//зона видимости-любой объект
	int a =10;
	static int count;// область видимости - класс
	car1(String color1, String engine){
		count++;
		color=color1;
		this.engine=engine;
	}
	
	public static void chageA() {
		car1 obj = new car1("Blac", "v2");
		obj.a = 11;
		
	}
	public void showColor() {
		System.out.println("Color of car:"+"color");
	}
	public void changecolor(String color3) {
		System.out.println("Color of car is changes");
		int sum = 5000;// область видимости-метод
		color = color3;
		sum +=1000;
	}

}
