package Lesson15;

public class Test8 {
	public static void main(String[]args) {
		OUTER:for(int h=0; h<24; h++) {
			int m=0;
			ONEER:while(m<60) {
				System.out.println(h+":"+m);
				m++;
			}
		}
	}

}
