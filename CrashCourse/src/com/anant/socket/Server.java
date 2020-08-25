package com.anant.socket;
import java.io.*;
import java.net.*;
public class Server {

	ServerSocket ss;
	Socket s;
	DataInputStream din;
	DataOutputStream dout;
	public Server()
	{
		try {
			System.out.println("server started");
			ss = new ServerSocket(11);
			s = ss.accept();
			System.out.println("client connected");
			din = new DataInputStream(s.getInputStream());
			dout = new DataOutputStream(s.getOutputStream());
			serverchat();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public void serverchat() throws IOException
	{
		String str;
		do {
			str = din.readUTF();
			System.out.println("client message : "+str);
			dout.writeUTF("hello"+str);
			dout.flush();
		} while (!str.equals("bye"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Server();
	}

}
