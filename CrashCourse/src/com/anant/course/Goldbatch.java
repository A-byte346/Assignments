package com.anant.course;

import java.util.Scanner;

public class Goldbatch {

	public static boolean isPrime(int n){
        int f = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                f++;
        }
        if(f == 2)
            return true;
        return false;
    }
public static void main(String[] args) {
	// TODO Auto-generated method stub
	int n,p=3,q=0;
	Scanner s = new Scanner(System.in);
	n = s.nextInt();
	  if(n % 2 != 0){
            System.out.println("Invalid input. Number is odd.");
            return;
        }
        else if(n < 4 || n > 49){
            System.out.println("Invalid input. Number is out of range.");
            return;
        }
        System.out.println("Prime pairs are:");
        while(p < n){
            q = n - p;
            if(isPrime(p) && isPrime(q) && p <= q)
                System.out.println(p + ", " + q);
            p += 2;
        }
    }

}
