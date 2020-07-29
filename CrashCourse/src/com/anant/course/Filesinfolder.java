package com.anant.course;
import java.awt.desktop.FilesEvent;
import java.io.File;
public class Filesinfolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\hp\\git\\Assignments\\CrashCourse";
		File file = new File(path);
		if(!file.exists())
		{
				System.out.println(args[0]+"does not exist");
				return;
		}
		tree(path);
	}
	public static void tree(String filename)
	{
		File file = new File(filename);
		if(!file.isDirectory())
		{
			System.out.println(filename);
			return;
		}
		String [] files = file.list();
		for(int i=0;i<files.length;i++)
		{
			tree(filename + "\\" + files[i]);
		}
	}

}
