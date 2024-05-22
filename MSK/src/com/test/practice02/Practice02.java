package com.test.practice02;

public class Practice02 {
	
	private void method1() {
		System.out.println("Print method 1");
	}
	public static void method2() {
		System.out.println("Print method 2");
	}
	protected void method3() {
		System.out.println("Print method 3");
	}
	public static void main(String[] args) {
		Practice02 prac = new Practice02();
		prac.method1();
		method2();
		prac.method3();
		

	}

}
