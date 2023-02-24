package Lesson14;

public class Test6 {
	public void time() {
		OUTER: for(int i=0;i<=23; i++) {
			INNER: for(int m=0;m<=59; m++) {
				System.out.println(i +":"+m);
			//	if(m==30) {break OUTER;}
			}
			
		}
	}

}
