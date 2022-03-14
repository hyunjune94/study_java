package com.mydomain.lecture.ch13;

public class ProductExample {

	public static void main(String[] args) {

		Product<String, Integer> product = new Product<>();
		
		product.setKind("벤츠");
		product.setModel(400);
		
		System.out.println("차종: " + product.getKind() + " 모델: " + product.getModel());
//	--------------------------------------------------------
		Product<Tv, String> product2 = new Product<>();
		Tv tv = new Tv();

		product2.setKind(tv);
		product2.setModel("OLED TV");
		
		Tv rtTv = product2.getKind();
		String rtString = product2.getModel();
		
		System.out.println(rtTv + " : " + rtString);
//	--------------------------------------------------------		
		Product<Car, String> product3 = new Product<>();
		Car car = new Car();
		
		product3.setKind(car);
		product3.setModel("GENESIS");
		
		Car rtCar = product3.getKind();
		String rtString2 = product3.getModel();
		
		System.out.println(rtCar + " : " + rtString2);
		System.out.println(product3.getModel());
		System.out.println(product3.getKind());
		
	}

}
