package com.anant.course;

import java.util.Scanner;

public class MatrixMult {
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
		int b[][] = new int[3][3];
		System.out.println("Enter the elements of second matrix :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j] = s.nextInt();
			}
		}
		int c[][] = new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j] = a[i][j]*b[i][j];
			}
			
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(c[i][j]+"  ");
			}
			System.out.print("\n");
		}
	}
}
