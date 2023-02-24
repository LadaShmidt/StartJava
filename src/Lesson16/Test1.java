package Lesson16;

public class Test1 {
	public static void main(String[]args) {
	String s1 = "Hello";
	String s2 = "Hello";
	System.out.println(s1==s2);//true потому что s1 и s2 ссылаются на один и тот же объект
	String a1 = new String("Bye");
	String a2 = new String("Bye");// такие объект ыне попадают в string pool
	System.out.println(a1==a2);//false потому что s1 и s2 ссылаются на разные объекты
	}
	

}
