package com.mydomain.lecture.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
	//	&& = & : 둘다 참이일때만 참	
	//	|| = | : 둘중 하나만 참이면 참
		int charCode = 'A';
		System.out.println("charCode: " + charCode);
		
		if( (charCode>=65) & (charCode<=90)) {
			System.out.println("대문자 이군요");			
		}
		
		if( (charCode>=97) && (charCode<=122)) {
			System.out.println("소문자 이군요");			
		}
		
		if( !(charCode<48) && !(charCode>57)) {
			System.out.println("0~9 이군요");			
		}
		
		if( (charCode>=65) | (charCode<=90)) {
			System.out.println("대문자 이군요");			
		}
		
		if( (charCode>=97) || (charCode<=122)) {
			System.out.println("소문자 이군요");			
		}
		
		if( !(charCode<48) || !(charCode>57)) {
			System.out.println("0~9 이군요");			
		}
		
		int value = 6;
		if( (value%2==0) || (value%3 ==0)) {
			System.out.println("2 또는 3의 배수");			
		}
		if( (value%2==0) || (value%3==0) ) {
			System.out.println("2 또는 3의 배수");				
		}
	}

}
