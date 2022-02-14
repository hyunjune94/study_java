package com.mydomain.lecture.ch04;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {

		int sum1 = 0;
		int sum2 = 0;
		
//		for(int i=1; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				sum1 += i;
			}			
			else {
				sum2 += i;
			}
		}
		System.out.println("짝수의 합: " + sum1);
		System.out.println("홀수의 합: " + sum2);
		
		
		for(int i=1; i<=10; i++) {			
			for(int j=1; j<=10; j++) {				
				System.out.println(i + "*" + j + "=" + (i*j) );
			}
		}
	}
}

	