package com.codingdojo.bank;

import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	private static int totalAccounts;
	private static double totalAccountsBalance;
	
	public BankAccount() {
		accountNumber = accountNumberGenerator();
		totalAccounts ++;
		checkingBalance = 0;
		savingsBalance = 0;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		if(this.checkingBalance + checkingBalance > 0) {
			this.checkingBalance += checkingBalance;
			setTotalAccountsBalance(checkingBalance);
		}
		else {
			System.out.println("Insufficient Funds");
		}
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance(double savingsBalance) {
		if (this.checkingBalance + checkingBalance > 0) {
			this.savingsBalance += savingsBalance;
			setTotalAccountsBalance(savingsBalance);
		}
		else {
			System.out.println("Insufficient Funds");
		}
		
	}
	public static int getTotalAccounts() {
		return totalAccounts;
	}
//	public static void setTotalAccounts(int totalAccounts) {
//		BankAccount.totalAccounts = totalAccounts;
//	}
	public static double getTotalAccountsBalance() {
		return totalAccountsBalance;
	}
	public static void setTotalAccountsBalance(double totalAccountsBalance) {
		BankAccount.totalAccountsBalance += totalAccountsBalance;
	}
	
	private String accountNumberGenerator() {
		Random random = new Random();
		long accountNumberGen = (long) (1000000000L + random.nextFloat() * 9000000000L);
//		System.out.println(accountNumberGen);
		accountNumber = String.valueOf(accountNumberGen);
//		System.out.println(accountNumber);
		return accountNumber;
	}
}
