package com.createiq.string.methods;

public class StringClassDemo {
	// immutable class

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. litteral creation
		String s1 = "anil"; // 01234567
		String s2 = "anil";
		String s3 = "ramu";
		String s4 = new String("anil");
		System.out.println(s4.hashCode());

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));

		System.out.println(s1 == s2);
//		System.out.println(s1==s3);
		System.out.println(s1 == s4);
		s4 = s4.intern();
		System.out.println(s1 == s4);

//		String s5 = " hello ";
//		System.out.println(s5.trim());
//
//		String[] splits = s5.split(s5);
//		for (String s : splits) {
//			System.out.println(s);
//		}

//		System.out.println(s1.isEmpty());
//		System.out.println(s1.length());
//
//		char[] ch = s1.toCharArray();
//		for (char c : ch) {
//			System.out.println(c);
//		}

//		System.out.println(s1.toUpperCase());
//
//		System.out.println(s1);
//		System.out.println(s1.toLowerCase());

//		System.out.println(s1.isEmpty());
//		if(s1.isEmpty()) {
//			System.out.println("given string is blank");
//		}else{
//			System.out.println(s1);
//		}

//		String  fruits= "mango, banana , apple ";
//		String [] fruitsof=fruits.split(fruits);
//		for(String fruit: fruitsof) {
//			System.out.println(fruit);
//		}
		String input = "hello"; //01234
		for (int i = 0; i < input.length(); i++) {
			System.out.print(input.charAt(i)+" ");
		}
		System.out.println();
		
		for(int i=input.length()-1; i>=0; i--) {
			System.out.print(input.charAt(i)+" ");
		}

	}

}
