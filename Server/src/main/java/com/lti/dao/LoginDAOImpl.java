package com.lti.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component("login")
public class LoginDAOImpl implements LoginDAO{
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public long getUserByUsernameAndPassword(String username, String password) throws Exception{
		Query q = null;
		try
		{
			//String query = "select uId from UserTable where uEmail=:x and uPassword=:y";
			String query = "select customerid from Customer where username=:x and password=:y";
			q = (Query) this.entityManager.createQuery(query);
			q.setParameter("x", username);
			q.setParameter("y", password);
			System.out.println("Result is :"+q.getSingleResult());
		}
		catch(Exception e)
		{
			throw new Exception("Customer Not Found");
		}
		return (long)q.getSingleResult();
	}
}