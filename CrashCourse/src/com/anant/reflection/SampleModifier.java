package com.anant.reflection;

import java.lang.reflect.*;
public class SampleModifier {

	public static void PrintModifier(Object o) throws Exception
	{
		Class c = o.getClass();
		//Class c = Class.forName("java.awt.Graphics");
		int m = c.getModifiers();
		if(Modifier.isPublic(m))
			System.out.println("public");
		if (Modifier.isFinal(m)) {
			System.out.println("final");
		}
		if (Modifier.isAbstract(m)) {
			System.out.println("abstract");
		}
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String a = new String("aa");
		PrintModifier(a);
	}

}
