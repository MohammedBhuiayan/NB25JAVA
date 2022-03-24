package com.LearnJava;

public class StaticWord {
	
	static int balance = 0;	
//	int dep;
//	int with;	
	public void deposit(int dep) {
		balance = balance + dep;
		System.out.println(balance);
	}
	public void withdraw(int with) {
		balance = balance - with;
		System.out.println(balance);
	}
	public void bal() {
		System.out.println(balance);
	}
	
	public static void main(String[] args) {
		StaticWord d1 = new StaticWord();
		d1.deposit(700);
		d1.withdraw(300);
		
		StaticWord d2 = new StaticWord();
		d2.bal();
		d2.deposit(600);
		
		StaticWord d3 = new StaticWord();
		d3.withdraw(100);
		
	}

}
