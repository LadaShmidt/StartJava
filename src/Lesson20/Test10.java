package Lesson20;
import java.util.ArrayList;
import java.util.List;
public class Test10 {
	public static void main(String[] args) {
		ArrayList <String> list1 = new ArrayList<>();
		list1.add("one");
		list1.add("two");
		list1.add("three");
		list1.add("four");
		list1.add("five");
		System.out.println("list1= "+list1);
///////////////////////////////////////////////////////////////		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("one");
		list2.add("three");
		list2.add("four");
		list2.add("ten");
		list1.removeAll(list2);
		System.out.println("list1= "+list1);
///////////////////////////////////////////////////////////////
		ArrayList<String> list3 = new ArrayList<>();
		list3.add("five");
		list1.retainAll(list3);
		System.out.println("list1= "+list1);
///////////////////////////////////////////////////////////////
		System.out.println(list1.containsAll(list3));
///////////////////////////////////////////////////////////////
		List <String> sublist = list2.subList(0, 2);
		System.out.println(sublist);
///////////////////////////////////////////////////////////////
		Object[]array1 = list1.toArray();
		String[]array2 = list2.toArray(new String[5]);
		for(String s:array2) {
			System.out.println(s);
		}
///////////////////////////////////////////////////////////////
		List<String> list4 = List.of("one","two","three");
		System.out.println("list4= "+list4);
///////////////////////////////////////////////////////////////
		List<String> list5 = List.copyOf(list4);
		System.out.println("list5= "+list5);
///////////////////////////////////////////////////////////////
		
	}

}
