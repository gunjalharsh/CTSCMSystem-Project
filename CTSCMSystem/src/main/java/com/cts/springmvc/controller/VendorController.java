package com.cts.springmvc.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.springmvc.entity.Customer;
import com.cts.springmvc.entity.Vendor;
import com.cts.springmvc.service.impl.CustomerServiceImpl;
import com.cts.springmvc.service.impl.VendorServiceImpl;

@Controller
public class VendorController {

	
	@Autowired
	private	VendorServiceImpl vendorService1;
	
    private CustomerServiceImpl customerService2;
	
	

	@RequestMapping(value = "vendorlogin", method = RequestMethod.GET)
	public ModelAndView viewLogin(@ModelAttribute Vendor vendor) {
		return new ModelAndView("VendorLogin");//login.jsp
	}


	@RequestMapping(value = "vendorlogin", method = RequestMethod.POST)
	public ModelAndView processLogin(@Validated @ModelAttribute Vendor vendor, BindingResult br) 
	{   if(br.hasErrors())  
    {  
		return new ModelAndView("VendorLogin");//login.jsp
    }
	else
	{
		boolean vend = vendorService1.checkVendorLogin(vendor.getUsername(),vendor.getPassword());
		ModelAndView model = null;
		if (vend) 
		{
			
			model = new ModelAndView("loginVendorSuccess");//loginsuccess.jsp
			//model.addObject("vend", vendor.getUsername());//access in jsp
			
		} else {
			model = new ModelAndView("VendorLogin");//login.jsp
			//model.addObject("result", "Invalid Username or Password!!");
		}
		return model;
	}
	}
	
	@RequestMapping(value = "view1", method = RequestMethod.GET)
	public String view(@ModelAttribute Customer customer1,Model m)
	{
		List<Customer> obj=customerService2.getcust();
		m.addAttribute("cust",obj);
			return "ViewCust";//ViewCust.jsp
	}
}
