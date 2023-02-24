package HomeWork20;
import java.util.ArrayList;
import java.util.Collections;
public class Test1 {
	static ArrayList<String> abc(String ...s) {
		ArrayList<String> list = new ArrayList<>();
		for(int i=0; i<s.length; i++) {
			if(list.contains(s[i]) ) {
				continue;
			}else {
				list.add(s[i]);
			}		
		}
		Collections.sort(list);
		System.out.println(list);
		return list
	}

}
