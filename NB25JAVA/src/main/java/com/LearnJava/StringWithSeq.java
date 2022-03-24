package com.LearnJava;

public class StringWithSeq {
	
	public static void revWithSpaceSeq(String x) {
		System.out.println("Input : "+x);
		char[] a = new char[x.length()];
		
		String noSpace = x.replaceAll(" ", ""); //Iamgoing
		int index = noSpace.length()-1;
		System.out.print("Output : ");
		for(int i=0; i<a.length; i++) {
			if(x.charAt(i)!=' ') {
				a[i]=noSpace.charAt(index);
				index = index-1;
				System.out.print(a[i]);
			}
			else {
				a[i]=' ';
				System.out.print(a[i]);
			}
		}		
	}
	
	public static void main(String[] args) {
		StringWithSeq.revWithSpaceSeq("I love java so much that I learnt it.");
	}

}
