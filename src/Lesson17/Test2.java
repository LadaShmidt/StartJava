package Lesson17;

public class Test2 {
	public static void main(String[] args) {
		StringBuilder sb1= new StringBuilder("Hello World!");
		String s=null;
		s=sb1.append("How are you?").substring(sb1.indexOf("W"), sb1.indexOf("!"));
		System.out.println(s);
	}

}
