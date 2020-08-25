package com.anant.course;
import java.io.*;
public class ListAllfiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirpath = "C:\\Users\\hp\\git\\Assignments\\CrashCourse";
		File dir = new File(dirpath);
		File [] list = dir.listFiles();
		for (int i = 0; i < list.length; i++) {
			if(list[i].isFile())
			{
				System.out.println(list[i].getPath()+"  {file)  ");
			}
			else if(list[i].isDirectory())
			{
				System.out.println(list[i].getPath()+"  (directory)  ");
			}
		}
	}

}
