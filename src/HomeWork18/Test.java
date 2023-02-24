package HomeWork18;
public class Test {
	public static void sortirovka(int[]array) {
		int a=0;
		for(int i=0; i<array.length; i++) { 
			for(int j=i; j<array.length;j++) { 
				if(array[i]>array[j]) {				 
					a=array[i];
					array[i]=array[j];
					array[j]=a;					
			    }
		    }
		    System.out.print(array[i] + " ");
	    }
	}
}
