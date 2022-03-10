package com.mydomain.lecture.ch08;

public interface MyInterface {
	void method1();		//public abstract
//	void method2();		//MyClassA, MyClassB에 override해야함
	
	default void method2() {
		System.out.println("MyInterface-Method2 실행");
	}
}
