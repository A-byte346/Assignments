package com.anant.course;

import java.util.Scanner;

public class TriangleAmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a[][] = new int[3][3];
		System.out.println("Enter the elements of first matrix :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		int count = a[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i<=j && count < a[i][j])
				{
					count = a[i][j];
				}
			}
			
		}
		System.out.println("Max number in upper triangle  is : "+count);
	}

}
