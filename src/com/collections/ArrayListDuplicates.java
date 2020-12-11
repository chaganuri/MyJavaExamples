package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayListDuplicates {

	public static void main(String[] args) {
		
		List<String> strDuplicatesList = new ArrayList<String>();
		strDuplicatesList.add("SUMAN");
		strDuplicatesList.add("SUMAN");
		strDuplicatesList.add("SUNIL");
		strDuplicatesList.add("SURESH");
		strDuplicatesList.add("SURESH");
		strDuplicatesList.add("SURAJ");
		strDuplicatesList.add("SURAJ");
		strDuplicatesList.add("SUDHEER");
		
		strDuplicatesList.stream().forEach(e->System.out.println("strDuplicatesList Elements ="+e));
		/*
		 * Removing Duplicates -- Convert AL To HashSet
		 */
		Set<String> removeDuplicates = new HashSet<String>(strDuplicatesList);
		
		List<String> nonDuplicatesList = new ArrayList<String>(removeDuplicates);
		
		System.out.println("\n");
		nonDuplicatesList.stream().forEach(e->System.out.println("After Removing Duplicates = "+e));
		
		//Find Duplicates
		Set<String> findDuplicatesSet = new HashSet<String>();
		List<String> findDuplicatesList = new ArrayList<String>();
		
		for (String ele : strDuplicatesList) {
			
			if(!findDuplicatesSet.add(ele))
				findDuplicatesList.add(ele);
		}
		System.out.println("\n");
		findDuplicatesList.stream().forEach(e->System.out.println("Duplicate Elements are : "+e));
		System.out.println("\n");
		
		//Using Streams 
		List<String> streamsDupRemovalList = strDuplicatesList.stream().distinct().collect(Collectors.toList());
		streamsDupRemovalList.stream().forEach(e->System.out.println("After Removing Duplicates Using Streams = "+e));
	}

}
