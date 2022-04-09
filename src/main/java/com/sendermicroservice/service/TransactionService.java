package com.sendermicroservice.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sendermicroservice.encryption.EncryptObject;
import com.sendermicroservice.entities.Transaction;

@Service
public class TransactionService {

	private RestTemplate restTemplate = new RestTemplate();

	public ResponseEntity<Transaction> sendTransaction(Transaction t) throws NullPointerException {

		if (t.getAccountNumber() == null || t.getAccountNumber().isEmpty() || t.getAccountFrom().isEmpty()
				|| t.getAmount().isEmpty() || t.getcurrency().isEmpty() || t.getType().isEmpty()) {
			throw new NullPointerException("no field should be empty");
		}

		t.setAccountNumber(EncryptObject.encrypt(t.getAccountNumber()));
		t.setAccountFrom(EncryptObject.encrypt(t.getAccountFrom()));
		t.setAmount(EncryptObject.encrypt(t.getAmount()));
		t.setcurrency(EncryptObject.encrypt(t.getcurrency()));
		t.setType(EncryptObject.encrypt(t.getType()));

		System.out.println("Sender Obj" + t.toString());
		String receiverURL = "localhost:9002/receiverTransactions/receiver";
		return restTemplate.postForEntity(receiverURL, t, Transaction.class);
	}
}

