package com.anant.course;

public class Pattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * for(int i=0;i<5;i++) { for(int j=0;j<5;j++) { System.out.print("*"); }
		 * System.out.print("\n"); }
		 * 
		 * 
		 * for(int i=0;i<5;i++) { for(int j=0;j<5;j++) { System.out.print(j+1); }
		 * System.out.print("\n"); }
		 * 
		 * 
		 * for(int i=0;i<5;i++) { for(int j=0;j<5;j++) { System.out.print(i+1); }
		 * System.out.print("\n"); }
		 * 
		 * 
		 * int count = 1; for(int i=0;i<5;i++) { for(int j=0;j<5;j++) {
		 * System.out.print(count++); } System.out.print("\n"); }
		 * 
		 * 
		 * for(int i=0;i<5;i++) { for(int j=0;j<5;j++) { if(j % 2 == 0) {
		 * System.out.print("1"); } else { System.out.print("0"); } }
		 * System.out.print("\n"); }
		 * 
		 * 
		 * for(int i=0;i<5;i++) { for(int j=0;j<5;j++) { if(i % 2 == 0) {
		 * System.out.print("1"); } else { System.out.print("0"); } }
		 * System.out.print("\n"); }
		 * 
		 * 
		 * 
		 * for(int i=0;i<5;i++) {
		 * 
		 * for(char j='A';j<='E';j++) { System.out.print(j); } System.out.print("\n"); }
		 * 
		 * 
		 * 
		 * for (int i = 1; i <= 5; i++) { for (int j = 0; j < 5; j++) { if (i % 2 == 0)
		 * { System.out.print(i); } else { System.out.print("*"); } }
		 * System.out.print("\n"); }
		 * 
		 * 
		 * 
		 * for (int i = 0; i < 5; i++) { for (int j = 5; j >0 ; j--) {
		 * System.out.print(j);
		 * 
		 * } System.out.print("\n"); }
		 */
		 
		/*
		 * for (int i = 0; i < 5; i++) { for (int j = i+1; j <= i+5 ; j++) {
		 * System.out.print(j);
		 * 
		 * } System.out.print("\n"); }
		 */
		
		
		/*
		 * for (int i = 5; i < 10; i++) { for (int j = i; j > i - 5; j--) {
		 * System.out.print(j);
		 * 
		 * } System.out.print("\n"); }
		 */
		 
		 
		/*
		 * for (int i = 0; i < 5; i++) { for (int j = 0; j < 5 ; j++) { if(i%2 !=0 &&
		 * j%2 ==0) { System.out.print("0"); } else if(i%2 ==0 && j%2 !=0) {
		 * System.out.print("0"); } else { System.out.print("1"); } }
		 * System.out.print("\n"); }
		 */
		for (char i = 'A'; i <= 'E'; i++) {

			for (char j = i; j < i+5; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
		
	}		
}
