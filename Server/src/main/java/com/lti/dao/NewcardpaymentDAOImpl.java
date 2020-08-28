package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Newcardpayment;

@Component("newpay")
public class NewcardpaymentDAOImpl implements NewcardpaymentDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	NewcardpaymentDAO newcardpaymentDAOImpl;
	
	@Transactional
	public boolean createNewcardpayment(Newcardpayment newcardpayment) {
		// TODO Auto-generated method stub
		try {
			entityManager.persist(newcardpayment);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
	}

}
