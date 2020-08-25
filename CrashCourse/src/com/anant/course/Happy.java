package com.anant.course;

import java.util.Scanner;

public class Happy {
	public static int ishappy(int q)
	{
		int x =0,a=0;		
		while (q > 0) {

			a = q % 10;
			x = x+(a*a);
			q = q / 10;
		}
		return x;
	}
	public static void main(String[] args) {
		
		int result;
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		result = num;

		while(result != 1 && result != 4){  
			result = ishappy(result);  
		} 


		if(result == 1)
		{
			System.out.println("the number is a happy no.");
		}
		else if(result ==4)
		{
			System.out.println("the number is an unhappy no.");
		}


	}
}
