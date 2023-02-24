package Lesson13;

public class Stuent2 {
	public static void main (String [] args) {
		Student1 st1 = new Student1(3);
		if(st1.grade==2) {
			System.out.println("Student is so bed");
		}
		else if(st1.grade==3) {
			System.out.println("Student is bed");
		}
		else if (st1.grade==4){
			System.out.println("Student is good");
		}
		else if(st1.grade==5) {
			System.out.println("Student is so good");
		}
		else {
			System.out.println("Undefined");
		}
		
		switch(st1.grade) {
		case 2:
			System.out.println("Student is so bed");
		      break;
		case 3:
			System.out.println("Student is bed");
		      break;
		case 4:
			System.out.println("Student is good");
		      break;
		case 5:
			System.out.println("Student is so good");
		      break;
		default:
			System.out.println("Undefined");
		      break;
		}
		
	}

}
