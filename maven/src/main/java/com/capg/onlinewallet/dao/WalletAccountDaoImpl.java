package com.capg.onlinewallet.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.capg.onlinewallet.model.WalletAccount;
import com.capg.onlinewallet.model.WalletTransaction;

//

public class WalletAccountDaoImpl implements WalletAccountDao1 {
	
	Map<Long, WalletTransaction> wallettrans=new HashMap<Long, WalletTransaction>();
	Map<Long, WalletAccount> walletAccounts=new HashMap<Long, WalletAccount>();   
	
	public WalletAccountDaoImpl() {
		addSomeWalletAccount();
	}
	public void addSomeWalletAccount() {

	
		
		WalletAccount ac1=new WalletAccount(100101102103L,2000);
		WalletAccount ac2=new WalletAccount(100101102104L,3000);
	 	WalletAccount ac3=new WalletAccount(100101102105L,4000);
		

		walletAccounts.put(ac1.getWalletId(), ac1);
		walletAccounts.put(ac2.getWalletId(), ac2);
		walletAccounts.put(ac3.getWalletId(), ac3);
		
	}                               


	

	public WalletTransaction getWalletAccountById(long id,long id2,double amount,WalletTransaction ts) {
		    
		   // WalletTransaction trans=new WalletTransaction();
		    
		    
		    WalletAccount acc=walletAccounts.get(id);   //minus
			WalletAccount acc1=walletAccounts.get(id2); //add
			try {
			if(amount>acc.getBalance()) {
				throw new Exception("Insufficient Funds in your Account");
		    }
		 
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			
			if(acc!=null || acc1!=null) {
				acc1.setBalance(acc1.getBalance()+amount);
			    acc.setBalance(acc.getBalance()-amount);
			    
		}
			return ts;
	}
	
	 public List print(long id,long id2) {
		  List<Double> list=new ArrayList<Double>();
		  WalletAccount a1=walletAccounts.get(id);
		  WalletAccount a2=walletAccounts.get(id2);
		  list.add(a1.getBalance());
		  list.add(a2.getBalance());
		 
		 return list;
	 }
	
	
	
}
			class InsufficientException extends Exception{
				InsufficientException(String msg){
				super(msg);
			}
			}

	
		
		
	


