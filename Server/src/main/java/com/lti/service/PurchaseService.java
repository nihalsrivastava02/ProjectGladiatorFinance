package com.lti.service;

import java.util.List;

import com.lti.entity.Productinventory;
import com.lti.entity.Purchase;
import com.lti.entity.Emidetail;
import com.lti.dto.PurchaseDto;
import com.lti.entity.Customer;

public interface PurchaseService {

	public boolean canPurchase(long balance, long totacost);
	boolean  BuyProduct(PurchaseDto purchaseDto);
	public Productinventory reduceProduct();
	public List<Emidetail> createEmidetails(Purchase purchase);
	public boolean reduceCardBalance(long cardnumber);
	public Customer updateStatusHoldLimit(Customer customer);
	
}
