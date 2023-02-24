package Lesson20;
import java.util.ArrayList;
public class Test7 {
public static void main(String[] args) {
	StringBuilder sb1 = new StringBuilder("a");
	StringBuilder sb2 = new StringBuilder("b");
	StringBuilder sb3 = new StringBuilder("c");
	ArrayList<StringBuilder> list1 = new ArrayList<>();
	list1.add(sb1);
	list1.add(sb2);
	list1.add(sb3);
	Object[] array1 = list1.toArray();
	for(Object ob1 : array1) {
//		System.out.println(ob1);
	}
	StringBuilder[] array2 = list1.toArray(new StringBuilder[5]);
	for(StringBuilder sb: array2) {
		System.out.print(sb+" ");
	}
	
}
}
