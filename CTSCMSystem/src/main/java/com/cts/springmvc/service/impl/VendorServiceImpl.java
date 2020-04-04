package com.cts.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.springmvc.dao.impl.CustomerDAOImpl;
import com.cts.springmvc.dao.impl.VendorDAOImpl;
import com.cts.springmvc.entity.Customer;

@Service   //get from @repository and connects to @controller
@Transactional  //database transaction
public class VendorServiceImpl {
	@Autowired
	private VendorDAOImpl vendorDAO1;
	private CustomerDAOImpl customerDAO1;
	
	@Transactional
	public List<Customer> getcust() 
	{
		
		return customerDAO1.getCustomer();
	}

	
public boolean checkVendorLogin(String userName, String userPassword) {
		
		System.out.println("In service class... Check Login");
		
		return vendorDAO1.checkVendorLogin(userName, userPassword);
	}
	
}
