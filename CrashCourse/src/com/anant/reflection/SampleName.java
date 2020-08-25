package com.anant.reflection;
//import java.lang.reflect.*;
import java.awt.*;

public class SampleName {

	public static void PrintName(Object o)
	{
		Class c = o.getClass();
		System.out.println(c.getName());
		
	}
	public static void PrintName(String s)
	{
		try {
			Class c = Class.forName(s);
			System.out.println(c.getName());
			StringBuffer sb = (StringBuffer)c.newInstance();
			System.out.println(sb.length());
			System.out.println(sb.capacity());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public static void PrintName1(String s)
	{
		try {
			Class c = Class.forName(s);
			System.out.println(c.getName());
			Temp sb = (Temp) c.newInstance();
			sb.show();
		} catch (Exception e) {
			// TODO: handle exception
		System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button b = new Button("aa");
		PrintName(b);
		PrintName("java.lang.StringBuffer");
		PrintName1("Temp");
		Class c = java.lang.Thread.class;
		System.out.println(c.getName());
	}

}
class Temp
{
	public Temp() {
		// TODO Auto-generated constructor stub
	System.out.println("default constructor");
	}
	void show()
	{
		System.out.println("creating object via reflection");
	}
}








