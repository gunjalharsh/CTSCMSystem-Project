package com.cts.springmvc.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.springmvc.entity.Customer;

@Repository
public class CustomerDAOImpl {
	

	@Autowired
	SessionFactory sessionFactory;//dispatcher-servlet.xml

	public void createCustomer(Customer customer) {
		Session session = sessionFactory.openSession();
		session.save(customer);//persist hibernate
		System.out.println("Record Inserted");
		session.close();
	}
	
	public List<Customer> getCustomer() 
	{
		//get the hibernate session
		Session session = sessionFactory.openSession();
		//create a query.. sort by lastName
	//sorting the record by name 	
		Query theQuery = session.createQuery("from Customer order by name");
		List<Customer> e1 = theQuery.list();
		return e1;
	}
	public void deleteCust(long theId)
	{
		Session session = sessionFactory.openSession();
		//:abc runtime variable
		Query theQuery = session.createQuery("delete from Customer where id=:abc");
		theQuery.setParameter("abc", theId);
		theQuery.executeUpdate();
	}
	
	  public boolean checkLogin(String userName, String userPassword){
			System.out.println("In Check login");
			Session session = sessionFactory.openSession();
			boolean userFound = false;
			//Query using Hibernate Query Language
			String SQL_QUERY =" from Customer as o where o.username=? and o.password=?";
			Query query = session.createQuery(SQL_QUERY);
			query.setParameter(0,userName);//first ?
			query.setParameter(1,userPassword);//second ?
			List list = query.list();

			if ((list != null) && (list.size() > 0)) {
				userFound= true;
			}

			session.close();
			return userFound;   
			
	  }
			
   

	/*  
		public List<Customer> getCustomer1() 
		{
			//get the hibernate session
			Session session = sessionFactory.openSession();
			 	
			Query theQuery = session.createQuery("from Customer where username=?");
			List<Customer> e1 = theQuery.list();
			return e1;
		}     
	  */
	
	 
/*		public List<Customer> GetCustomerByName(String userName)
		{
			
			Session session = sessionFactory.openSession();
			
			
			Query theQuery = session.createQuery(" from Customer where userName=:username");
			theQuery.setString("username",userName);
			theQuery.executeUpdate();
			List<Customer> list1 = theQuery.list();
			return list1;
		}    */
		  
/*		
 *public List searchCust(String userName) 
 
		{
			Session session = sessionFactory.openSession();
			List li = new ArrayList();
			/*Query theQuery = session.createQuery(" from Customer as c where c.id =:userName");
			theQuery.setParameter("userName", userName);
			System.out.println(userName);
			//theQuery.executeUpdate();
			theQuery.uniqueResult();
			theQuery.setParameter("uname", userName);
			System.out.println("now"+userName);
			List list2 = session.createQuery("from Customer as c where c.id =:userName").list();
			Iterator it = list2.iterator();
			while(it.hasNext())
			{
				Customer emp = (Customer)it.next();
				Customer obj = new Customer();
					obj.setName(emp.getName());
					li.add(obj);
				}
				
			
			return li;
		}  
	  
		*/

}

