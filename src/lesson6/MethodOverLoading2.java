package lesson6;

public class MethodOverLoading2 {
	public static void main (String []  args) {
		MethodOverLoading1 m = new MethodOverLoading1();
		int i1 = 5;
		double d1 = 1.2;
	    String s1 = "string";
	    boolean b1 = true;
	    m.show(i1);
	    m.show(d1);
	    m.show(s1);
	    m.show(b1);
	}

}
