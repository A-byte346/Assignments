package com.anant.course;

import java.util.Scanner;

public class StringAssignment {

	static int charcount(String s) 
	{
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				count++;
			}
		}
		return count;
	}

	static int spacecount(String s) 
	{
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}

	static int wordcount(String s)
	{
		String[] a = s.split(" ");
		int count = a.length;
		return count;

	}

	static String Stringreverse(String s)
	{
		String g = "";
		String[] a = s.split("");

		String[] b = new String[a.length];
		for (int i =0; i < a.length; i++) {
			b[i] = a[a.length-i-1];
		}
		for(int i=0;i<b.length;i++)
		{
			g = g+b[i];
		}
		return g;
	}

	static String Ltrim(String s)
	{
		String g = new String();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				break;
			}
			else {
				count++;
			}
			
		}
		count++;
			String [] a = s.split(" ",count);
			for(int j=0;j<a.length;j++)
			{
				g = g+a[j];
			}
			return g;
		
	}
	static String Rtrim(String s)
	{
		String[] a = s.split("");

		String[] b = new String[a.length];
		for (int i =0; i < a.length; i++) {
			b[i] = a[a.length-i-1];
		}
		String g = new String();
		int count=0;
		for(int i=0;i<b.length;i++)
		{
			if(s.charAt(i)!=' ')
			{
				break;
			}
			else {
				count++;
			}
			
		}
		count++;
			String [] c = s.split(" ",count);
			for(int j=0;j<c.length;j++)
			{
				g = g+c[j];
			}
			return g;
	}
	static String Alltrim(String s)
	{
		String g = new String();
		String[] a = s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			g = g+a[i];
		}
		return g;
	}
	static int Vowelcount(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			{
				count++;
			}
		}
		return count;
		
	}
	static boolean pallindrome(String s)
	{
		int i=0,j = s.length()-1;
		while(i<j)
		{
			if(s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	static int length(String s)
	{
		int count=0;
		for(char ch : s.toCharArray())
		{
			count++;
		}
		return count;
	}
	static int frequency(String s)
	{
		int count = 0;
		System.out.println("Enter the word you want count the frequency");
		Scanner scanner = new Scanner(System.in);
		char ch  = scanner.next().charAt(0);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)== ch)
			{
				count++;
			}
		}
		return count;
	}
	static String changecase(String s)
	{
		System.out.println("Enter 1 for change to Lowercase : ");
		System.out.println("Enter 2 for change to uppercase : ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String g = "";
		if(a == 1) {
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(65<=ch && ch <= 90)
			{
				ch = (char)((ch + 32));
				g = g+ch;
			}
			else
			{
				g = g+ch;
			}
		}
		}
		else if(a==2) {
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(97 <=ch && ch <= 122)
			{
				ch = (char)((ch - 32));
				g = g+ch;
			}
			else
			{
				g = g+ch;
			}
		}
		}
		return g;
	}
	static boolean equals(String s1,String s2)
	{
		
		char ch1[] = s1.trim().toCharArray();
		char ch2[] = s2.trim().toCharArray();
		char ch3 [] = new char[ch1.length];
		int a = ch1.length;
		int b = ch2.length;
		if(a!=b)
		{
			return false;
		}
		else
		{
			for(int i=0;i<Math.min(a, b);i++)
			{
				if(ch1[i] == ch2[i])
				{
					ch3[i] = ch1[i];
				}
			}
		}
		if(ch3.length!=a && ch3.length!=b)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	static void Triangle1(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=0; j<=i;j++)
			{
				System.out.print(s.charAt(j));
		}
			System.out.print("\n");
		}
		
	}
	static void Triangle2(String s)
	{
		int a = s.length();
		for(int i=a;i>=0;i--)
		{
			for(int j=0; j<i ; j++)
			{
				System.out.print(s.charAt(j));
				
		}
			System.out.print("\n");
		}
		
	}
	static void Triangle3(String s)
	{
		int a = s.length();
		for(int i=0;i<a;i++)
		{
			for(int j=i; j<a ; j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.print("\n");
			for(int k=0;k<=i;k++)
			{
				System.out.print("  ");
			}
			
		}
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringAssignment sa = new StringAssignment();
		System.out.println("Enter a string");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		/*
		 * System.out.println("Enter a string"); String str1 = scanner.nextLine();
		 * boolean a = equals(str,str1);
		 */

	}

}
