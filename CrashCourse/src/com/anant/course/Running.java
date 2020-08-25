package com.anant.course;

public class Running {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime rt = Runtime.getRuntime();
		try {
			rt.exec("notepad.exe");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("hello");
		}
	}

}
