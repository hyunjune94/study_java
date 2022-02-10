package com.mydomain.lecture.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {

		String str1 = "강현준";
		String str2 = "강현준";
		String str3 = new String("강현준");
		
		boolean result1 = (str1 == str2);
		System.out.println("result1= " + result1);
		
		boolean result2 = (str1 == str3);
		System.out.println("result2= " +result2);
		
		System.out.println("str1.equals(str2): " + str1.equals(str2));
		System.out.println("str1.equals(str3): " + str1.equals(str3));

	}

}
