package com.anant.course;
import java.io.*;
import java.util.Enumeration;
import java.util.zip.*;
public class UnzipFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ZipFile file = new ZipFile("test.zip");
			Enumeration enu = file.entries();
			while(enu.hasMoreElements())
			{
				ZipEntry entry = (ZipEntry) enu.nextElement();
				String name = entry.getName();
				System.out.println("name "+name);
				InputStream is = file.getInputStream(entry);
				FileOutputStream fos = new FileOutputStream(name);
				int length;
				while((length = is.read())!= -1)
				{
					fos.write(length);
				}
				is.close();
				fos.close();
			}
		file.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
