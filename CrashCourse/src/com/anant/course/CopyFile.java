package com.anant.course;
import java.nio.file.*;
import java.io.IOException;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;

public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path source = Paths.get("D:\\Projects\\Anant1");
		Path target = Paths.get("D:\\Projects\\Anant2");
		try {
			Path p = Files.copy(source, target, REPLACE_EXISTING,COPY_ATTRIBUTES);
			System.out.println(source+"has been copied to "+p);
		} catch (FileAlreadyExistsException e) {
			// TODO: handle exception
			System.out.println(target+"already exists:");
		}catch (DirectoryNotEmptyException e) {
			// TODO: handle exception
			System.out.println(target+"is not empty");
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
