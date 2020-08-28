package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Customer;
import com.lti.entity.Emidetail;
import com.lti.entity.Productinventory;
import com.lti.entity.Purchase;
import com.lti.dao.CustomerDAO;
import com.lti.dao.EmidetailDAO;
import com.lti.dao.ProductinventoryDAO;
import com.lti.dao.PurchaseDAO;
import com.lti.dto.PurchaseDto;
import com.lti.dao.CarddetailDAO;

@Service
public class PurchaseServiceImpl implements PurchaseService {
	
	@Autowired
	CarddetailDAO cardetail;
	
	@Autowired
	CustomerDAO customer;
	
	@Autowired
	EmidetailDAO emidetail;
	
	@Autowired
	ProductinventoryDAO productinventory;
	
	@Autowired
	PurchaseDAO purchasedaoImpl;

	@Transactional
	public boolean canPurchase(long balance, long totacost) {
	
		return false;
	}
	@Override
	public boolean BuyProduct(PurchaseDto purchaseDto) {
		return this.purchasedaoImpl.createPurchase(purchaseDto); 
		}

	

	@Transactional
	public Productinventory reduceProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<Emidetail> createEmidetails(Purchase purchase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean reduceCardBalance(long cardnumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public Customer updateStatusHoldLimit(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}



	

}
