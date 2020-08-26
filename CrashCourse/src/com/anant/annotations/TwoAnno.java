package com.anant.annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface MyAmmo
{
	String str();
	int value();
}
@Retention(RetentionPolicy.RUNTIME)
@interface what{
	String desc();
}
@what(desc = "An Annotation test class")
@MyAmmo(str = "class ",value = 99)
public class TwoAnno {

	@what(desc = "An Annotation test method")
	@MyAmmo(str="method",value = 100)
	public static void myMeth()
	{
		TwoAnno ob = new TwoAnno();
		try {
			Annotation annos[] = ob.getClass().getAnnotations();
			MyAmmo mn = ob.getClass().getAnnotation(MyAmmo.class);
			System.out.println(mn.str());
			System.out.println(mn.value());
			System.out.println("All annotations for the class are:");
			for (int i = 0; i < annos.length; i++) {
				System.out.println(annos[i]);
				
			}
			System.out.println();
			MyAmmo mn1 = ob.getClass().getMethod("myMeth").getAnnotation(MyAmmo.class);
			System.out.println(mn1.str());
			System.out.println(mn1.value());
			Method m = ob.getClass().getMethod("myMeth");
			annos = m.getAnnotations();
			System.out.println("All annotaions for the method are:");
			for (int i = 0; i < annos.length; i++) {
				System.out.println(annos[i]);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMeth();
	}

}
