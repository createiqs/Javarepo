package com.createiq.arrays;

import java.util.Scanner;

public class Array2DWithScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int rows = 0;
		int colmns = 0;

		System.out.println("enter 2 d array length");
		rows = scanner.nextInt();
		colmns = scanner.nextInt();

		int[][] array2D = new int[rows][colmns];
		System.out.println("\nread inputs from array,");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colmns; j++) {
				System.out.println("Element [" + i + "]" + " [" + j + "]: ");
				array2D[i][j] = scanner.nextInt();
			}
		}

		// print the array
		for (int[] arr1D : array2D) {
			for (int number : arr1D) {
				System.out.print(number + " ");
			}
			System.out.println();
		}

	}

}
