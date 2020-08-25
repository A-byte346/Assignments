package com.anant.course;

import java.util.Scanner;

public class SortDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no. of elements you want to enter in an array");
		int n = s.nextInt();
		int a [] = new int[n];
		System.out.println("enter all the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			for(int k=0;k<n;k++)
			{
				if(a[j] > a[k]) {
				temp = a[j];
				a[j] = a[k];
				a[k] = temp;
				}
			}
			
		}
		for(int y=0;y<n-1;y++)
		{
			System.out.print(a[y]+",");
		}
		System.out.println(a[n-1]);
	}
	}


