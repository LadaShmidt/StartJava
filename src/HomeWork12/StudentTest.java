package HomeWork12;
import Lesson11.*; 
public class StudentTest {
	static void comparison (Student st1, Student st2) {
		if(st1.equals(st2)) {
			System.out.println("students equals");
		}else {
			System.out.println("studenys is not equals");
		}
	}
	static void comparison2 (Student st1, Student st2) {
		if (st1.name==st2.name) {
			if(st1.cours==st2.cours) {
				if(st1.grade==st2.grade) {
					System.out.println("Student is equal");
				}else {System.out.println("Student is bad equal");}
			}else {System.out.println("Student is so bad equal");}
		}else {System.out.println("Student is not equal");}
	}

}
