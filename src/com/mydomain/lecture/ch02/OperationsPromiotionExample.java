package com.mydomain.lecture.ch02;

public class OperationsPromiotionExample {

	public static void main(String[] args) {

		
	//	연산시 형이 다른 경우, 가장 큰 형으로 자동 형변환	
		int a = 10;
		double b = 10.0;
	//	int c = (a + b);
		int d = (int) (a + b);
		int e = a + (int) b;
		double f = a + b;
		
		System.out.println("d: " + d);
		System.out.println("e: " + e);
		System.out.println("f: " + f);
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//	byte byteValue3 = byteValue1 + byteValue2;
		int intValue = byteValue1 + byteValue2;
		System.out.println("intValue: " + intValue);
		
		char charValue1 = 'A';
		char charValue2 = 1;
	//	char charValue3 = charValue1 + charValue2;
		
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드: " + intValue2);
		System.out.println("출력문자: " + (char) intValue2);
	}

}
