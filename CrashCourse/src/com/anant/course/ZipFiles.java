package com.anant.course;
import java.io.*;
import java.util.jar.JarEntry;
import java.util.zip.*;
public class ZipFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("test.zip");
			ZipOutputStream zos = new ZipOutputStream(fos);
			String file1 = "abc.txt";
			String file2 = "abc1.txt";
			String file3 = "xyz.txt";
			String file4 = "xyz1.txt";
			String file5 = "line.txt";
			String file6 = "empty.txt";
			addToZipFile(file1, zos);
			addToZipFile(file2, zos);
			addToZipFile(file3, zos);
			addToZipFile(file4, zos);
			addToZipFile(file5, zos);
			addToZipFile(file6, zos);
			zos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		e.printStackTrace();
		}
	}
	public static void addToZipFile(String filename , ZipOutputStream zos) throws IOException,FileNotFoundException
	{
		System.out.println("writing :"+filename+" to zip file");
		FileInputStream fin = new FileInputStream(filename);
		ZipEntry entry = new ZipEntry(filename);
		zos.putNextEntry(entry);
		byte[] b = new byte[fin.available()];
		fin.read(b);
		zos.write(b);
		zos.closeEntry();
		fin.close();
	}

}
