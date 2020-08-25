package com.anant.network;
import java.io.*;
public class Myserver {

	ObjectInputStream din;
	public Myserver()
	{
		try {
			din = new ObjectInputStream(new  FileInputStream("test1"));
			Emp z = (Emp)din.readObject();
			System.out.println("name "+z.name);
			System.out.println("age "+z.age);
			System.out.println("a "+z.a);
			System.out.println("b "+z.b);
			System.out.println("z "+z.z);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Myserver();
	}

}
