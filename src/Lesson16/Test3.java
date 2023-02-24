package Lesson16;

public class Test3 {
	public static void main (String[]args) {
	String s1 = new String("hello world and people");
	int a = s1.length();
	System.out.println(a);//22
	System.out.println(s1.charAt(13));//n
	/////////////////////////////////////////
	char b=s1.charAt(14);
	System.out.println(b);
	/////////////////////////////////////////
	int c = s1.indexOf("p");
	System.out.println(c);
	/////////////////////////////////////////
	int d = s1.indexOf("peop");
	System.out.println(d);
	/////////////////////////////////////////
	boolean e=s1.startsWith("hel", 0);//начинается ли
	System.out.println(e);
	/////////////////////////////////////////
	boolean b2 = s1.endsWith("ple");
	System.out.println(b2);
	/////////////////////////////////////////
	String b3 = s1.substring(3);//покаазывает часть строки с указанного индекса
	System.out.println(b3);
	/////////////////////////////////////////
	String s3 = s1.substring(3,5);//выводить часть когда и заданного промежутка
	System.out.println(s3);
	/////////////////////////////////////////
	String s2 = new String("  hello world  ");
	String s4 = s2.trim();//убирает боковые пробелы
	System.out.println(s4);
	/////////////////////////////////////////
	String s5 = s2.replace("h", "l");
	System.out.println(s5);
	/////////////////////////////////////////
	String a1="hello";
	String a2 = "friends";
	System.out.println(a1.concat(a2));
	/////////////////////////////////////////
	int i1=5;
	int i2=6;
	String i3="okey";
	System.out.println(""+(i1+i2)+i3);
	/////////////////////////////////////////
	String h1= "hello";
	System.out.println(h1.toUpperCase());
	String h2= "HELLO";
	System.out.println(h2.toLowerCase());
	/////////////////////////////////////////
	boolean h3 = s1.contains("W");//есть ли...
	System.out.println(h3);
	/////////////////////////////////////////
	String g1="Hello";
	System.out.println(g1.isBlank());
	String g2=" ";
	System.out.println(g2.isBlank());// вернет true потому что работает с объектами в которых только пробел 
	/////////////////////////////////////////
	String f1="";
	System.out.println(f1.isEmpty());// вернет true потому что работает с пустыми объектами
	String f2=" Hello   ";
	System.out.println(f2.stripLeading());// убирает пробелы слева
	String f3=" Hello   ";
	System.out.println(f3.stripTrailing());// убирает пробелы справа 
	/////////////////////////////////////////
	String d1="gus";
	String d2=d1.strip();
	System.out.println(d1==d2);
	
	
	
	}
}
