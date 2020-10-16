package com.lti.model;

import java.time.LocalDate;

public class Transaction {
    int transactionId;
    LocalDate transaction;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public LocalDate getTransaction() {
		return transaction;
	}
	public void setTransaction(LocalDate transaction) {
		this.transaction = transaction;
	}
}
