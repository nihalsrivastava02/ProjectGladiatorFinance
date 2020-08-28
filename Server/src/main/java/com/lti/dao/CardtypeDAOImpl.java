package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.lti.entity.Cardtype;

@Component("card1")
public class CardtypeDAOImpl implements CardtypeDAO  {

	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public Cardtype getCardType(long cardtypeId) {
		
		Cardtype cardt = null;
		
		try {
			cardt = entityManager.find(Cardtype.class, cardtypeId);
		} catch (Exception e) {
			e.printStackTrace();
			return cardt;
		}
		return cardt;
	}
	
	@Transactional
	public boolean updateCardtype(Cardtype cardtype) {
		try {
			entityManager.merge(cardtype);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public boolean createCardType(Cardtype cardtype) {
		try {
			entityManager.persist(cardtype);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	

}
