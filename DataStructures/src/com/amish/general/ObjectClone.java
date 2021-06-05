package com.amish.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ObjectClone {

	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object>();
		Map<Object, Object> list1 = new HashMap<>();
		Map<String,String> map = new HashMap<>();
		
		map.put("1", "MMI");
		map.put("2", "RMT");
		map.put("3", "MMI");
		map.put("4", "ISV");
		
		HashMap<String, List<String>> valueToKeyMapCounter = new HashMap<>();
		
		String[] arr = {"ISV","MMI","RMT"};
		for (Map.Entry<String, String> entry : map.entrySet()) {
            if (valueToKeyMapCounter.containsKey(entry.getValue())) {
            	System.err.println("IFFFFFFFFFFF");
                valueToKeyMapCounter.get(entry.getValue()).add(entry.getKey());
            } else {
            	System.err.println("ELSEEEEEE");
                List<String> keys = new ArrayList<>();
                keys.add(entry.getKey());
                valueToKeyMapCounter.put(entry.getValue(), keys);
            }
        }
		
		/*for(String check : arr){
			if(map.containsValue(check)){
				for(Entry<String, String> test : map.entrySet()){
					if(test.getValue().equals(check)){
						System.err.println(true);
						list.add(test);
					}
				}
			list1.put(check, list.clone());
			list.clear();
			}
		}*/
		System.err.println("list1===="+valueToKeyMapCounter.toString());
	}
}
