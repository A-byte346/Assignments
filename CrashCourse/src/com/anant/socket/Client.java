package com.anant.socket;

import java.io.*;
import java.net.*;

public class Client {

	Socket s;
	DataInputStream din;
	DataOutputStream dout;

	public Client() {
		try {
			// s = new Socket("192.168.1.225",10);
			s = new Socket("Localhost", 10);
			System.out.println(s);
			din = new DataInputStream(s.getInputStream());
			dout = new DataOutputStream(s.getOutputStream());
			clientchat();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	public void clientchat() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1;
		do {
			s1 = br.readLine();
			dout.writeUTF(s1);
			dout.flush();
			System.out.println("server Message : " + din.readUTF());
		} while (!s1.equals("bye"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Client();

	}

}
