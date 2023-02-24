package Lesson22;

public class Main {
	public static void main(String[] args) {
		Employee emp1 = new Surgion();
		emp1.eat();
		emp1.name = "Pit";
		// объекты, которые не сработают при таком вызове
		//emp1.scalpel = "1";
		//emp1.age();
		Teacher teacher1 = new Teacher();
		teacher1.eat();		
	}

}
