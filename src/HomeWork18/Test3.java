package HomeWork18;
//String array[][]= {{"snow","winter","cold"},{"swimmingpool","summer","sunshine"}};
public class Test3 {
	public static void showArray(String[][]array) {
		System.out.print("{");
		for(int i=0; i<array.length; i++) {
			System.out.print("{");
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+i+j+" ");
			}
			System.out.print("}");
		}
		System.out.print("}");
	}

}
