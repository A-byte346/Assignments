package com.anant.course;

public class Bounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer inums[] = {1,2,3,4,5};
		stats<Integer> iob = new stats<>(inums);
		double v = iob.Average();
		System.out.println(v);
		Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
		stats<Double> dob = new stats<>(dnums);
		double w = dob.Average();
		System.out.println(w);
	}

}
class stats<T extends Number>
{
	T[] nums;
	public stats(T[] o) {
		// TODO Auto-generated constructor stub
	nums = o;
	}
	double Average()
	{
		double sum  = 0.0;
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i].doubleValue();
		}
			return sum / nums.length;
	}
}
