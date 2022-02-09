package com.mydomain.lecture.ch03;

public class IncreaseDecreaseOperatorExample2 {

	public static void main(String[] args) {
		
	//	++x; : 피연산자를 1증가 시키고 다른 연산 수행
	//	x++; : 다른 연산 수행 후 피연산자가 1 증가
		
		int x = 10;
		int y = 10;
		int a = 0;
		int b = 0;
		
		++x;
		System.out.println(x);
		
		y++;
		System.out.println(y);
		
		a = ++x;	// x:12
					// x:12		
		b = x++;	// x:12
					// x:13		
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		
	}

}
