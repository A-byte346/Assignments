package com.anant.course;

public class Threadgroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup tg = new ThreadGroup("aa");
		Thread11 t1 = new Thread11();
		Thread t2 = new Thread(tg, t1, "thread2");
		Thread t3 = new Thread(tg, t1, "thread3");
		Thread t4 = new Thread(tg, t1, "thread4");
		t2.start();
		t3.start();
		t4.start();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(Thread.currentThread().getName());
		tg.stop();
	}

}
class Thread11 implements Runnable
{
	public void run()
	{
		for(int i=0;i<15;i++)
		{
			System.out.println(Thread.currentThread().getName()); 
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}