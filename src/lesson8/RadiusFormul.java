package lesson8;

public class RadiusFormul {
	static final double p = 3.14;
	static double area;
	static double length;
	double AreaCircle(double a) {
		area = p*a*a;
		return area;
	}
	static double LengthCircle(double a) {
		length = 2*p*a;
		return length;
	}
	void show (double a) {
		System.out.println("Radius:"+a);
		System.out.println("Area:"+ AreaCircle(a));
		System.out.println("Lengts:"+LengthCircle(a));
	}

}
