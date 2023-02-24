package HomeWork6;

public class Student {
	int id;
	String Surname;
	String Name;
	int Cours;
	int Math;
	int Economy;
	int Language;
	Student (int id1,String Surname1, String Name1, int Cours1, int Math1, int Economy1, int Language1) {
		id = id1;
		Surname = Surname1;
		Name = Name1;
		Cours = Cours1;
		Math = Math1;
		Economy = Economy1;
		Language = Language1;
		
	}
	Student (int id2,String Surname2, String Name2, int Cours2) {
		this(id2, Surname2, Name2, Cours2, 0,0,0);
		
	}
	Student (){
		
	}
	void show(){
		System.out.println("id:"+id+" Surname:"+Surname+" Name:"+Name+" Cours:"+Cours+" Math:"+Math+" Economy:"+Economy+" Language:"+Language);
	}

}
