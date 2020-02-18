package com.capg.onlinewallet.service;

import com.capg.onlinewallet.model.WalletAccount;

public interface WalletAccountService {

	public WalletAccount getAccountInfo(long id);
	
	public boolean addAmount(long id, float amount);
}
