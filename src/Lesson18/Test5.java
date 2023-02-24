package Lesson18;
public class Test5 {
		public static void maxMin(double[]array) {
			double max = array[0];
			double min = array[0];
			for(int i=0; i<array.length; i++) {
				if(max<array[i]) {
					max=array[i];
				}else {
					min=array[i];
				}
		   }
			System.out.println("max:"+max);
			System.out.println("min:"+min);
	 }
}
