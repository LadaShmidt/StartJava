package lesson12;

public class Test2Value {
	public static void main(String[]args) {
		Test2 t = new Test2();
		t.maximum(5, 6, 1);
		
		int a = 10;
		int b = 20;
		int maximum = (a>b)?a:b;
		System.out.println(maximum);
	}

}
