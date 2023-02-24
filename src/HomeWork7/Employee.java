package HomeWork7;

public class Employee {
	int id;
	public String surname;
	private double salary;
///////////////////////////////////////
	public void show1() {
	System.out.println(id);
	}
	public void show2() {
	System.out.println(surname);
	}
	public void show3() {
	System.out.println(salary);
	}
///////////////////////////////////////	
	public Employee (int id1) {
		id=id1;
	}
	Employee(String surname1){
		surname=surname1;
	}
	private Employee(double salary1) {
		salary=salary1;
	}
}
