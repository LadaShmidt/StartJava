package HomeWork5;

public class Employee {
	int id;
	String surname;
	int age;
	double salary;
	int department;
	double raising() {
		salary *= 2;
		return salary;
	}
	void Info() {
		System.out.println("worker:" + surname + " zarplata: " + salary);
	}
}
