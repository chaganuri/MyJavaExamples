package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
	
	static {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> intTreeSet = new TreeSet<Integer>();
		intTreeSet.add(2);intTreeSet.add(2);//Duplicate
		intTreeSet.add(5);intTreeSet.add(12);intTreeSet.add(27);
		intTreeSet.add(72);intTreeSet.add(27);//Duplicate
		intTreeSet.add(42);intTreeSet.add(24);intTreeSet.add(32);
		intTreeSet.add(82);intTreeSet.add(27);
		
		//Check for NoInsertionOrder & Natural Sorting order(Asc)
		intTreeSet.stream().forEach(e->System.out.println("TreeSet : Element = "+e));
		
		//TreeSet With Comparator for Integer Objects -- Check for Descending Order
		Set<Integer> intTreeSetComparator = new TreeSet<Integer>((e1, e2) ->e2.compareTo(e1));
		intTreeSetComparator.add(2);intTreeSetComparator.add(2);//Duplicate
		intTreeSetComparator.add(5);intTreeSetComparator.add(12);intTreeSetComparator.add(27);
		intTreeSetComparator.add(72);intTreeSetComparator.add(27);//Duplicate
		intTreeSetComparator.add(42);intTreeSetComparator.add(24);intTreeSetComparator.add(32);
		intTreeSetComparator.add(82);intTreeSetComparator.add(27);
		
		intTreeSetComparator.stream().forEach(e->System.out.println("TreeSet with Descending order Comparator : Element = "+e));
		
		
		Employee emp1 = new Employee("Nuthan", 40);
		Employee emp2 = new Employee("Nithin", 45);
		Employee emp3 = new Employee("Narayana", 47);
		Employee emp4 = new Employee("Narasimha", 41);
		Employee emp5 = new Employee("Naveen", 740);
		Employee emp6 = new Employee("Natesh", 240);
		Employee emp7 = new Employee("Nazeer", 400);
		Employee emp8 = new Employee("Neol", 407);
		
		
		//Treeset with Comparator for Name Ascending
		//For Descending Order just change e2.getEmpName().compareTo(e1.getEmpName()
		Set<Employee> empTreeSetComparator = new TreeSet<Employee>((e1, e2) -> e1.getEmpName().compareTo(e2.getEmpName()));
		empTreeSetComparator.add(emp1);empTreeSetComparator.add(emp2);empTreeSetComparator.add(emp3);
		empTreeSetComparator.add(emp4);empTreeSetComparator.add(emp5);empTreeSetComparator.add(emp6);
		empTreeSetComparator.add(emp7);empTreeSetComparator.add(emp8);
		
		empTreeSetComparator.stream().forEach(e->System.out.println("TreeSetTest.main():: Employee = "+e));
		

	}

}
