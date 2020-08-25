package com.anant.course;
import java.io.*;
public class Pipedstream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PipedOutputStream pout = new PipedOutputStream();
		PipedInputStream pin = new PipedInputStream();
		pout.connect(pin);
		pipeout po = new pipeout(pout);
		pipein pi = new pipein(pin);
		Thread t1 = new Thread(po);
		Thread t2 = new Thread(pi);
		t1.start();
		t2.start();
	}

}
class pipeout implements Runnable
{
	PipedOutputStream pout;
	pipeout(PipedOutputStream pout)
	{
		this.pout = pout;
	}
	public void run()
	{
		for(int i=65;i<91;i++)
		{
			try {
				pout.write(i);
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
class pipein implements Runnable
{
	PipedInputStream pin;
	pipein(PipedInputStream pin)
	{
		this.pin = pin;
	}
	public void run()
	{
		int z=0;
		for(int i=65;i<91;i++)
		{
			
			try {
				z = pin.read();
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println((char)z);
		}
	}
}