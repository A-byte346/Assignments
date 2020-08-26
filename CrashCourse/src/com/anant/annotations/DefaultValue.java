package com.anant.annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno1 {
	String str() default "Testing";

	int value() default 9000;
}

public class DefaultValue {

	// @MyAnno1()
	@MyAnno1(str = "hello", value = 1000)
	public static void myMeth() {
		DefaultValue ob = new DefaultValue();
		try {
			Class c = ob.getClass();
			Method m = c.getMethod("myMeth");
			MyAnno1 anno = m.getAnnotation(MyAnno1.class);
			System.out.println(anno.str() + " " + anno.value());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMeth();
	}

}
