package com.LearnJava;

public class ExceptionInJava {
	
	// 1.Checked - Compile time - Needs to be corrected before execution
	// 2.Uchecked - Run time - When execute the code. Java will exit the application
	public void exceptionCheck(int a, int b) {
		System.out.println("I am running");		
		int c;
		try {
		c = a/b;
		System.out.println(c);
		}
		catch(ArithmeticException s) {
			System.out.println("Exception has been taken care of");
		}
		finally {
			System.out.println("I am the finally block......");
		}
		
		System.out.println("Still I am running");
	}
	public static void main(String[] args) {
		ExceptionInJava obj = new ExceptionInJava();
		obj.exceptionCheck(0, 0);
	}
	
}
