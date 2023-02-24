package Lesson19;

public class Test8 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("hi");
		StringBuilder sb2 = new StringBuilder("bye");
		StringBuilder sb3 = new StringBuilder("ok");
		StringBuilder[]array = {sb1, sb2, sb3};
		for(StringBuilder sb:array) {
			//sb = new StringBuilder("hello");
			sb.append("Java");// изменить объекты через foreach можно только через методы
		}
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]+" ");
		}
	}

}
