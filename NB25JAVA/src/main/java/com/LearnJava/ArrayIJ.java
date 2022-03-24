package com.LearnJava;

public class ArrayIJ {

	public static void main(String[] args) {
//		ClassName obj = new ClassName();
		
	
		int[] sales = {10,30,60,70,90,40,30,5,70,60,110,60,40,70,30,70,50,60};
		sales[0]=30;
		sales[30]=40;
		System.out.println(sales.length);
		
		int max = 0;
		int min = sales[0];
		for(int i=0; i<sales.length; i++) {
			if(sales[i]>max) {
				max=sales[i];
			}
			else if(sales[i]<min) {
				min = sales[i];
			}
		}	
		
		System.out.println(max);
		System.out.println(min);

	}

}
