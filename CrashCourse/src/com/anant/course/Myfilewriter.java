package com.anant.course;

import java.io.*;
import java.util.Scanner;

public class Myfilewriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fw = new FileOutputStream("abc.txt", true);
		FileInputStream fin = new FileInputStream("abc.txt");
		DataInputStream din = new DataInputStream(fin);

		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine(); 
		byte ch[] = s.getBytes();
		fw.write(ch);

		System.out.println("file created Successfully");
		System.out.println("data from file");

		String line;
		while ((line = din.readLine()) != null)
			System.out.println(line);

		fw.close();
		fin.close();
	}

}
