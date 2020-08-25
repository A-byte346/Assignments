package com.anant.reflection;
import java.lang.reflect.*;
import java.util.Scanner;
public class ReflectApp {

	static void describeclassorInterface(Class className,String name)
	{
		displayModifiers(className.getModifiers());
		displayFields(className.getDeclaredFields());
		displayMethods(className.getDeclaredMethods());
		if(className.isInterface())
		{
			System.out.println("interface :"+name);
		}
		else {
			System.out.println("class :"+name);
			displayInterfaces(className.getInterfaces());
			displayConstructors(className.getDeclaredConstructors());
		}
	}
	static void displayModifiers(int m)
	{
		System.out.println("modifiers :"+Modifier.toString(m));
	}
	static void displayInterfaces(Class [] interfaces)
	{
		if(interfaces.length>0)
		{
			System.out.println("interfaces :");
			for (int i = 0; i < interfaces.length; i++) {
				System.out.println(interfaces[i].getName());
			}
		}
	}
	static void displayFields(Field[] fields)
	{
		if(fields.length>0)
		{
			System.out.println("fields :");
			for (int i = 0; i < fields.length; i++) {
				System.out.println(fields[i].toString());
			}
		}
	}
	static void displayConstructors(Constructor[] constructors)
	{
		if(constructors.length>0)
		{
			System.out.println("constructors :");
			for (int i = 0; i < constructors.length; i++) {
				System.out.println(constructors[i].toString());
			}
		}
	}
	static void displayMethods(Method[] methods)
	{
		if(methods.length>0)
		{
			System.out.println("Methods :");
			for (int i = 0; i < methods.length; i++) {
				System.out.println(methods[i].toString());
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String parn = s.nextLine();
		Class className = null;
		try {
			className = Class.forName(parn);
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("not a class or interface");
			System.exit(0);
		}
		describeclassorInterface(className, parn);
	}

}
