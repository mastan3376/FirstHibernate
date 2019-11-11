package com.fh.test;

import com.fh.dao.CustomerDao;
import com.fh.entity.Customer;

public class CTest {
	public static void main(String[] args) {
		CustomerDao customerDao = new CustomerDao();
		Customer customer = new Customer();
		customer.setCustomerNo(2);
		customer.setCustomerName("mastan");
		customer.setAge(24);
		customer.setGender("male");
		customer.setMobileNo("9959571417");
		customer.setEmailAddress("mastanvali1607@gmail.com");
		customerDao.saveCustomer(customer);
	}
}
