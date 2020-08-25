package com.anant.reflection;
import java.lang.reflect.*;
public class SampleField {

	public static void PrintFields(Object o)
	{
		Class c = o.getClass();
		Field f[] = c.getFields();
		for (int i = 0; i < f.length; i++) {
			System.out.print(" ");
			Class type = f[i].getType();
			System.out.println(type.getName());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp1 c = new Temp1();
		PrintFields(c);
	}

}
class Temp1
{
	public int x;
	public float f;
	public byte b1;
	public long l;
	public short s;
	public boolean b;
	public char ch;
	double d;
}