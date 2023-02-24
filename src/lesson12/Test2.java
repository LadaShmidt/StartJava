package lesson12;

public class Test2 {
	void maximum(int a, int b, int c) {
		if(a>b&&a>c) {
			System.out.println("Maximum:"+a);
		}else if(b>a&&b>c) {
			System.out.println("Maximum:"+b);
		}else {
			System.out.println("Maximum:"+c);
		}
	}
	void abc() {
		String str;
		int a =5;
	    if(a>=10) {
	    	str="Hello";
	    }else if (a<10) {
	    	str="Bye";
	    }else {
	    	str="none";
	    }
	}

}
