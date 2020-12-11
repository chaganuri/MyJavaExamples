package com.collections;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		
		Employee empNull = null;
		Optional<Employee> op = Optional.ofNullable(empNull);
		System.out.println("OptionalTest.main()::"+op.isPresent());
		//Optional<Employee> op2 = op.orElse(Employee.EMPTY);
		Optional<Employee> op1 = Optional.of(empNull);
		//System.out.println("OptionalTest.main()::"+op.isPresent());

	}

}
