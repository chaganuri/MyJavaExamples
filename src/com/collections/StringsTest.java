package com.collections;

public class StringsTest {

	public static void main(String[] args) {

		/**
		 * If we are creating the String objects using new operator, two new string objects
		 * will be created in the Heap area. So that's why the s1==s2 returns false.
		 */
		String s1 = new String("thimmu");
		String s2 = new String("thimmu");

		System.out.println("String with new :: s1 = "+s1+" s2 = "+s2 +
				" If s1 and s2 both are pointing to the same object ="+(s1==s2));
		System.out.println("String with new :: s1.equals(s2) ::: "+s1.equals(s2));

		/**
		 * If we are creating the String objects without using new operator, Only one string object
		 * will be created in String Constant pool and reference will be assigned to the second one.
		 * So, now both s3 and s4 points to the same object
		 * So that's why the s3==s4 returns true.
		 */
		String s3 = "thimmu";
		String s4 = "thimmu";
		System.out.println("String Constant Pool :: s3 = "+s3+" s4 = "+s4 +
				" If s3 and s4 both are pointing to the same object ="+(s3==s4));
		System.out.println("String Constant Pool :: s3.equals(s4) ::: "+s3.equals(s4));

		/**
		 * In StringBuffer, the s5==s6 returns false as those are two different objects
		 * But s5.equals(s6) returns false, because the equals() is not overridden in StringBuffer class.
		 * It inherits from Object class. The Object class equals() is always reference comparision.
		 * So that's why, s5.equals(s6) returns false though their contents are same.
		 */
		StringBuffer s5 = new StringBuffer("thimmu");
		StringBuffer s6 = new StringBuffer("thimmu");

		System.out.println("StringBuffer :: s5 = "+s5+" s6 = "+s6 +
				" If s5 and s6 both are pointing to the same object ="+(s5==s6));
		System.out.println("StringBuffer :: s5.equals(s6) ::: "+s5.equals(s6));


	}

}
