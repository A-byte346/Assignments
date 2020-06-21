package com.anant.course;

public class Pattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for(int i=0;i<5;i++) { for(int j=0;j<5;j++) { System.out.print("*"); }
		 * System.out.print("\n"); }
		 */
		/*
		 * for(int i=0;i<5;i++) { for(int j=0;j<5;j++) { System.out.print(j+1); }
		 * System.out.print("\n"); }
		 */
		/*
		 * for(int i=0;i<5;i++) { for(int j=0;j<5;j++) { System.out.print(i+1); }
		 * System.out.print("\n"); }
		 */
		/*
		 * int count = 1; for(int i=0;i<5;i++) { for(int j=0;j<5;j++) {
		 * System.out.print(count++); } System.out.print("\n"); }
		 */
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j % 2 == 0)
				{
					System.out.print("1");
				}
				else 
				{
					System.out.print("0");
				}
			}
			System.out.print("\n");
		}
	}
}
