package com.anant.course;
import java.io.File;
public class Deletefolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\test");
		deletefolder(f);
		f.delete();
	}
	public static void deletefolder(File f)
	{
		File [] files = f.listFiles();
		for(File f1  : files)
		{
			if(f1.isDirectory())
			{
				deletefolder(f1);
			}
			f1.delete();
		}
	}

}
