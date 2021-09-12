package com.xworks.ExamplesArrays;

public class SumArrayElements {

	public static void main(String[] args) {
		
		System.out.println("Sum of array elements ");
		int num[]= {2,3,4,5,6,7,8,9,11};		
		int sum=0;
		
		for(int i=0;i < num.length;i++)
		{	
			sum=sum+num[i];	
		}
		System.out.println(sum);
		System.out.println("End of program");

	}

}
