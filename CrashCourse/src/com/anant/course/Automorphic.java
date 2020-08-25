package com.anant.course;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = n*n;
		
		if(n%10 != m%10)
		{
			System.out.println("false");
		}
		else {
			System.out.println("true");
		}
		n = n/10;
		m = m/10;
		}
	
	}

