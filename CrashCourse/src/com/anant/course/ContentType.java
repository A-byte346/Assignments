package com.anant.course;
import java.io.IOException;
import java.nio.file.*;
public class ContentType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path p = Paths.get("abc.java");
		Path p1 = Paths.get("abc.xml");
		try {
			String a = Files.probeContentType(p);
			String b = Files.probeContentType(p1);
			System.out.println("content types are \n 1. "+a+" 2. "+b);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
