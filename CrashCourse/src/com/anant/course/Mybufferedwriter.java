package com.anant.course;
import java.io.*;
public class Mybufferedwriter {

	public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		FileWriter fw = new FileWriter("line.txt");
		//BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(fw);
		String s ="";
		while(!s.equals("stop")) {
			s = br.readLine();
			pw.println(s);
		}
		br.close();
		fw.close();
	}

}
