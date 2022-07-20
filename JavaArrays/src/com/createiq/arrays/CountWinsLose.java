package com.createiq.arrays;

public class CountWinsLose {
	public static void main(String[] args) {
		String[] countWinsLose = { "Wins", "Lose", "Wins", "Wins", "Wins", "Lose", "Wins" };
		int wins = 0;
		int loses = 0;
		for (int i = 0; i < countWinsLose.length; i++) {
			if (countWinsLose[i].equals("Wins")) {
				wins++;
			} else {
				loses++;
			}

		}
		System.out.println(wins);
		System.out.println(loses);
	}

}
