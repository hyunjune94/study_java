package com.mydomain.lecture.ch13;

public class BoxingMethodExample {

	public static void main(String[] args) {
//		Box<String> box = new Box<String>();
		
		Box<Integer> box = Util.<Integer>boxing(100);
		box.get();
		
		int rtInt = box.get();
		System.out.println("rtInt: " + rtInt);

	}

}
