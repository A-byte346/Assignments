package com.anant.course;

public class GenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n[] = {1,2,3,4,5};
		Gen<Integer> iob = new Gen<>(50, n);
		Gen<?> gens[] = new Gen<?>[2];
		gens[0] = new Gen<Integer>(10, n);
		System.out.println(gens[0].ob);
		gens[1] = new Gen<Float>(2.3f,new Float[] {1.2f,2.2f});
		System.out.println(gens[1].ob);
		for (int i = 0; i < gens[0].values.length; i++) {
			System.out.println(gens[0].values[i]);
		}
		for (int i = 0; i < gens[1].values.length; i++) {
			System.out.println(gens[1].values[i]);
		}
	}

}
class Gen<T extends Number>
{
	T ob;
	T values[];
	public Gen(T ob, T [] nums) {
		// TODO Auto-generated constructor stub
	this.ob = ob;
	values = nums;
	}
}