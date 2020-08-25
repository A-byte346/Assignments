package com.anant.course;
import java.io.File;
public class AllDriveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File [] roots = File.listRoots();
		long l = 1024*1024*1024;
		for(int i=0;i<roots.length;i++)
		{
			System.out.println(roots[i]);
			System.out.println("free Space : "+roots[i].getFreeSpace()/l);
			System.out.println("usable space : "+roots[i].getUsableSpace()/l);
			System.out.println("total space : "+roots[i].getTotalSpace()/l);
			System.out.println();
		}
	}

}
