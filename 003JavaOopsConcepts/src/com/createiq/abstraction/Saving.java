package com.createiq.abstraction;

public class Saving extends Account {

//	private double balance;

	public Saving(String accountNo, String name, double amount) {
		super(accountNo, name, amount);

	}

	@Override
	public void deposit(double amount) {
		if (amount < 0.0) {
			System.out.println("Please deposit minimum aomount of 500");
		} else {
			super.setAmount(super.getAmount() + amount);
		}

	}

	@Override
	public double withDraw(double amount) {
		if (amount < 0) {
			System.out.println(" insufficient funds.......");
		} else if (super.getAmount() > amount) {
			System.out.println(" please maintain minimum balance..");
		}
		super.setAmount(super.getAmount() - amount);

		return amount;
	}

//	@Override
//	public String toString() {
//		return "Saving []";
//	}

}
