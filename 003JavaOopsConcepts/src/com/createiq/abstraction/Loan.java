package com.createiq.abstraction;

public class Loan extends Account implements Taxible {

	private static double INCOME_TAX = 0.12;
	private static double OVERDRAFT_AMOUNT = 3000.00;

	public Loan(String accountNo, String name, double amount) {
		super(accountNo, name, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tax(double income) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public double withDraw(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
