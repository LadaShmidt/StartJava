package Lesson19;

public class Test7 {
	public static void main(String[] args) {
		String [] students = {"ivanov", "petrov", "Sidorov"};
		String [] exams = {"math", "inglish", "technology"};
		for(String s1:students) {
			for(String s2:exams) {
				System.out.println(s1+":"+s2);
			}
		}
		int[][]array= {{3,7,8},{4,5},{9,4,4,6,8,3}};
		for(int[] array2:array) {
			for(int a:array2) {
				System.out.print(a+" ");
			}
		}
		String[]array1= {"hello ","Bye ","ok "};
		for(String s:array1) {
			s=new String("Hi");
			
		}
		
			
		for (int i = 0; i < array1.length; i++) {
			array1[1] = "hi ";
		}
		
		for(String s:array1) {
			System.out.print(s);
		}
	}

}
