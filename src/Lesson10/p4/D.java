package Lesson10.p4;
import Lesson10.p1.A;
import static Lesson10.p1.p2.B.b;
import Lesson10.p1.p2.p3.C;
import Lesson10.p4.p5.E;

public class D {
	
	public static void main (String [] args) {
		A obj = new A();
	    System.out.println(obj._a(5)); 
	    C obj1 = new C();
	    System.out.println(obj1._c(6));
	    E obj2 = new E(25 ,"Sam");
	    System.out.println(obj2.name);
	    System.out.println(b+obj._a(5)+obj1._c(6));
	}

}
