package com.lti.dao;

import java.util.Date;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dto.PurchaseDto;
import com.lti.entity.Customer;
import com.lti.entity.Productinventory;
import com.lti.entity.Purchase;

@Repository
public class PurchaseDAOImpl implements PurchaseDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public boolean createPurchase(PurchaseDto purchaseDto) {
		long custid = purchaseDto.getCustomerId();
		long prodid = purchaseDto.getProductId();
		CustomerDAO customerDAOImpl = null ;
		ProductinventoryDAO productinventoryDAOImpl = null;
		Customer cust = customerDAOImpl.getCustomer(custid);
		Productinventory prod = productinventoryDAOImpl.getProduct(prodid);
		
		
		Purchase pur= new Purchase();
		pur.setEmiamountpermonth((double)5000);
		pur.setEmitenure(3);
		pur.setPurchasedate(new Date());
		pur.setCustomer(cust);
		pur.setProductinventory(prod);
		
		Set <Purchase> purset = cust.getPurchases();
		purset.add(pur);
		cust.setPurchases(purset);
		prod.setPurchases(purset);
	
		
		/*Customer cust = this.entityManager.find(Customer.class,customerid);
		Productinventory prod = this.entityManager.find(Productinventory.class,productid);
		
		Purchase p = new Purchase();
		p.setEmiamountpermonth((double)5000);
		p.setEmitenure(3);
		p.setPurchasedate(new Date());
		p.setCustomer(cust);
		p.setProductinventory(prod);
		this.entityManager.merge(p);
		*/
		return true;
	}
	
	@Transactional
	public boolean updatePurchase(Purchase purchase) {
		try {
			entityManager.merge(purchase);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public Purchase readPurchaseById(long purchaseTxnId) {
		
		Purchase purch = null;
		
		try {
			purch = entityManager.find(Purchase.class,purchaseTxnId );
		} catch (Exception e) {
			e.printStackTrace();
			return purch;
		}
		return purch;
	}
	
	@Transactional
	public Purchase getPurchase(long purchasetxnid) {
		Purchase prodProfile;
		try {
			prodProfile = entityManager.find(Purchase.class, purchasetxnid);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return prodProfile;
	}
	@Transactional
	public Double getInstallment(long purchasetxnid) {
		Double installment;
		try {
			Query query = entityManager.createQuery("select emiamountpermonth from Purchase where purchasetxnid=:id");
			query.setParameter("id", purchasetxnid);
			installment = (Double) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return installment;
	}
}
