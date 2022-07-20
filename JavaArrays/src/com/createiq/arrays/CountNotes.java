package com.createiq.arrays;

public class CountNotes {

	public static void main(String[] args) {
		int amount = 55260;
		int notes[] = { 2000, 500, 200, 100, 50, 20, 10 };

		int copy = amount;
		int totalNotes = 0, count = 0;

		System.out.println("\nRs OMINATIONS : \n");

		for (int i = 0; i < notes.length; i++) {
			// counting number of notes.
			count = amount / notes[i];
			if (count != 0) {
				System.out.println(notes[i] + "\tx\t" + count + "\t= " + notes[i] * count);
			}
			totalNotes = totalNotes + count;
			amount = amount % notes[i];
		}

		System.out.println("--------------------------------");

		// printing the total amount
		System.out.println("TOTAL\t\t\t= " + copy);
		System.out.println("--------------------------------");

		// printing the total number of notes
		System.out.println("Total Number of Notes\t= " + totalNotes);

	}

}
