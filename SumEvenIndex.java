package com.xworks.ExamplesArrays;

public class SumEvenIndex {

	public static void main(String[] args) {
		int num[]= {2,3,4,5,6,7,8,9,10};		
		int sum=0;
		
		for(int i=0;i < num.length;i++)
		{	
			if(i%2==0)
		
			sum=sum+num[i];	
		}
		System.out.println("Sum of even numbers in array: "+sum);
		System.out.println("End of program");
	}

}
