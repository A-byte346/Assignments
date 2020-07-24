package com.anant.course;

public class Yieldmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread mt = new Mythread();
		//mt.setDaemon(true);
		mt.start();
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Thread.yield();
		System.out.println("main");
	}

}
class Mythread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("counting "+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}