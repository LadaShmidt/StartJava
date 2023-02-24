package HomeWork16;

public class Email {
	public static void email (String s1) {
		char c1;
		int i1=0;
		int i2=0;
		
		for(int i=0; i<s1.length(); i++) {
			c1=s1.charAt(i);
			if(c1=='@') {
				i1=i;
			}
			if(c1=='.') {
				i2=i;
				System.out.println(s1.substring(i1+1, i2));
			}
	  }
   }
}

