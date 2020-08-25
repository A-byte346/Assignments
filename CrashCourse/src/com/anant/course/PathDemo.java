package com.anant.course;
import java.nio.file.*;
public class PathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path p1 = Paths.get("D:\\Projects\\course\\menuswingp\\graphics");
		printdetails(p1);
	}
	public static void printdetails(Path p)
	{
		System.out.println("details foe path : "+p);
		int count = p.getNameCount();
		System.out.println("name count : "+count);
		for (int i = 0; i < count; i++) {
			Path name = p.getName(i);
			System.out.println("name at index : "+i+" is "+name);
		}
		Path parent = p.getParent();
		Path root = p.getRoot();
		Path filename = p.getFileName();
		System.out.println("parent : "+parent+" ,root : "+root+" ,filename : "+filename);
		System.out.println("absolute path : "+p.isAbsolute());
	}

}
