package Lesson11;

public class Employee1 {
	public String name;
	public double salary;
	Employee1(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	double salary2() {
		salary = salary*2;
		return salary;
	}
    double x2(double a) {
		a *=2;
		return a;
	}

}
