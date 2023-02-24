package Lesson16;

public class Test2Test {
	public static void main(String []args) {
		//Test2.a=10;
		Test2 c = new Test2("Red","v6");
		Test2 c2 =c.abc("Black");
		System.out.println(c.color);//через работу с методом abc цвет не поменяется
	}

}
