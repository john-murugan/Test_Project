package com.test.practice01;

import com.test.practice.Practice_A;

public class Practice_01 extends Practice_A {
	
	public static void method_01() {
		long a = method_B();
		System.out.println(a);
	}
	
	public static void method_02(int s) {
	
		System.out.println(s);
	}
	public static void method_02(byte s) {
		System.out.println(s);
	}
	@Override
	public void method_D() {
		System.out.println("Overrided method_D in child class");
		
	}
	
	public static void pyramid() {
		
		System.out.println("Pyramid");
	}
	
	public static void main(String[] args) {
	
		method_01();
		method_02(2123423427);
		method_02(982342342);
		Practice_01 pr = new Practice_01();
		pr.method_D();
		pyramid();
	
	}
	

}
