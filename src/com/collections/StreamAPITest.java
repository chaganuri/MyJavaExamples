package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPITest {
	static List<EmployeeVO> empList = null;
	static{
		EmployeeVO e1 = new EmployeeVO(1, "E1", 100, null);
		EmployeeVO e2 = new EmployeeVO(2, "E2", 200, "Mgr");
		EmployeeVO e3 = new EmployeeVO(3, "E3", 300, null);
		EmployeeVO e4 = new EmployeeVO(4, "E4", 400, "Mgr");
		EmployeeVO e5 = new EmployeeVO(5, "E5", 500, null);
		EmployeeVO e6 = new EmployeeVO(6, "E6", 600, "Mgr");
		
		empList = new ArrayList<EmployeeVO>();
		empList.add(e1);empList.add(e2);
		empList.add(e3);empList.add(e4);
		empList.add(e5);empList.add(e6);
	}

	public static void main(String[] args) {
		empList.stream().forEach(e->System.out.println("Before Incrementing the Salary of Mgrs ="+e));
		empList.stream().filter(e-> "Mgr".equals(e.getDesignation())).peek(e->e.setSalary(e.getSalary()*100)).
		collect(Collectors.toList()).forEach(e->System.out.println("After Incrementing the Salary of Mgrs ="+e));
	}
	
	public static EmployeeVO incSalary(EmployeeVO emp) {
		
		emp.setSalary(emp.getSalary()*10);
		return emp;
	}

}
