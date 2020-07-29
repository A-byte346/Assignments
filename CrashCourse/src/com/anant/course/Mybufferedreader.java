package com.anant.course;
import java.io.*;
public class Mybufferedreader {

	public static void main(String []args)throws IOException
	{
		FileReader fr = new FileReader("line.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = "";	
		while(s!= null)
		{
			s = br.readLine();
			if(s!=null)
				System.out.println(s);
		}
		br.close();
	}
}