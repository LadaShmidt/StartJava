package Lesson20;
import java.util.ArrayList;
public class test6 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("a");
		StringBuilder sb2 = new StringBuilder("b");
		StringBuilder sb3 = new StringBuilder("c");
		ArrayList<StringBuilder> list1 = new ArrayList<>();
		list1.add(sb1);
		list1.add(sb2);
		list1.add(sb3);
		ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>)list1.clone();
		//System.out.println(list1==list2);
		//System.out.println(list1.get(0)==list2.get(0));	// вернет true потому что ссылаютс на один и тот же объект
		list1.get(0).append("boo");
		list1.set(0, new StringBuilder("d"));
		System.out.println(list2.get(0));
	}

}
