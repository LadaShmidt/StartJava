package Lesson18;

public class Test1 {
	public static void main(String[] args) {
//////////decloration- создание массива//////////
		int [] array1;
		String [] array2;
		double[][] array3;
//////////location- кол-во мест в массиве//////////
		array1 = new int[8];
		array2 = new String[3];
		array3 = new double [4][2];
		System.out.println(array2.length);
//////////инициализация//////////
		array2[0]="hello";
		array2[1]="bye";
		array2[2]="ok";
		
		array3[0][0]=3.14;
		array3[2][1]=3.14;
		
		double[] array4;
		array4=new double[2];
		array4[0] = 2.5;
		array4[1] = 3.5;
		array3[1]=array4;
		System.out.println(array3[1][0]);
		System.out.println(array3[1][1]);
		
		
				
		
	}

}
