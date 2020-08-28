package com.lti.dao;

import com.lti.dto.PurchaseDto;
import com.lti.entity.Purchase;

public interface PurchaseDAO {
	
	
	public boolean createPurchase(PurchaseDto purchaseDto);
	public Purchase readPurchaseById(long purchaseTxnId);
	public boolean updatePurchase(Purchase purchase);
	Purchase getPurchase(long purchasetxnid);
	public Double getInstallment(long purchasetxnid);


}
