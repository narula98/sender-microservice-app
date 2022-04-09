package com.sendermicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sendermicroservice.entities.Transaction;
import com.sendermicroservice.service.TransactionService;

@RestController
@RequestMapping("/transactions")

public class TransactionController {

	@Autowired
	private TransactionService transactionService;
	
	@PostMapping(path="/sender")
	public ResponseEntity<?> encryptTransactionObject(@RequestBody Transaction transactionObj) {
		System.out.println("In sender controller");
		try {
			return transactionService.sendTransaction(transactionObj);	
		}
		catch(Exception e) {
			return new ResponseEntity<String>(e.getLocalizedMessage(), new ResponseEntity<>(HttpStatus.BAD_REQUEST).getStatusCode());			
		}
		 
	}
}