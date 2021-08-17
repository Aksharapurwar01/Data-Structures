package bridgelabz;

import java.util.HashMap;
import java.util.Map;


class Hashmap {
	public static void main(String[] args)
	{

		String str = "To Be or Not to Be";

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

