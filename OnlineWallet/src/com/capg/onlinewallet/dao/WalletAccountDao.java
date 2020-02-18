package com.capg.onlinewallet.dao;

import javax.swing.text.StyledEditorKit.BoldAction;

import com.capg.onlinewallet.model.WalletAccount;

public interface WalletAccountDao {

	public boolean addWalletAccount(WalletAccount account);
	public WalletAccount getWalletAccountById(long id);
	public boolean updateWalletAccount(WalletAccount account);
	public boolean addAmount(long id,float amount);
	
	
}
