package com.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExamples {

	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("hello","","hai","bye","","GoodBye","","Thankyou","","Welcome");
		
		//Extract the list of strings whose len >6
		List<String> strLen6 = strList.stream().filter(e->e.length()>16).collect(Collectors.toList());
		strLen6.forEach(e->System.out.println("String Length > 6 are = "+e));
		//Count an empty Strings 
		long count = strList.stream().filter(e->e.isEmpty()).count();
		System.out.println("StreamAPIExamples.main()::No of empty String = "+count);
		
		//Count the no of Strings having length > 6
		long lengthCount = strList.stream().filter(e-> e.length()>6).count();
		System.out.println("\nStreamAPIExamples.main()::No of Strings >6 = "+lengthCount);
		
		List<String> intStrList = Arrays.asList("3","5","7","8","9","23");
		
		//Convert Integer Strings to Integer List
		List<Integer> intList = intStrList.stream().map(e->Integer.valueOf(e)).collect(Collectors.toList());
		intList.stream().forEach(e->System.out.println("\nElement  = "+e));
		
		List<Integer> intList1 = Arrays.asList(22,14,8,97);
		
		// Extract only even numbers
		intList1.stream().filter(number -> number%2==0).forEach(e->System.out.println("\nOnly EvenNumbers  = "+e));
		
		//Sort the GivenList in Ascending order and print
		intList1.stream().sorted().forEach(e->System.out.println("\nNatural Sorting Order  = "+e));
		
		//Sort the GivenList in Descending order, using comparator and print
		intList1.stream().sorted((e1,e2) -> e2.compareTo(e1)).forEach(e->System.out.println("\n Descending Order  = "+e));
	}
}
