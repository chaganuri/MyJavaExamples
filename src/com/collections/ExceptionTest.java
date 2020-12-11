package com.collections;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}catch (Exception e) {
			//e.printStackTrace();
			//System.out.println("ExceptionTest.main():e.toString()"+e.toString());
			System.out.println("ExceptionTest.main()e.getMessage()"+e.getMessage());
			//System.out.println("ExceptionTest.main()::e.getLocalizedMessage()"+e.getLocalizedMessage());
		}
		
		testfinally();
		System.out.println("ArrayDuplicatesTest.main()::After testFinally()");

	}
	
	/**
	 * If Exception raised in the code 
	 * 	1.If Catch block exists -- then finally block and statements after the finally block will get executed 
	 * 		its a normal terminal termination - so the statements after finally block will execute.
	 * 	2.If Catch block is not there -- then only finally block will execute and statements after finally block will not execute
	 * 		because of abnormal termination
	 *  3.If you use System.exit(0) - No catch, No finally block and no statements after the finally block will execute 
	 * Execution abrupts and comes out the application
	 * 
	 */
	public static void testfinally() {
		
		try {
			System.out.println("ArrayDuplicatesTest.testfinally()::::IN Try");
			int i=8/0;
			
			//System.exit(0);
			System.out.println("ArrayDuplicatesTest.testfinally()::After exception or System.exit");
		}
		//catch(Exception e) {System.out.println("ArrayDuplicatesTest.testfinally()"+e.getMessage());}
		finally {System.out.println("ArrayDuplicatesTest.testfinally():::In Finally");}
		System.out.println("ArrayDuplicatesTest.testfinally():::hai After Final");
	}


}
