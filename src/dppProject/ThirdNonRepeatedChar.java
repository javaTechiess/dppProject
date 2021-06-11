package dppProject;

import java.util.LinkedHashMap;
import java.util.Map;

public class ThirdNonRepeatedChar {
	public static void main(String[] args) {
		String str = "preeti";
		int times = 0;
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (Character c : str.toCharArray()) {
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
		}

		for (Map.Entry entry : map.entrySet()) {
			if (Integer.parseInt(entry.getValue().toString()) == 1) {
				times++;
				if (times == 3) {
					System.out.println(entry.getKey());
				}
			}
		}

	}

}
