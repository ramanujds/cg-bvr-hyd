package com.capg.onlinewallet.model;

import java.time.LocalDate;

public class WalletTransaction {
	long transactionId;
	LocalDate transactionDate;
	public WalletTransaction() {
		// TODO Auto-generated constructor stub
	}
	public WalletTransaction(long transactionId, LocalDate transactionDate) {
		super();
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((transactionDate == null) ? 0 : transactionDate.hashCode());
		result = prime * result + (int) (transactionId ^ (transactionId >>> 32));
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
		WalletTransaction other = (WalletTransaction) obj;
		if (transactionDate == null) {
			if (other.transactionDate != null)
				return false;
		} else if (!transactionDate.equals(other.transactionDate))
			return false;
		if (transactionId != other.transactionId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "WalletTransaction [transactionId=" + transactionId + ", transactionDate=" + transactionDate + "]";
	}
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	
	
}
