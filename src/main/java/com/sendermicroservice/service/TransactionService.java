package com.sendermicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sendermicroservice.entities.Transaction;

@Service
public class TransactionService {

	public ResponseEntity<Transaction> sendTransaction(Transaction t) throws NullPointerException {
		return null;

	}
}

