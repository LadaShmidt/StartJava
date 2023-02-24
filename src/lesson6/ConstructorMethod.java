package lesson6;

public class ConstructorMethod {
	int id;
	String surname;
	int age;
	String department;
	int salary;
	
	ConstructorMethod(int _id, String _surname, int _age, String _department, int _salary){
		id = _id;
		surname = _surname;
		age = _age;
		department = _department;
		salary = _salary;
		
		
		
	}
	ConstructorMethod(String _surname, int _age){
		surname = _surname;
		age = _age;
		
	}
}
