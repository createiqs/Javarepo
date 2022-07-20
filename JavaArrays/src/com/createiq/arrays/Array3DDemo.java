package com.createiq.arrays;

public class Array3DDemo {

	public static void main(String[] args) {

		int[][][] array3D = { { { 1, 2 } }, { { 3, 4 } }, { { 5, 6 } } };

		for (int[][] arr2D : array3D) {

			for (int[] arr1D : arr2D) {
				for (int n : arr1D) {
					System.out.print(n + " ");
				}
				System.out.println();
			}
		}

	}

}
