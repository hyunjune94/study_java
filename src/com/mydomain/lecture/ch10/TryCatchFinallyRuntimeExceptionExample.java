package com.mydomain.lecture.ch10;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		
		try {
		String data1 = null;
		String data2 = null;

		data1 = args[0];
		data2 = args[1];
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1 + value2;
		
		System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(Exception e) {
			System.out.println("error");
		} finally {
			System.out.println("finally");
		}
	}
}
