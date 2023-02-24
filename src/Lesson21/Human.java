package Lesson21;

public class Human {
///////////////////////////////////	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
///////////////////////////////////	
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0) {
			this.age = age;			
		}
	}
///////////////////////////////////
	private int weight;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if(weight>0) {
			this.weight = weight;			
		}
	}
///////////////////////////////////	
	private boolean clever;
	public boolean isClever() {
		return clever;
	}
	public void setClever(boolean clever) {
		this.clever=clever;
	}
///////////////////////////////////	
	final String sex;
	public Human (String sex){
		this.sex=sex;
	}
}
