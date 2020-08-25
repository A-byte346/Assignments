package com.anant.reflection;
import java.lang.reflect.*;
import java.io.*;
public class SampleInterface {

	public static void PrintInterface(Object o)
	{
		Class c = o.getClass();
		Class inter[] = c.getInterfaces();
		for (int i = 0; i < inter.length; i++) {
			
			if (inter[i].getName().equals("java.io.Serializable")) {
				System.out.println("Serializable is my parent interface");
			}
			System.out.println(inter[i].getName());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t t1 = new t();
		PrintInterface(t1);
	}

}
interface a1
{
	
}
interface a2{}
interface a3{}
class t implements a1,a2,a3,Serializable
{
	
}