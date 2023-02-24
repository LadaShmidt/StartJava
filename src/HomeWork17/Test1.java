package HomeWork17;

public class Test1 {
	static boolean equality(StringBuilder a, StringBuilder b) {
		boolean result = true;
		if(a.length()==b.length()) {
			for(int i=0; i<a.length(); i++) {
				if(a.charAt(i)!= b.charAt(i)) {
					result = false;
					break;
				}
			}
		}else {
			result = false;
		}return result;
    }
}
