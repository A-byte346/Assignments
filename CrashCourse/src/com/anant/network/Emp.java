package com.anant.network;

import java.io.*;

public class Emp extends Base implements Serializable {

	public static final long serialVersionUID = 1l;
	transient int a;
	static int b;
	String name;
	int age;
	int salary;
	Emp(String name,int age,int a,int b,int z)
	{
		this.a=a;
		this.age=age;
		this.name=name;
		this.b=b;
		this.z=z;
	}

}
