package com.createiq.arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
//		System.out.println(numbers[2]);
//		System.out.println(numbers[0]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);

		System.out.println(numbers.length);

		// traditional for loop
		for (int i = 1; i <=numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		// enhanced for loop
		for (int number : numbers) {
			System.out.println(number);
		}

		String[] mobileBrands = new String[4];

		mobileBrands[0] = "Apple";
		mobileBrands[1] = "Samsung";
		mobileBrands[2] = "OnePlus";
		mobileBrands[3] = "Xoami";
		System.out.println(mobileBrands[3]);

		for (int i = 0; i < mobileBrands.length; i++) {
			System.out.println(mobileBrands[i]);
		}

		// enhanced for loop

		for (String mobile : mobileBrands) {
			System.out.println(mobile);
		}

	}

}
