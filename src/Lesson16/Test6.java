package Lesson16;

public class Test6 {
	public static void main (String[]args) {
		String s1 = new String("ok");
		String s2 = new String("ok");
		System.out.println(s1==s2);//false - сравнивает разные ссылки на объекты 
		System.out.println(s1.equals(s2));//true-сравнивает объекты
		
		String s3 = "ok";
		String s4 = "OK";
		System.out.println(s3.equals(s4));//false-изза разных регистров
		System.out.println(s3.equalsIgnoreCase(s4));//true-игнорирует разность регистров
		
		String x1="Hello";//создал новый объект
		String x2="Hello".trim();//не создал новый объект, потому что трим ничего не изменил 
		
		String y1="Hello";//создал новый объект
		String y2=" Hello".trim();//cоздает уже новый объект из-за пробела
		
		
		
		}

}
