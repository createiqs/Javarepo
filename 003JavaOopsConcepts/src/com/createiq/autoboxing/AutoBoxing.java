package com.createiq.autoboxing;

public class AutoBoxing {
	public static void main(String[] args) {
		int a = 10;
//		 converting primitive to object
//		Integer i=new Integer(a);
//	System.out.println(Integer.valueOf(a));
		// autoboxing
//		System.out.println(i);

		// unboxing
		double amount = Double.valueOf(10000.00);
		System.out.println(amount);

		String num = "12345";
		int i = Integer.parseInt(num);
		System.out.println(i);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}

}
