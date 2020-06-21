package com.anant.course;

import java.util.Scanner;
public class Min {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            
        }
        int min = a[0];
        for(int j=0;j<a.length;j++)
        {
        	if(a[j] < min)
        	{
        		min = a[j];
        	}
        }
        System.out.println("Minimum element is"+min);
	}
}
