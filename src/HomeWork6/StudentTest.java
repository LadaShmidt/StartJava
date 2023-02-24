package HomeWork6;

public class StudentTest {
	public static void main (String [] args) {
		Student student1 = new Student (); 
		Student student2 = new Student ();
		Student student3 = new Student ();
		
		student1.id = 555;
		student1.Surname = "Pesov"; 	
		student1.Name = "Petr";
		student1.Cours = 2;
		student1.Math = 5;
		student1.Economy = 5;
		student1.Language = 4;
////////////////////////////////////////////////////
		student2.id = 556;
		student2.Surname = "Petrova"; 	
		student2.Name = "Lola";
		student2.Cours = 2;
////////////////////////////////////////////////////
		student1.show();
		student2.show();
		student3.show();
	}

}
