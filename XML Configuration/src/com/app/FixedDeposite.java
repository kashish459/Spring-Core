package com.app;

public class FixedDeposite {
 	private int accountNumber;
 	private String accntHolderName;
 	private float amt,interestRate;
 	private int tenure;
    public void setAccountNumber(int a) {
    	accountNumber=a;
    }
    public int getAccountNumber() {
    	return accountNumber;
    }
	public String getAccntHolderName() {
		return accntHolderName;
	}
	public void setAccntHolderName(String accntHolderName) {
		this.accntHolderName = accntHolderName;
	}
	public float getAmt() {
		return amt;
	}
	public void setAmt(float amt) {
		this.amt = amt;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
    
}
