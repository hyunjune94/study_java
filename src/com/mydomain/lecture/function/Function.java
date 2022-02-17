package com.mydomain.lecture.function;

public class Function {

	public static void main(String[] args) {

		for(int a : allInOne(6, 3)) {
			System.out.println(a);
		}
		
		System.out.println(aaa("강현준", "천재"));	
		
	}

	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	
	public static int[] allInOne(int a, int b) {
		int sum[] = new int[5];
			sum[0] = a+b;
			sum[1] = a-b;
			sum[2] = a*b;
			sum[3] = a/b;
			sum[4] = a%b;
			
			return sum;
	}
	
	// 두 문자열을 합치는 함수
	public static String aaa(String a, String b) {
		
		String ccc = a + b;
		
		return ccc;
	}
	
}
