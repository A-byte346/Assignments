package com.anant.socket;
import java.io.*;
import java.net.*;
import java.util.*;
public class PublicServer {

	ArrayList al = new ArrayList();
	ServerSocket ss;
	Socket s;
	public PublicServer()
	{
		try {
			ss = new ServerSocket(9);
			System.out.println("server started");
			while (true) {
				s = ss.accept();
				System.out.println("client connected");
				al.add(s);
				Runnable r = new MyThread(s,al);
				Thread t = new Thread(r);
				t.start();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PublicServer();
	}

}
class MyThread implements Runnable
{
	Socket s;
	ArrayList al;
	public MyThread(Socket s,ArrayList al) {
		// TODO Auto-generated constructor stub
		this.s = s;
		this.al = al;
	}
		public void run() {
			String s1;
			try {
				DataInputStream din = new DataInputStream(s.getInputStream());
				do {
					s1 = din.readUTF();
					System.out.println(s1);
					if(!s1.equals("bye"))
					{
						tellEveryOne(s1);
					}
					else
					{
						DataOutputStream dout = new DataOutputStream(s.getOutputStream());
						dout.writeUTF(s1);
						dout.flush();
						al.remove(s);
					}
				} while (!s1.equals("bye"));
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		public void tellEveryOne(String s1)
		{
			Iterator i = al.iterator();
			while(i.hasNext())
			{
				try {
					Socket sc = (Socket)i.next();
					DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
					dout.writeUTF(s1);
					dout.flush();
					//System.out.println("client");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	
}





