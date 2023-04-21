package com.jsp.controller.account;

import java.util.List;

import com.jsp.dto.Account;
import com.jsp.service.AccountService;

public class GetAllAccounts {

	public static void main(String[] args) {

		AccountService accountService = new AccountService();
		List<Account> accounts = accountService.getAllRecords();

		for (Account account : accounts) {
			System.out.println("===================================================================");
			System.out.println("Account Id      : " + account.getId());
			System.out.println("Account Acc_no  : " + account.getAccount_no());
			System.out.println("Account Isfc    : " + account.getIfsc());
			System.out.println("Account Balance : " + account.getBalance());
		}

	}

}
