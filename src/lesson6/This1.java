package lesson6;

public class This1 {
	int id;
	String surname;
	int age;
	int salare;
	String department;
	
	This1 (int id2, String surname2,int age2, int salary2, String depatment2 ){
		id = id2;
		surname = surname2;
		age = age2;
		salare = salary2;
		department = depatment2;
	}
	This1 (String surname3,int age3){
		this(0, surname3,age3, 0, null);
		
	}
	This1 (String surname4, String depatment4){
		this(0,surname4, 0, 0, depatment4);
		
	}
  
}
