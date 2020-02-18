package com.capg.onlinewallet.ui;

import java.util.Scanner;

import com.capg.onlinewallet.model.WalletAccount;
import com.capg.onlinewallet.service.WalletAccountService;
import com.capg.onlinewallet.service.WalletAccountServiceImpl;

public class WalletAccountUi {

	static WalletAccountService walletService=new WalletAccountServiceImpl();
	static Scanner in= new Scanner(System.in);
	public static void main(String[] args) {
		for(;;) {
		int choice;
		System.out.println("Enter your choice : ");
		System.out.println("1 - Get Account Info");
		System.out.println("2 - Add Amount");
		System.out.println("3 - Exit");
		
		choice=in.nextInt();
		switch (choice) {
		case 1:
			getAccountInfo();
			break;
		case 2:
			addAmount();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		
		}
		
	}

	private static void addAmount() {
		
		System.out.println("Enter wallet id :");
		long id=in.nextLong();
		System.out.println("Enter Amount ");
		float amount=in.nextFloat();
		if(walletService.addAmount(id, amount)) {
			System.out.println("Amount added Successfully");
		}
		
	}

	private static void getAccountInfo() {
		System.out.println("Enter wallet id :");
		long id=in.nextLong();
		WalletAccount acc=walletService.getAccountInfo(id);
		System.out.println(acc);
		
	}
}
