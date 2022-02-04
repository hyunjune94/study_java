package com.mydomain.lecture.ch02;

public class Variable {

	public static void main(String[] args) {
		
	//	변수 명명법
	//	첫글자 소문자 그리고 다음 문자열 부터는 대문자
	//	대소문자 구분
		
	//	boolean defaultNy = 1;
		String fullName = "Hyunjune Kang";
		String name = "Hyunjune";
				
		int roomNumber = 1;
		int roomnumber = 3;
		
		int a = 1;
		int b = 2;		
		int c = 0;
		
		c = a + b;		
		
		boolean defaultNy = false;
		
		byte aa = 0;
		short bb = 0;
		int cc = 0;
		long dd = 0;
		
		float ee = 0.0f;
		double ff = 0.0;
		
		char gg = ' ';
		
		String hh = " ";
		
		System.out.println("fullName: " + fullName);
		System.out.println("name: " + name);
		
		System.out.println("roomNumber: " + roomNumber);
		System.out.println("roomnumber: " + roomnumber);		
		System.out.println("roomnumber: " + roomnumber + "!!!!");

		System.out.println(c);
		
		System.out.println("한칸 들여쓰기");
		System.out.println("\t한칸 들여쓰기");
		
		System.out.println("줄 바꿈");
		System.out.println("\n줄 바꿈");
		
		System.out.println("\'나는 생각한다\'");
		System.out.println("\"고로 존재한다\"");
		System.out.println("\\");
		
	//	변수의 범위
	//	변수는 선언된 블록 내에서만 사용 가능하다

	}

}
