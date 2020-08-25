package com.anant.course;
import java.util.jar.JarFile;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.io.IOException;
public class JarFile1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JarFile jarfile = new JarFile("D:\\Projects\\jaxrs-ri-2.25.1\\jaxrs-ri\\api");
		Enumeration e = jarfile.entries();
		while (e.hasMoreElements()) {
			process(e.nextElement());
			
		}
		jarfile.close();
	}
	public static void process(Object obj)
	{
		JarEntry entry = (JarEntry) obj;
		String name = entry.getName();
		long size = entry.getSize();
		long csize = entry.getCompressedSize();
		System.out.println(name+"\t"+size+"\t"+csize);
	}

}
