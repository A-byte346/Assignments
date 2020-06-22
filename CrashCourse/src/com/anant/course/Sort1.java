package com.anant.course;

import java.util.Scanner;

public class Sort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no. of elements you want to enter in an array");
		int n = s.nextInt();
		int m = s.nextInt();
		int a [][] = new int[n][m];
		System.out.println("enter all the elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			a[i][j]=s.nextInt();
		}
	}

}
