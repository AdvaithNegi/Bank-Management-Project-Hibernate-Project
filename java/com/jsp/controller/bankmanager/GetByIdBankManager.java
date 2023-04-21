package com.jsp.controller.bankmanager;

import com.jsp.dto.BankManager;
import com.jsp.service.BankManagerService;

public class GetByIdBankManager {

	public static void main(String[] args) {

		BankManagerService bankManagerService = new BankManagerService();
		BankManager bankManager = bankManagerService.getByIdBankManager(3);

		System.out.println("BankManager ID       : " + bankManager.getId());
		System.out.println("BankManager Name     : " + bankManager.getName());
		System.out.println("BankManager Email    : " + bankManager.getEmail());
		System.out.println("BankManager Password : " + bankManager.getPassword());
		System.out.println("BankManager Status   : " + bankManager.getStatus());

	}

}
