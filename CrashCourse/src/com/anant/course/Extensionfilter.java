package com.anant.course;
import java.io.*;
public class Extensionfilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirname = "C:\\Users\\hp\\git\\Assignments\\CrashCourse\\src\\com\\anant\\course";
		File f1 = new File(dirname);
		FilenameFilter only = new ExtensionfilterR("java");
		String s [] = f1.list(only);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

}
class ExtensionfilterR implements FilenameFilter
{
	String ext;
	//int i = 1;
	public ExtensionfilterR(String ext)
	{
		this.ext = "."+ext;
	}
	public boolean accept(File dir,String name)
	{
		System.out.println("accept");
		return name.endsWith(ext);
	}
}