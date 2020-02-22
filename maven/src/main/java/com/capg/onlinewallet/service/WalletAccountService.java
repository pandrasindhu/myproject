package com.capg.onlinewallet.service;


import java.util.List;

import com.capg.onlinewallet.model.WalletAccount;
import com.capg.onlinewallet.model.WalletTransaction;

public interface WalletAccountService {

public WalletTransaction getAccountId(long id,long id2,double amount);
public List print(long id,long id2);
	
	
	

}
