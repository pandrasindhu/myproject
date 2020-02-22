package com.capg.onlinewallet.service;



import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import com.capg.onlinewallet.dao.WalletAccountDaoImpl;
import com.capg.onlinewallet.model.WalletAccount;
import com.capg.onlinewallet.model.WalletTransaction;

public  class WalletServiceImpl implements WalletAccountService {

	
	WalletAccountDaoImpl walletDao=new WalletAccountDaoImpl();
    

	public WalletTransaction getAccountId(long id,long id2,double amount) {
		WalletTransaction obj=new WalletTransaction();
		// TODO Auto-generated method stub
		Random rand=new Random();
		long x=(long)Math.abs(rand.nextInt());
		obj.setTransactionId(x);
	    LocalDate date=LocalDate.now();
	    obj.setTransactionDate(date);
	    WalletTransaction r=walletDao.getWalletAccountById(id, id2, amount,obj);
	    return r;
	}

	public List print(long id,long id2) {
		return walletDao.print(id, id2);
	}


	
}
