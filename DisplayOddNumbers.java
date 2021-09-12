package com.xworks.ExamplesArrays;

public class DisplayOddNumbers {

	public static void main(String[] args) {
		System.out.println("Displaying odd numbers in array");
		int issueNumber[]= {110,123,154,167,178,176,198,177,197,111,222,200,303,404,505,606,707,808,909,999};
		
		for(int i=0;i < issueNumber.length;i++)
		{
			
			if(issueNumber[i]%2 != 0)
			{ System.out.println(issueNumber[i]);
		}
		}
		System.out.println("End of program");

	}

}
