package com.anant.course;
import java.io.File;
public class CreateDeleteRename {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("newFile.txt");
		printfiledetails(file);
		boolean filecreated = file.createNewFile();
		if(!filecreated)
		{
			System.out.println(file+"could not be created");
		}
		printfiledetails(file);
		
		file.delete();
		System.out.println("after deleting the file");
		printfiledetails(file);
		file.createNewFile();
		printfiledetails(file);
		
		file.deleteOnExit();
		System.out.println("after using delete on exit() method");
		printfiledetails(file);
		
		File first = new File("first.txt");
		File second = new File("second.txt");
		filecreated = first.createNewFile();
		if(filecreated || first.exists())
		{
			printfiledetails(first);
			printfiledetails(second);
			
		}
			boolean rename = first.renameTo(second);
		if(!rename)
		{
			System.out.println("could not rename"+first);
		}
		printfiledetails(first);
		printfiledetails(second);
	}
	public static void printfiledetails(File f)
	{
		System.out.println("Absolute path : "+f.getAbsoluteFile());
		System.out.println("file exists : "+f.exists());
	}

}
