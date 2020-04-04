package com.cts.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.springmvc.entity.Customer;
import com.cts.springmvc.service.impl.CustomerServiceImpl;

@Controller
public class CustomerController {
	

	@Autowired
	private CustomerServiceImpl customerService1;
	@RequestMapping("callproj")
	public String createUser1(Model m) 
	{	
		//employee attribute==modelattribute in register.jsp
		m.addAttribute("customer",new Customer());
		return "register";//register.jsp==form action=register
	}
	//insertion
/*	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String createUser(@ModelAttribute Customer customer1,Model m)
	{
		customerService1.createCustomer(customer1);
		// return "redirect:/view"; //redirect to request pattern::view
		return "login";
	     }    */
	
	//insertion
		@RequestMapping(value = "register", method = RequestMethod.POST)
		public String createUser( @Validated @ModelAttribute Customer customer1,BindingResult br, Model m)
		{
			if(br.hasErrors())  
	        {  
	            return "register";  
	        } else { 
			customerService1.createCustomer(customer1);
			// return "redirect:/view"; //redirect to request pattern::view
			return "login";
		     }
		}    
	
	 	//selection
	/*@RequestMapping(value = "view", method = RequestMethod.GET)
	public String view(@ModelAttribute Customer customer1,Model m)
	{
		List<Customer> obj=customerService1.getcust();
		m.addAttribute("cust",obj);//emps can beaccessin ViewEmp.jsp
			return "ViewCust";//ViewEmp.jsp
	}
/*	//deletion
    @RequestMapping(value="/deletecust/{delno}",method = RequestMethod.GET)    
    public String delcust(
    		@PathVariable 
    		int delno)
    {    
    	customerService1.deletecust(delno);
        return "redirect:/view"; //call req pattern /view
    } 
*/
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ModelAndView viewLogin(@ModelAttribute Customer customer) {
		return new ModelAndView("login");//login.jsp
	}


	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView processLogin(@ModelAttribute Customer customer) 
	{
		boolean cust = customerService1.checkLogin(customer.getUsername(),customer.getPassword());
		ModelAndView model = null;
		if (cust) 
		{
			model = new ModelAndView("loginCustomerSuccess");//loginsuccess.jsp
			model.addObject("cust", customer.getUsername());//access in jsp
			
		} else {
			model = new ModelAndView("loginCustomerError");//login.jsp
			//model.addObject("result", "Invalid Username or Password!!");
		}
		return model;
	}
	
	@RequestMapping("/details")    
    
    		public String view1(@ModelAttribute Customer customer1,Model m)
    {    
        return "redirect:/view"; //call req pattern /view
    } 
	
	
	
	@RequestMapping(value = "view", method = RequestMethod.GET)
	public String view(@ModelAttribute Customer customer1,Model m)
	{
		List<Customer> obj=customerService1.getcust();
		m.addAttribute("cust",obj);
			return "ViewCust";//ViewEmp.jsp
	}
	
	//deletion
    @RequestMapping(value="/deletecust/{delno}",method = RequestMethod.GET)    
    public String delcust(
    		@PathVariable 
    		int delno)
    {    
    	customerService1.deletecust(delno);
        return "redirect:/view"; //call req pattern /view
    } 


	
	
	/*
	
	@RequestMapping("/details")    
    public String sercust(
    		@RequestParam("username") String userName)
    {    
    	 customerService1.searchcust(userName);
    	 System.out.println("name "+userName);
    	 
    	 
    	 
        return "redirect:/view"; //call req pattern /view
    } 
	
	@RequestMapping(value = "view", method = RequestMethod.GET)
	public String view(@ModelAttribute Customer customer1,Model m)
	{
		List<Customer> obj=customerService1.getcust();
		m.addAttribute("cust",obj);
			return "ViewCust";//ViewEmp.jsp
	}
	
	*/
	
	
	/*	@RequestMapping("/details")
	public String showCustomer(@RequestParam("username") String userName)
	{
		
		List<Customer> obj=customerService1.GetCustomerByName(userName);
		
		
		return "ViewCust1";
	     }  
	
	 @RequestMapping("/details")
	public ModelAndView search(@RequestParam("username")String userName) {
	    List<Customer> result = customerService1.GetCustomerByName(userName);
	    ModelAndView mav = new ModelAndView("search");
	    mav.addObject("result", result);
	 
	    return mav;    
	}  
	
	
	
	
	@RequestMapping("/details")
	  public String GetCustomer(
	    		@PathVariable 
	    		String userName)
	    {    
	    	customerService1.GetCustomerByName(userName);
	        return "redirect:/ViewCust1"; //call req pattern /view
	    }
	*/
	
	
}
