package Lesson19;

public class Test1 {
	static void summ(int ... a) {
		int summ = 0;
		for(int i=0; i<a.length; i++) {
			summ += a[i];
		}
		System.out.println(summ);
	}

}
