package HomeWork21_1;

public class Student {
	private StringBuilder name = new StringBuilder();
	public StringBuilder getName () {
		return name;
	}
	public void setName(StringBuilder name) {
		if(name.length() >= 3) {
			this.name = name;
		}	
	}
/////////////////////////////////////////////////////////	
	private int grade;
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		if(grade >= 1 && grade <= 10) {
			this.grade = grade; 
		}
    }
/////////////////////////////////////////////////////////
	private int cours;
	public int getCours() {
		return cours;
	}
	public void setCours(int cours) {
		if(cours >= 1 && cours <= 4) {
			this.cours = cours;
		}
	}
/////////////////////////////////////////////////////////
	public void showInfo() {
		System.out.println("Name: " + getName());
		System.out.println("Grade: " + getGrade());
		System.out.println("Cours: " + getCours());		
	}
/////////////////////////////////////////////////////////
}
