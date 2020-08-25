package com.anant.course;
import java.io.*;
public class Datastream {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		DataInputStream din = new DataInputStream(System.in);
		FileOutputStream fout = new FileOutputStream("xyz1.txt");
		//PrintStream dout = new PrintStream(fout);
		DataOutputStream dout = new DataOutputStream(fout);
		String s = "";
		while(!s.equals("stop"))
		{
			s = din.readLine();
			System.out.println(s);
			dout.writeUTF(s);
			dout.writeByte(10);
			dout.writeChars(s);
			//dout.flush();
		}
		din.close();
		dout.close();
	}

}
