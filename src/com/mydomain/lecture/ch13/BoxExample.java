package com.mydomain.lecture.ch13;

public class BoxExample {

	public static void main(String[] args) {

		Box<String> box = new Box<String>();
		box.set("강현준");
		String str = box.get();
		System.out.println("str: " + str);

		Box<Integer> box2 = new Box<Integer>();
		box2.set(11);
		int number = box2.get();
		System.out.println("number: " + number);
	}

}
