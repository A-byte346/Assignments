package com.anant.reflection;
import java.awt.*;
import java.lang.reflect.*;
public class SampleSuper {

	public static void PrintSuperClass(Object o)
	{
		Class subclass = o.getClass();
		Class superclass = subclass.getSuperclass();
		while(superclass!=null)
		{
			System.out.println(superclass.getName());
			subclass = superclass;
			superclass = subclass.getSuperclass();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("ab");
	PrintSuperClass(f);	
	}

}
