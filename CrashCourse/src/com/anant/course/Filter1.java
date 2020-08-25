package com.anant.course;

import java.io.File;
import java.io.FileFilter;

public class Filter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirpath = "C:\\Users\\hp\\git\\Assignments\\CrashCourse\\src\\com\\anant\\course";
		File dir = new File(dirpath);
		Myfilter filter = new Myfilter();
		File [] list = dir.listFiles(filter);
		for (int i = 0; i < list.length; i++) {
			if(list[i].isFile())
			{
				System.out.println(list[i].getPath()+"  (file)  ");
			}
			else if(list[i].isDirectory())
			{
				System.out.println(list[i].getPath()+"  (directory)  ");
			}
		}
	}

}
class Myfilter implements FileFilter
{
	public boolean accept(File f)
	{
		if(f.isFile() || f.isDirectory())
		{
			String filename = f.getName().toLowerCase();
			if(filename.endsWith(".java"))
			{
				return true;
			}
		}
		return false;
	}
}