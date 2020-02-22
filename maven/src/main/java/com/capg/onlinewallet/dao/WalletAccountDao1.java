package com.capg.onlinewallet.dao;

import java.util.List;

import com.capg.onlinewallet.model.WalletAccount;
import com.capg.onlinewallet.model.WalletTransaction;

public interface WalletAccountDao1 {

 public WalletTransaction getWalletAccountById(long id,long id2,double amount,WalletTransaction ts);
 public List print(long id,long id2);
	
}
