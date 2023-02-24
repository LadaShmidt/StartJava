package Lesson20;
import java.util.ArrayList;
import java.util.*;
public class Test8 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("a");
		StringBuilder sb2 = new StringBuilder("b");
		StringBuilder sb3 = new StringBuilder("c");
		StringBuilder[] array = {sb2, sb1, sb3, sb3};
		List <StringBuilder> list1 = Arrays.asList(array);
		System.out.println(list1); 
	}	
}
