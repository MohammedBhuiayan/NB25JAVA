package com.LearnJava;

public class HelloJava {
	
	int c;
	
	public void add(int a, int b){
		int x = a + b;
		System.out.println(x);
	}

	private void sub(int a, int b) {
		c = a-b;
		System.out.println(c);
	}
	
	void mul(int a, int b) {
		c = a*b;
		System.out.println(c);
	}
	
	void div(int a, int b) {
		c = a/b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
//		ClassName objectName = new ClassName();
		HelloJava jahan = new HelloJava();
		jahan.add(30, 25);
		jahan.sub(40, 10);
		

	}

}
