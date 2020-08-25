package com.anant.socket;
import java.io.*;
import java.net.*;
public class Server1 {
	
	ServerSocket ss;
	Socket s;
	DataInputStream din;
	DataOutputStream dout;
	public Server1()
	{
		try {
		System.out.println("server started");
		ss = new ServerSocket(12);
		s = ss.accept();
		System.out.println(s);
		System.out.println("client connected");
		din = new DataInputStream(s.getInputStream());
		dout = new DataOutputStream(s.getOutputStream());
		serverchat1();
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public void serverchat1() throws IOException
	
	{
		String str,s1;
		do {
			str = din.readUTF();
			System.out.println("client message : "+str);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			s1 = br.readLine();
			dout.writeUTF(s1);
			dout.flush();
		} while (!s1.equals("bye"));
	}
	public static void main(String [] args)
	{
		new Server1();
	}
	
}
