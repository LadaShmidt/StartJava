package Lesson11;
public class Student {
	public String name;
	public int cours;
	public double grade;
	public  Student(String name, int cours, double grade){
		this.name=name;
		this.cours=cours;
		this.grade=grade;
	}
	public static void swap (Student st1, Student st2) {
		Student st3 = st1;
		st1=st2;
		st2=st3;
	}
		

}
