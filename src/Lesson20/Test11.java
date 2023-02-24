package Lesson20;
import java.util.HashMap;
import java.util.Map;
public class Test11 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(777, "Ivanov");
		map.put(778, "Petrov");
		map.put(779, "Sidorov");
		map.put(780, "Smirnov");
		map.put(780, "Sobolev");// повторяющийся объект перезапишется на последний
		map.remove(780);
		System.out.println("map="+map);
	}

}
