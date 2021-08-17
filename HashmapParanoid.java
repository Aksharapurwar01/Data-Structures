package bridgelabz;

import java.util.HashMap;
import java.util.Map;

public class HashmapParanoid {
	
	public static void main(String[] args)
	{

		String str = "“Paranoids are not\r\n"
				+ "paranoid because they are paranoid but\r\n"
				+ "because they keep putting themselves\r\n"
				+ "deliberately into paranoid avoidable\r\n"
				+ "situations”";
		
		Map<String, Integer> hashMap = new HashMap<>();

		String[] words = str.split(" ");

		for (String word : words) {

			Integer integer = hashMap.get(word);

			if (integer == null)
	
				hashMap.put(word, 1);

			else {
			
				hashMap.put(word, integer + 1);
			}
		}
		System.out.println(hashMap);
	}

}
