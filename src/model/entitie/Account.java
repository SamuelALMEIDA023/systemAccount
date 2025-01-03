package model.entitie;

import model.exception.DomainAccount;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void deposit(Double amount) {
		if(amount > this.balance) {
			throw new DomainAccount("Not enough balance");
		}
		
		this.balance += amount;
	}
	
	public void withdraw(Double amount) {
		if(amount > this.withdrawLimit) {
			throw new DomainAccount("The amount exceeds withdraw limit");
		}
		
		this.balance -= amount;
		
		System.out.println("New balance: "+ this.balance);
	}
	
}
