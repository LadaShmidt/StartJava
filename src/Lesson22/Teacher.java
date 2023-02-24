package Lesson22;

public class Teacher extends Employee {
	@Override
	public Teacher eat() {
		// TODO Auto-generated method stub
		System.out.println("Teachet eats");
		return new Teacher(); 
	}
	int students;
	void teach() {
		System.out.println("Teach");
	}

}
