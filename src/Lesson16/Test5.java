package Lesson16;

public class Test5 {
	public static void main (String[]args) {
		String s1 = "For many years I thought about: the life of the earth.There is nothing, incomprehensible for me under the moon. I know that I dont know anything. Here is the last truth I discovered.";
		String s2 = s1.toUpperCase();
		char c1;
		char c2;
		for(int i=0; i<s1.length(); i++) {
			c1=s1.charAt(i);
			c2=s2.charAt(i);
			if(c1 !=',' && c1 !=':' && c1 !=' ' && c1 !='.' && c1==c2) {
				System.out.println();
				System.out.print(c1);
				continue;
			}
			System.out.print(c1);
		}
		System.out.println();
	}

}
