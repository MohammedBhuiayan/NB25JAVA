package com.LearnJava;

public class IfElse {
	
	void marks(int m) {
		if(m>=90) {
			System.out.println("A+");
		}
		else if(m>=75) {
			System.out.println("B+");
		}
		else if(m>=60) {
			System.out.println("C+");
		}
		else{
			System.out.println("I am worried...");
		}
	}
	public static void main(String[] args) {
		
		IfElse ie = new IfElse();
		ie.marks(40);

	}

}
