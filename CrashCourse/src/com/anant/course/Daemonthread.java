package com.anant.course;

public class Daemonthread {

	public static void main(String[] args) {
		Thread4 t4 = new Thread4("thread4");
		Thread6 t6 = new Thread6("thread6");
		Thread5 t5 = new Thread5("thread5");
		t4.setDaemon(true);
		t6.setDaemon(true);
		t5.setDaemon(true);
		t4.start();
		t6.start();
		t5.start();
		for(int i=0;i<20;i++)
		{
			System.out.println(Thread.currentThread().getName());
			System.out.println("tata");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
		System.out.println(Thread.currentThread().getName()+"dead");
	}

}
class Thread4 extends Thread {
	Thread4(String s) {
		super(s);
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println(getName() + "Dead");
	}
}

class Thread5 extends Thread {
	Thread5(String s) {
		super(s);
	}

	public void run() {
		for (int i = 0; i < 15; i++) {

			System.out.println(getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println(getName() + "Dead");
	}
}

class Thread6 extends Thread {
	Thread6(String s) {
		super(s);
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println(getName() + "Dead");
	}
}