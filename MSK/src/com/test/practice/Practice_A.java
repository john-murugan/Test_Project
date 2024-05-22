package com.test.practice;

public abstract class Practice_A {

	public static void method_A() {
		byte a = 2;
		short b = 4;
		int c = 3;
		
		System.out.println("Method A sum = "+a+b+c);
	}
	public static long method_B() {
		int x = 123;
		short y = 456;
		long z = 789;
		
		long t = x+y+z;
		return t;
	}
	public static void method_C() {
		int x = 123;
		short y = 456;
		long z = 789;
		
		long t = x+y+z;
	}
	public abstract void method_D();
	
	public static void main(String[] args) {
		
		method_A();
		method_B();
//		method_C();
		
		System.out.println("Result of method_B 't' value = "+method_B());
		System.out.println("Run successfully");
	}

}
