package Lesson16;

public class Test2 {
	String color;
	String engine;
	Test2(String color,	String engine){
		this.color=color;
		this.engine=engine;
	}
	final static int a=5;
	public Test2 abc(String color) {
	   Test2 car10 = new Test2(color,"v4");
	   return car10;
	}


}
