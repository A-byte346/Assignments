package com.anant.course;

public class ThreadAssignment {

	public static void main(String[] args) {

		Thread1 t1 = new Thread1("thread1");
		Thread2 t2 = new Thread2("thread2");
		Thread3 t3 = new Thread3("thread3");
		t1.start();
			try {
				t1.join();
			} catch (Exception e) {
			}
			t2.start();
			try {
				t2.join();
			} catch (Exception e) {
			}
			t3.start();
			try {
				t3.join();
			} catch (Exception e) {
			}
			for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
		System.out.println(Thread.currentThread().getName() + "Dead");

	}

}

class Thread1 extends Thread {
	Thread1(String s) {
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

class Thread3 extends Thread {
	Thread3(String s) {
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

class Thread2 extends Thread {
	Thread2(String s) {
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