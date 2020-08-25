package com.anant.course;
import java.io.*;
import java.util.*;
public class Filewriterc {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("abc1.txt");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		char [] ch = s1.toCharArray();
		for(int i=0;i<ch.length;i++)
			fw.write(ch[i]);
		fw.close();
	}

}
