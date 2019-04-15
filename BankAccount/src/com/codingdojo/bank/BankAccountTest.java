package com.codingdojo.bank;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount();
		BankAccount c = new BankAccount();
//		b.accountNumberGenerator();
		System.out.println(b.getAccountNumber());
//		System.out.println(BankAccount.totalAccounts);
		System.out.println(b.getCheckingBalance());
		b.setCheckingBalance(100);
		System.out.println(b.getCheckingBalance());
		System.out.println(BankAccount.getTotalAccounts());
		
		
		System.out.println(BankAccount.getTotalAccountsBalance());
		c.setCheckingBalance(50);
		System.out.println(BankAccount.getTotalAccountsBalance());
	}

}
