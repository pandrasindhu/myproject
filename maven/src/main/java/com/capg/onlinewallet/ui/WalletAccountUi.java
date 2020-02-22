package com.capg.onlinewallet.ui;

import java.util.List;
import java.util.Scanner;

import com.capg.onlinewallet.model.WalletAccount;
import com.capg.onlinewallet.model.WalletTransaction;
import com.capg.onlinewallet.service.WalletAccountService;
import com.capg.onlinewallet.service.WalletServiceImpl;
//import com.capg.onlinewallet.service.WalletAccountServiceImpl;


public class WalletAccountUi {

	static WalletAccountService walletService=new WalletServiceImpl();
	static Scanner in= new Scanner(System.in);
	public static void main(String[] args) {
		for(;;) {
		int choice;       
		System.out.println("Enter your choice : ");
		System.out.println("1 - transction");
        System.out.println("2 - Exit");
		
		choice=in.nextInt();
		switch (choice) {
		case 1:
			getAccountId();
			break;
		case 2:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		
		}
		
	}

	private static void getAccountId() {
		WalletAccount account=new WalletAccount();
		
		System.out.println("Enter my wallet id :");
		long id=in.nextLong();
		System.out.println("Enter client wallet id :");
		long id2=in.nextLong();
		System.out.println("enter amount");
		double amount=in.nextDouble();
		WalletTransaction tran=walletService.getAccountId(id,id2,amount);
		//WalletTransaction tran1=walletService.getAccountId(id,id2,amount);
		List lst=walletService.print(id, id2);
		System.out.println("Amount Credited to "+id2);
		System.out.println(lst.get(1));
		System.out.println("Amount Debited From "+id);
		System.out.println(lst.get(0));
		
		
		System.out.println(tran);
	//	System.out.println(tran1);
		
	}
	
	

}
