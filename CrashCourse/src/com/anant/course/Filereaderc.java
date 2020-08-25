package com.anant.course;
import java.io.*;
public class Filereaderc {

	public static void main(String [] args) throws IOException
	{
		FileReader fr = new FileReader("abc1.txt");
		int i=0;
		while((i = fr.read())!= -1)
			System.out.print((char)i);
		fr.close();
	}
}
