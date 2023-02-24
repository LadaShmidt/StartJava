package lesson12;

public class CarTest {
public static void main (String[]args) {
	Car c1 = new Car(3,4);
	Car c2 = new Car(2,5);
	
	if(c1.engine>c2.engine) { //первый if
		if(c1.door>c2.door) { //второй if
			System.out.println("Firs car is cool");
		}else {               //второй else
			System.out.println("first car is soso");
			}
	}else {                   //первый else
		System.out.println("firs car is bad");
	}
		
}
}
