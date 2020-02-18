package com.capg.onlinewallet.service;

import com.capg.onlinewallet.dao.WalletAccountDao;
import com.capg.onlinewallet.dao.WalletAccountDaoImpl;
import com.capg.onlinewallet.model.WalletAccount;

public class WalletAccountServiceImpl implements WalletAccountService {

	
	WalletAccountDao walletDao=new WalletAccountDaoImpl();
	@Override
	public WalletAccount getAccountInfo(long id) {
		return walletDao.getWalletAccountById(id);
	}

	@Override
	public boolean addAmount(long id, float amount) {
		return walletDao.addAmount(id, amount);
	}

}
