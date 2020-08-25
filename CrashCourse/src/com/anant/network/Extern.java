package com.anant.network;
import java.io.*;


public class Extern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car ca = new car("creata",2021);
		car newcar = null;
		try {
			FileOutputStream fo = new FileOutputStream("temp");
			ObjectOutputStream so = new ObjectOutputStream(fo);
			so.writeObject(ca);
			so.flush();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		try {
			FileInputStream fi = new FileInputStream("temp");
			ObjectInputStream si = new ObjectInputStream(fi);
			newcar = (car)si.readObject();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("original car is");
		System.out.println(ca);
		System.out.println("the new car is");
		System.out.println(newcar);
	}

}
class car implements Externalizable
{
	static int age;
	String name;
	int year;
	
	public car()
	{
		System.out.println("default");
	}
	car(String n,int y)
	{
		name = n;
		year = y;
		age = 10;
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("read external");
		name = (String) in.readObject();
		year = in.readInt();
		age = in.readInt();
		
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("write external");
		out.writeObject(name);
		out.writeInt(year);
		out.writeInt(age);
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("name = "+name+"\n"+"year = "+year+"\n"+"age = "+age);
	}
}
