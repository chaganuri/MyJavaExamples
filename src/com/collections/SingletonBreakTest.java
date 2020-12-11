package com.collections;

public class SingletonBreakTest {
	
	private SingletonBreakTest() {}
	
	private static SingletonBreakTest singletonBreakTest;
	
	public static SingletonBreakTest getInstance() {
		
		if(singletonBreakTest == null)
			singletonBreakTest = new SingletonBreakTest();
		
		return singletonBreakTest;
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		SingletonBreakTest s1 = SingletonBreakTest.getInstance();
		SingletonBreakTest s2 = SingletonBreakTest.getInstance();
		
		boolean isSameObjs = s1==s2;
		System.out.println("SingletonBreakTest.main():: s1 = "+s1+" s2 = "+s2+" isSameObjs = "+isSameObjs);
		
		/*
		 * We can break Singleton Design pattern by using Class.forName() and newInstance() methods by Class class methods.
		 * By using the following type, we can create every time a new object like s3 and s4
		 */
		Class cls1 = Class.forName("com.collections.SingletonBreakTest"); 
		SingletonBreakTest s3 = (SingletonBreakTest) cls1.newInstance(); 
		System.out.println("SingletonBreakTest.main()::s3 = "+s3);
		
		Class cls2 = Class.forName("com.collections.SingletonBreakTest"); 
		SingletonBreakTest s4 = (SingletonBreakTest) cls2.newInstance(); 
		System.out.println("SingletonBreakTest.main():: s4 = "+s4);
		

	}

}
