package com.anant.course;

import java.util.Scanner;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number you want in each array");
		int n = s.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		System.out.println("Enter the elements of first array : ");
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("Enter the elements of second array : ");
		for(int i=0;i<n;i++)
		{
			b[i] = s.nextInt();
		}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(a[i] == b[j])
					{
						c[i] = a[i];
					}
				}
			}
		for(int i=0;i<n;i++)
		{
			if(c[i] != 0) {
			System.out.print(c[i]+"  ");
		}
		}
	}

}
