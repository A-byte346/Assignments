package com.anant.annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno
{
	int value();
}
public class FieldAnno {

	@MyAnno(100)
	public int x;
	
	public static void myMeth()
	{
		FieldAnno ob = new FieldAnno();
		try {
			Class c = ob.getClass();
			Field f = c.getField("x");
			MyAnno anno = f.getAnnotation(MyAnno.class);
			System.out.println(anno.value());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMeth();
	}

}
