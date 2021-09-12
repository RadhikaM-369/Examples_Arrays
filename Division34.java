package com.xworks.ExamplesArrays;

public class Division34 {

	public static void main(String[] args) {
		
		System.out.println("List of array elements that are devisible by 3 OR 4 ");
		int Num[]= {20,30,40,50,60,70,80,90,100,111,121,141,200,161,181,55,222,333};		
		
		for(int i=0;i <Num.length;i++)
		{
			if(Num[i] % 3 == 0 || Num[i] % 4 == 0)
			System.out.println(Num[i]);
		}
		
		System.out.println("End of program");

	}

}
