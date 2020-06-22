package com.anant.course;

import java.util.Scanner;

public class Buzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int n = s.nextInt();
		if(n%10 == 7)
		{
			System.out.println("the number is a buzz number");
		}
		else if(n%7 == 0)
		{
			System.out.println("the number is a buzz number");
		}
		else
		{
			System.out.println("the number is not a buzz number");
		}
	}

}
