package Lesson20;
import java.util.ArrayList;
public class Test2 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList<>();
		Car с = new Car();
		list1.add("Hello");
		list1.add(с);
		ArrayList<String>list2=new ArrayList<String>();
		list2.add("red");
		list2.add("black");
		ArrayList<StringBuilder>list3= new ArrayList<>();
		list3.add(new StringBuilder("Hi"));
	    ArrayList<String> list4 = new ArrayList<>(list2);
	    System.out.println(list2==list4);
	}
}