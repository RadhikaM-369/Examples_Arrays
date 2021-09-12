package com.xworks.ExamplesArrays;

public class EvenIndexValue {

	public static void main(String[] args) {
		
		System.out.println("Displaying even index value of array");
		int issueNumber[]= {20,30,40,50,60,70,80,90,100,111,121,131,141,151,161,171,181,191,222,333};		
		
		for(int i=0;i <issueNumber.length;i++)
		{
			if(i % 2 == 0)
			System.out.println("Index value is "+i+" contains element "+issueNumber[i]);
		}
		
		System.out.println("End of program");
	}

}
