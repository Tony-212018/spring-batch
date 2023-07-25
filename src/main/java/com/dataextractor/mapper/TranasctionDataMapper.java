package com.dataextractor.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;

import com.dataextractor.model.Transaction;

public class TranasctionDataMapper implements FieldSetMapper<Transaction> {
	public Transaction mapFieldSet(FieldSet fieldSet) {
		Transaction transaction = new Transaction();
		String line=fieldSet.readString(0);

		transaction.setTransactionDate(line.substring(0, 1));
		transaction.setTransactionType(line.substring(1, 4));
		transaction.setTransactionAmt(line.substring(4, 8));
		transaction.setAuthorizationNmbr(line.substring(8));
		return transaction;
	}
}