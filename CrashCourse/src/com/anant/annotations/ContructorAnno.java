package com.anant.annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnoc{
	int value();
}
public class ContructorAnno {

	@MyAnnoc(value = 200)
	public ContructorAnno(int x) {
		// TODO Auto-generated constructor stub
	}
	@MyAnnoc(value = 100)
	public ContructorAnno() {
		// TODO Auto-generated constructor stub
	}
	public static void read() {
		try {
			Class c =  ContructorAnno.class;
			Constructor c1 = c.getDeclaredConstructor();
			Constructor c2 = c.getDeclaredConstructor(int.class);
			MyAnnoc anno = (MyAnnoc)c1.getAnnotation(MyAnnoc.class);
			MyAnnoc anno1 = (MyAnnoc)c2.getAnnotation(MyAnnoc.class);
			System.out.println(anno.value());
			System.out.println(anno1.value());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	read();
	}

}
