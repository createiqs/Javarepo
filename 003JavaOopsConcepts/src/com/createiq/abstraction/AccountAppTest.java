package com.createiq.abstraction;

public class AccountAppTest {

	public static void main(String[] args) {
		Saving saving = new Saving("hdfc12456", "anil", 25000.00);
		System.out.println(saving);

		saving.deposit(12000);
		System.out.println(saving);
		saving.withDraw(37000);
		System.out.println(saving);
		
		saving.deposit(0);
		System.out.println(saving);
		
	}

}
