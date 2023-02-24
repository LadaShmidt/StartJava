package Lesson20;
import java.util.ArrayList;
public class Test5 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list1 = new ArrayList<>();
///////////////////////////////////////////////////////////////
		list.add("hi");
		list.add("bye");
		list.add("ok");
		list.add(0,"hello");
		list.set( 1, "good");
		list.remove(1);
		for(String s:list) {
			System.out.println(s+" ");
///////////////////////////////////////////////////////////////
		list1.add("pink");
		list1.add("black");
		list1.add("red");
		list1.addAll(list);
		list1.clear();
		}
		System.out.println();
		System.out.println(list.get(2));	
		System.out.println(list.indexOf("ok"));
		System.out.println(list.size());
		System.out.println(list.isEmpty());//вернет true если массив будет пустым 
		System.out.println(list.contains("ok"));// вернет true если объект есть в массиве
///////////////////////////////////////////////////////////////
		System.out.println(list1);
	}

}
