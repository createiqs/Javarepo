package com.createiq.arrays;

public class Array2DDemo {

	public static void main(String[] args) {
		int[][] array2D = new int[2][2];
		array2D[0][0] = 1;
		array2D[0][1] = 2;
		array2D[1][0] = 3;
		array2D[1][1] = 4;

		// iterate array in two ways
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				System.out.print(array2D[i][j] + ",");
			}
			System.out.println();
		}

		// enhanced for loop

		System.out.println("---------------------");
		for (int[] one1D : array2D) {
			for (int number : one1D) {
				System.out.print(number + " ");
			}
			System.out.println();

		}

		System.out.println("---------------------");
		
		
		// dynamic initialization of 2d array
		int[][] arr2D = { { 1, 2 }, { 3, 4 } };
		for (int[] arr1D : arr2D) {
			for (int number : arr1D) {
				System.out.print(number + " ");
			}
			System.out.println();
		}

	}

}
