package lesson8;

public class HomeWork8 {
	static int result;
	static int multiply (int a, int b, int c) {
		result = a*b*c;
		return result;
	}
	static void divide (int a, int b) {
		System.out.println("divide: "+a/b);
		System.out.println("remains: "+a%b);
	}

}
