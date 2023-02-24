package HomeWork19;
public class Test1 {
	public static String[] abc(String[]args, String[] ...s1) {
		String array[] = new String[s1.length];
		for(int i=0; i<s1.length; i++) {
			for(int j=0; j<s1[i].length; j++) {
				if (args.length>0) {
					if(s1[i][j].equals(args[i])) {
						s1[i][j]=null;
					}	
			}					

				array[i]=s1[i][j];
				System.out.println(array[i]);
			
			}
		}
		return array;
	}
}
