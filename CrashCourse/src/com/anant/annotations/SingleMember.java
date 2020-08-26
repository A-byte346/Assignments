package com.anant.annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle
{
	int value();
}
public class SingleMember {

	@MySingle(100)
	public static void myMeth()
	{
		SingleMember ob = new SingleMember();
		try {
			Method m = ob.getClass().getMethod("myMeth");
			MySingle anno = m.getAnnotation(MySingle.class);
			Class c = anno.getClass();
			System.out.println(c.getName());
			Class inter[] = c.getInterfaces();
			for (int i = 0; i < inter.length; i++) {
				System.out.println(inter[i].getName());
			}
			Method m1 = c.getMethod("value");
			System.out.println(m1.getName());
			int x = anno.value();
			System.out.println(x);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMeth();
	}

}
