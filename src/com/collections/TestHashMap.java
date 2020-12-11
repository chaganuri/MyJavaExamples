package com.collections;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {
		
		HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
		System.out.println("TestHashMap.main()::hashMap.put(\"A\", 11)"+hashMap.put("A", 11));
		System.out.println("TestHashMap.main()::hashMap.put(\"B\", 12)"+hashMap.put("B", 12));
		System.out.println("TestHashMap.main()::hashMap.put(\"C\", 13)"+hashMap.put("C", 13));
		System.out.println("TestHashMap.main()::hashMap.put(\"A\", 14)"+hashMap.put("A", 14));
		System.out.println("TestHashMap.main()::hashMap.put(\"B\", 15)"+hashMap.put("B", 15));
		System.out.println("TestHashMap.main()::hashMap.put(\"C\", 16)"+hashMap.put("C", 16));
		
		for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println("TestHashMap.main()::key = "+entry.getKey()+"Value = "+entry.getValue());
		}
		

	}

}
