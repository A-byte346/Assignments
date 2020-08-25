package com.anant.network;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Myclient {
ObjectOutputStream dout;
public Myclient()
{
	try {
		Emp e1 = new Emp("anant", 20, 5,10, 15);
		dout = new ObjectOutputStream(new FileOutputStream("test1"));
		dout.writeObject(e1);
		dout.flush();
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Myclient();
	}

}
