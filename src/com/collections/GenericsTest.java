package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsTest {

	public static void main(String[] args) {
		
		testUnboundedWildCardList();

	}
	public static void testUnboundedWildCardList() {
		
		List rawList = new ArrayList();
		rawList.add(1);
		rawList.add("Hai");
		rawList.add(4);
		boolean isAdded = addToRawList(rawList, "Bye");
		System.out.println("GenericsTest.testUnboundedWildCardList()::isAdded = "+isAdded+" list size = "+rawList.size());
		
		//No Non-null elements can be added except null to the unbounded List - List<?>
		List<?> unboundedList = Arrays.asList("Hello1","Hello2","Hello3","Hello4","Hello5","Hello6");
		unboundedList.add(null);
		
		//Not Allowed
		//unboundedList.add(Integer.parseInt("3"));
		//unboundedList.add("Hello");
		System.out.println("GenericsTest.testUnboundedWildCardList()"+unboundedList.size()+" unboundedListElements = "+unboundedList);
		
		List<Object> objList = new ArrayList<Object>();
		objList.add(1);
		objList.add("Hello");
		
		List<?> listofUnknownType = new ArrayList<>();
		
		//Only null element is allowed in listofUnknownType
		listofUnknownType.add(null);
		
		//Not Allowed
		//listofUnknownType.add("Hello");
		
		List<Object> objList1 = new ArrayList<Object>();
		objList1.add("Hello");
		objList1.add(Integer.parseInt("4"));
		
		List<String> strList = new ArrayList<String>();
		List<Integer> intList = new ArrayList<Integer>();
		
		//Not allowed
		//List<Object> objList2 = new ArrayList<String>();
		//List<Object> objList3 = new ArrayList<Integer>();
		
		
		//As this method parameter is List of String, It only accepts List of Strings.Not List of Obj's, List of UnknownType(List<?)
		
		//Allows-- List of UnknownType(List<?) allows all type of List of Objects(objList, strList, intList)
		listofUnknownType = objList1;
		listofUnknownType = strList;
		listofUnknownType = intList;
		
		objList1 = (List<Object>) listofUnknownType;
		//Not Allowed
		//objList1 = (List<Object>)strList;
		
		strList = (List<String>) listofUnknownType;
		//Not Allowed
		//strList = (List<Object>)objList1;
		
		testListOfUnknownType(objList1);
		testListOfUnknownType(strList);
		
		//Not Allowed, Casting is Need from UnknownType to Objects
		//testListOfObjects(listofUnknownType);
		//testListOfObjects(strList);
	}
	private static boolean addToRawList(List rList, Object obj) {
		return rList.add(obj);
	}
	
	private static void testListOfUnknownType(List<?> listOfUnknownType) {
		
	}
	
	private static void testListOfObjects(List<Object> listOfObjects) {
		
	}
	
	private static void testListOfString(List<String> listOfStrings) {
		
	}

}
