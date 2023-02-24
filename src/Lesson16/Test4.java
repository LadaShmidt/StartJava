package Lesson16;

public class Test4 {
	public static void main (String[]args) {
		String s1= "Hello world";
		String s2 = "beee";
		String s3 = s1.concat(s2).trim().replace("beee", "EEEEH").substring(6,10);//metod chaining
		System.out.println(s1.substring(s1.indexOf("w")));  	
	}
}
