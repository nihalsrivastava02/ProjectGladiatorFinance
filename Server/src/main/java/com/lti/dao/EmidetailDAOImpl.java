package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Emidetail;


@Repository
public class EmidetailDAOImpl implements EmidetailDAO {

	@PersistenceContext //(unitName = "myPersistenceUnit") 
	private EntityManager	  entityManager;
	
	@Autowired
	PurchaseDAO PurchasesDAOImpl;


	@Transactional
	public boolean insertEmi(Emidetail emidetail) {
		// TODO Auto-generated method stub
		try {
		entityManager.persist(emidetail);
		} catch( Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
	}

	@Transactional
	public Emidetail getEmiById(long dueid) {
		// TODO Auto-generated method stub
		System.out.println("Fetching by policyId");
		Emidetail emi = null;
		try {
		emi= entityManager.find(Emidetail.class,dueid);
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		return emi;
	}

	

	@Transactional
	public boolean updateEmidetail(Emidetail emidetail) {
		// TODO Auto-generated method stub
		try {
		entityManager.merge(emidetail);
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
	}

	@Override
	public List<Emidetail> readEmidetailByPurchaseId(long purchasetxnid) {
		// TODO Auto-generated method stub
		List<Emidetail> emiData;

		try {
			Query ed = entityManager.createQuery("SELECT e from Emidetail e where e.purchase.userId=:prod");
			ed.setParameter("prod", purchasetxnid);
			emiData = ed.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return emiData;
	}
}
