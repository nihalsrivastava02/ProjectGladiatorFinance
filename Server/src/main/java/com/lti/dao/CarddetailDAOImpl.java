package com.lti.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.lti.entity.Carddetail;

@Component("cardd")
public class CarddetailDAOImpl implements CarddetailDAO
{
	@PersistenceContext //(unitName = "myPersistenceUnit") 
	 EntityManager  entityManager;
	
	@Autowired
	CarddetailDAO carddetailDAOImpl;
	
	@Transactional
	public boolean insertCarddetail(Carddetail carddetail) {
		try {
			entityManager.merge(carddetail);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Transactional
	public Carddetail getCardByCardNumber(long cardnumber) {
		System.out.println("Fetching by cardnumber");
		Carddetail cardn = null;
		try {
			cardn = entityManager.find(Carddetail.class, cardn);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return cardn;
	}
	
	@Transactional
	public List<Carddetail> getCardByCustomerId(long customerid){
		
		System.out.println("Fetching by customerid");
		List<Carddetail> cardData = null;
		try {
			Query card = entityManager.createQuery("SELECT c from Carddetail c where c.cardCustomerId.customerid=:customer");
					card.setParameter("customer", customerid);
					cardData = card.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return cardData;
	}
	
	@Transactional
	public boolean updateCardDetails(Carddetail Carddetail) {
		// TODO Auto-generated method stub
		try {
		entityManager.merge(Carddetail);
		}
		catch(Exception e) {
			return false;
		}
		return true;
		
	}
}

