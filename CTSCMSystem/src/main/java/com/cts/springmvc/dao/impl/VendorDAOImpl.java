package com.cts.springmvc.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class VendorDAOImpl {
	
	@Autowired
	SessionFactory sessionFactory;//dispatcher-servlet.xml
	  public boolean checkVendorLogin(String userName, String userPassword){
			System.out.println("In Check login");
			Session session = sessionFactory.openSession();
			boolean userFound = false;
			//Query using Hibernate Query Language
			String SQL_QUERY =" from Vendor as o where o.username=:name and o.password=:pwd";
			Query query = session.createQuery(SQL_QUERY);
			query.setString("name",userName);//first ?
			query.setString("pwd",userPassword);//second ?
			List list = query.list();

			if ((list != null) && (list.size() > 0)) {
				userFound= true;
			}

			session.close();
			return userFound;              
 }

}
