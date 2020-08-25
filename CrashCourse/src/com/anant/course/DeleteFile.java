package com.anant.course;
import java.io.IOException;
import java.nio.file.*;

public class DeleteFile {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Path p = Paths.get("D:\\Projects\\Anant1");
		try {
			Files.delete(p);
			//boolean b = Files.deleteIfExists(p);
			//System.out.println(p+" = "+b);
			System.out.println(p+" deleted successfuly");
		} catch (NoSuchFileException e) {
			// TODO: handle exception
			System.out.println(p+" file does not exists");
		}catch (DirectoryNotEmptyException e) {
			// TODO: handle exception
			System.out.println("directory "+p+" is not empty");
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
