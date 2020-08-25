package com.anant.socket;

import java.io.*;
import java.net.*;

public class PublicClient {

	Socket s;
	DataInputStream din;
	DataOutputStream dout;

	public PublicClient() {
		// TODO Auto-generated constructor stub
		try {
			s = new Socket("Localhost", 9);
			din = new DataInputStream(s.getInputStream());
			dout = new DataOutputStream(s.getOutputStream());
			publiclientchat();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void publiclientchat() throws IOException {
		My m = new My(din);
		Thread t1 = new Thread(m);
		t1.start();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1;
		do {
			s1 = br.readLine();
			dout.writeUTF(s1);
			dout.flush();
		} while (!s1.equals("bye"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PublicClient();
	}

}

class My implements Runnable {
	DataInputStream din;

	My(DataInputStream din) {
		this.din = din;

	}

	public void run() {
		String s2 = "";
		do {
			try {
				s2 = din.readUTF();
				System.out.println(s2);
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (!s2.equals("bye"));
	}
}