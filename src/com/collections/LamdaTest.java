package com.collections;

@FunctionalInterface
interface Calculate{
	int sum(int x, int y);
	
	public default void sayHello() {
		System.out.println("Calculate.sayHello()");
	}
	
}

public class LamdaTest {
	
	public int intSum(int x, int y) {
		return x+y;
	}
	
	public static int integerSum(int x, int y) {
		return x+y;
	}

	public static void main(String[] args) {
		
		//Lambda Approach
		Calculate c = (x,y) -> x+y;
		int total = c.sum(8, 9);
		System.out.println("LambdaTest.main()::total = "+total);
		
		//Anonymous Inner class apprach
		Calculate cInner = new Calculate() {
			
			@Override
			public int sum(int x, int y) {
				return x+y;
			}
		};
		int total1 = cInner.sum(99, 77);
		System.out.println("LambdaTest.main()::total1 ="+total1);
		
		LamdaTest lamdaTest = new LamdaTest();
		int total2 = lamdaTest.intSum(44, 77);
		System.out.println("LamdaTest.main()::total2 = "+total2);
		
		//Object::MethodReference
		Calculate cInnerObjMethodReference = lamdaTest::intSum;
		
		System.out.println("LamdaTest.main():: Using Obj:MethodReference total = "+cInnerObjMethodReference.sum(43,23));
		
		//Using Class::StaticMethodReference
		Calculate cInnerClassMethodReference = LamdaTest::integerSum;
		
		System.out.println("LamdaTest.main():: Using Obj:MethodReference total = "+cInnerClassMethodReference.sum(41,23));
		
		

	}

}
