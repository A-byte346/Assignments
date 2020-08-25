package com.anant.course;

import java.util.Scanner;

public class Max1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        m = s.nextInt();
        int a[][] = new int[n][m];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
        	for(int k=0;k<m;k++)
            a[i][k] = s.nextInt();
            
        }
        int max = a[0][0];
        for(int j=0;j<n;j++)
        {
        	for(int y=0;y<m;y++)
        	if(a[j][y] > max)
        	{
        		max = a[j][y];
        	}
        }
        System.out.println("Maximum number is "+max);
	}

}
