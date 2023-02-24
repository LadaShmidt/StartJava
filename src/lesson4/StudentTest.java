package lesson4;

public class StudentTest {
public static void main (String[]args) {
	Student Pavel = new Student () ;
	Student Nastya = new Student () ;
	Student Rita = new Student () ;
	Pavel.NumberStudentTiket = 123;
	Pavel.Name = "Pavel";
	Pavel.SecondName = "Pulov";
	Pavel.YearStudy = 2009;
	Pavel.Math = 5;
	Pavel.Economy = 3;
	Pavel.Language = 5;
	///////////////////////////////////
	Nastya.NumberStudentTiket = 124;
	Nastya.Name = "Nastya"; 
	Nastya.SecondName = "Li";
	Nastya.YearStudy = 2009;
	Nastya.Math = 4;
	Nastya.Economy = 5;
	Nastya.Language = 3;
	//////////////////////////////////
	Rita.NumberStudentTiket = 125;
	Rita.Name = "Rita";
	Rita.SecondName = "Kulova";
	Rita.YearStudy = 2009;
	Rita.Math = 4;
	Rita.Economy = 4;
	Rita.Language = 3;
	
	System.out.println("Pavel: "+(Pavel.Math+Pavel.Economy+Pavel.Language)/3); 
	System.out.println("Nastya: "+(Nastya.Math+Nastya.Economy+Nastya.Language)/3); 
	System.out.println("Rita: "+(Rita.Math+Rita.Economy+Rita.Language)/3); 
}
}
