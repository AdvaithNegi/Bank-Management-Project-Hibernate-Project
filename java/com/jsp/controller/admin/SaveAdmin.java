package com.jsp.controller.admin;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

public class SaveAdmin {

	public static void main(String[] args) {

		Admin admin = new Admin();
		admin.setName("Advaith");
		admin.setEmail("advaith@mail.com");
		admin.setPassword("advaith123");

		AdminService adminService = new AdminService();
		Admin admin2 = adminService.saveAdmin(admin);
		if (admin2 != null)
			System.out.println("Admin " + admin2.getName() + " Added");
	}
}
