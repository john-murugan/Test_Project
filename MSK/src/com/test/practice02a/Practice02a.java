package com.test.practice02a;

public class Practice02a {
	
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
		Practice02a prac = new Practice02a();
		prac.method1();
		method2();
		prac.method3();
		

	}

}
