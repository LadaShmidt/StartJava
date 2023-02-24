package Lesson11;
import static Lesson11.Student.*;
public class Student2 {
	public static void main (String [] args) {
		Student st1 = new Student("Sam", 3, 10.5);
		Student st2 = new Student("Gab", 3, 5.5);
	swap(st1, st2);
	System.out.println(st1.name);
	
}

}