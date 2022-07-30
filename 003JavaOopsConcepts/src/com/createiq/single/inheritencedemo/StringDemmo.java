package com.createiq.single.inheritencedemo;

public class StringDemmo {
	public static void main(String[] args) {
		String s1 = "anil";
		String s2 = "ANIL";
		String s3 = "anil";
		String s4 = new String("anil");

		System.out.println(s1.equals(s3));// true
		System.out.println(s1 == s2);// false
		System.out.println(s1 == s3); // true
		System.out.println(s1.equals(s4));// false
		s4=s4.intern();
		System.out.println(s1 == s4);// false
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.compareToIgnoreCase(s2));
//		System.out.println(s1.equals(s2)); // true
//		System.out.println(s1.equalsIgnoreCase(s2));
		String name="createiq";
		name= name.concat(" technologeis");
		System.out.println(name.length());
		System.out.println(name.charAt(4));
		System.out.println(name.toUpperCase());
	}

}
