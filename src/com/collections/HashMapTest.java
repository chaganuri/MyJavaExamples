package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Nuthan", 40);
		Employee emp2 = new Employee("Nuthan", 40);
		boolean flag = emp1 == emp2;
		boolean hashCodeFlag = emp1.hashCode() == emp2.hashCode();
		System.out.println("HashMapTest.main()::emp1==emp2 " +flag+" state = "+emp1.equals(emp2)+" hashcode = "+hashCodeFlag);
		
		Map<Employee, String> hashMap = new HashMap<Employee, String>();
		
		hashMap.put(emp1, "1");
		hashMap.put(emp2, "2");
		String value1 = hashMap.get(emp1);
		String value2 = hashMap.get(emp2);
		//You will get both value1 and value2 values are 2 - because the value 1 got overridden by 2 as keys are same
		
		System.out.println("HashMapTest.main()::Value1 = "+value1+" Value2 = "+value2);
		
		//Note -- hashmap is not having emp3 object
		Employee emp3 = new Employee("Nuthan", 40);
		String value3 = hashMap.get(emp3);
		System.out.println("HashMapTest.main()::Value1 = "+value1+" Value2 = "+value2+" Value3 = "+value3);

	}

}
