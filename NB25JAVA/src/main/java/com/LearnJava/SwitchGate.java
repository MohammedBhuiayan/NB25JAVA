package com.LearnJava;

public class SwitchGate {

	public static void main(String[] args) {
		int code = 303;
		switch(code) {
			case 101: System.out.println("Study hard...");
			break;
			case 202: System.out.println("Teach well...");
			break;
			case 303: {System.out.println("Work hard...");}
			break;
			default: System.out.println("Get out of here....");
		}
System.out.println("Completed the switch");
	}

}
