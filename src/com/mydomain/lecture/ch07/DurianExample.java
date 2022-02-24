package com.mydomain.lecture.ch07;

public class DurianExample {

	public static void main(String[] args) {

		Durian durian = new Durian();
		
		durian.printDurian();
		durian.printCherry();
		durian.printBanana();
		durian.printApple();
		
		System.out.println(durian.getStrApple());
		System.out.println(durian.getStrBanana());
		System.out.println(durian.getStrCherry());
		System.out.println(durian.getStrDurian());

	}

}
