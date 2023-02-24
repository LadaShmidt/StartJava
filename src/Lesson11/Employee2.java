package Lesson11;

public class Employee2 {
	public static void main (String [] args) {
		Employee1 emp1 = new Employee1("Sam", 22.3);
			double d = emp1.x2(emp1.salary);
			System.out.println(d);
			System.out.println(emp1.salary);
			emp1.salary2();
			System.out.println(emp1.salary);
	}

}
