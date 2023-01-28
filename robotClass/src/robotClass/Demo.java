package robotClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		Map<String, Integer>  map=new HashMap<String, Integer>();
		map.put("India",91);
		map.put("Pak", 92);
		map.put("Aus",93);
		
		//1st way of iterating
		for(Map.Entry m2: map.entrySet()) {
			System.out.println(m2);
			
		}
		//2nd way of iteration
		Set<String> s=map.keySet();
		for(String m3:s) {
			System.out.println(m3 );
		}
		map.put("Aus", 94);
		System.out.println(map.get(map));
	}

}
