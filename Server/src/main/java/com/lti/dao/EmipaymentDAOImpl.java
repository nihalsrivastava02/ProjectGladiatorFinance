package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Emipayment;

public class EmipaymentDAOImpl implements EmipaymentDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public boolean insertPayment(Emipayment emiPayment) {
		// TODO Auto-generated method stub
		try {
			entityManager.persist(emiPayment);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
	}

	
	@Transactional
	public Emipayment readEmiPaymentById(long paymenttxnid) {
		// TODO Auto-generated method stub
		Emipayment id; 
		try {
		id = entityManager.find(Emipayment.class, paymenttxnid);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		 return id;
	}

	

}
