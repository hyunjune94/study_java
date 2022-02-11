package com.mydomain.lecture.ch04;

public class SwitchExample {

	public static void main(String[] args) {

		
		int num1 = (int) (Math.random() * (6 - 1 + 1) + 1);
		int num2 = (int) (Math.random() * (6 - 1 + 1) + 1);
		int num3 = num1 + num2;
		
		switch (num1) {		
			case 1:
				System.out.println("첫번째 주사위는 1번입니다");
				break;
			case 2:
				System.out.println("첫번째 주사위는 2번입니다");
				break;
			case 3:
				System.out.println("첫번째 주사위는 3번입니다");
				break;
			case 4:
				System.out.println("첫번째 주사위는 4번입니다");
				break;
			case 5:
				System.out.println("첫번째 주사위는 5번입니다");
				break;
			case 6:
				System.out.println("첫번째 주사위는 6번입니다");
				break;
			default:
				System.out.println("0");
				break;
		}
		
		switch (num2) {		
			case 1:
				System.out.println("두번째 주사위는 1번입니다");
				break;
			case 2:
				System.out.println("두번째 주사위는 2번입니다");
				break;
			case 3:
				System.out.println("두번째 주사위는 3번입니다");
				break;
			case 4:
				System.out.println("두번째 주사위는 4번입니다");
				break;
			case 5:
				System.out.println("두번째 주사위는 5번입니다");
				break;
			case 6:
				System.out.println("두번째 주사위는 6번입니다");
				break;
			default:
				System.out.println("0");
				break;
		}		
		
		System.out.println("두 수의 합은 " + num3 +"입니다");

	}

}
