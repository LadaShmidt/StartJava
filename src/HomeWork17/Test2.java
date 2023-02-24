package HomeWork17;
import static HomeWork17.Test1.*;
public class Test2 {
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Hi friends");
		StringBuilder s2 = new StringBuilder("Hi frieds");
		StringBuilder s3 = s1;
	    System.out.println(equality(s1,s2));  
	    System.out.println(equality(s1,s3)); 
	    
	}

}
