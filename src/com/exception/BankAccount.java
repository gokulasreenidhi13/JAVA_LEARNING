package com.exception;

public class BankAccount {


	    double balance = 5000;

	    public void withdraw(double amount) throws InsufficientBalanceException {

	        if (amount > balance) {
	            throw new InsufficientBalanceException(
	                "Insufficient Balance"+balance);
	        }

	        balance -= amount;
	        System.out.println("Withdrawal Successful");
	      }
	}

