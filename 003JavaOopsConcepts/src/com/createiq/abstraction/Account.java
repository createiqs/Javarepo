package com.createiq.abstraction;

public abstract class Account {

	private String accountNo;
	private String name;
	private double amount;

	public Account(String accountNo, String name, double amount) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.amount = amount;
	}

	public abstract void deposit(double amount);

	public abstract double withDraw(double amount);

	public String toString() {
		return "[" + "account number: " + accountNo + " name: " + name + " balance: " + amount + "]";
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
