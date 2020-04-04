package com.cts.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.springmvc.dao.impl.CustomerDAOImpl;
import com.cts.springmvc.entity.Customer;

//SERVICE IS THE MIDDLE LAYER
@Service   //get from @repository and connects to @controller
@Transactional  //database transaction
public class CustomerServiceImpl {
	

	@Autowired
	private CustomerDAOImpl customerDAO1;
	
	public void createCustomer(Customer customer) 
	{
	
		
		customerDAO1.createCustomer(customer);
		
	
		
	}
	
	@Transactional
	public List<Customer> getcust() 
	{
		
		return customerDAO1.getCustomer();
	}

	@Transactional
	public void deletecust(long theId)
	{
		customerDAO1.deleteCust(theId);
	}

	public boolean checkLogin(String userName, String userPassword) {
		
		System.out.println("In service class... Check Login");
		return customerDAO1.checkLogin(userName, userPassword);
	}
	
	//search
	
/*	@Transactional
	public List<Customer>GetCustomerByName(String userName)
	{
		
		return customerDAO1.GetCustomerByName(userName);
	}      

	@Transactional
	public void searchcust(String userName)
	{
		customerDAO1.searchCust(userName);
	}
*/
}
