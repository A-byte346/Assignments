package com.anant.course;
import java.io.*;
public class Rename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File oldfile = new File("second.txt");
		File newfile = new File("empty.txt");
		boolean filerename = oldfile.renameTo(newfile);
		if(filerename)
		{
			System.out.println(oldfile+" renamed to"+newfile);
		}
		else
		{
			System.out.println("renaming"+oldfile+"to"+newfile+"failed");
		}
	}

}
