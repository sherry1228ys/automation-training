package CS510Exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CS510Exam {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String> ();
		map.put(2, "b");
		map.put(1, "a");
		map.put(3, "c");
		map.put(0, "d");
		System.out.println(getValue(map));
		
	}
	
	
	public static List<String> getValue(Map<Integer, String> map) {
		
		if (map == null) {
			return null;
		}
		List<String> result = new ArrayList<String> ();
		for (int i = 0; i < map.size(); i++) {
		result.add(map.get(i));
		}
		return result;
		}

}
