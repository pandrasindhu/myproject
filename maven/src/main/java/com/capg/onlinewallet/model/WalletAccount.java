package com.capg.onlinewallet.model;

import java.util.ArrayList;
import java.util.List;

public class WalletAccount {
	
	long walletId;
	double balance;
	
	public WalletAccount() {
		super();
	}
	public long getWalletId() {
		return walletId;
	}
	public void setWalletId(long walletId) {
		this.walletId = walletId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		
		result = prime * result + (int) (walletId ^ (walletId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WalletAccount other = (WalletAccount) obj;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		
		if (walletId != other.walletId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "WalletAccount [walletId=" + walletId + ", balance=" + balance + "]";
	}
	public WalletAccount(long walletId, double balance) {
		super();
		this.walletId = walletId;
		this.balance = balance;
		
	}
	
	
	

}


