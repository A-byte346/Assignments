package com.anant.course;

public class SimpleGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc<Integer> iob = new abc<>(98);
		iob.showtypes();
		int v = iob.getob();
		System.out.println("value :"+v);
		System.out.println();
		abc<String> strob = new abc<>("hello");
		strob.showtypes();
		String str = strob.getob();
		System.out.println("value :"+str);
		Emp e1 = new Emp();
		abc<Emp> eob = new abc<>(e1);
		eob.showtypes();
		Emp e2 = eob.getob();
		System.out.println("value :"+e2.x);
	}

}
class Emp{
	int x = 200;
}
class abc<T>
{
	T ob;
	public abc(T o) {
		// TODO Auto-generated constructor stub
	ob = o;
	}
	T getob()
	{
		return ob;
	}
	void showtypes()
	{
		Class c = ob.getClass();
		System.out.println("type of t is : "+c.getName());
	}
}