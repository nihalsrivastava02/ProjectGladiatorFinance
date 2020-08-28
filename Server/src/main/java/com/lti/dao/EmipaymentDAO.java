package com.lti.dao;

import com.lti.entity.Emipayment;

public interface EmipaymentDAO {
	
	public boolean insertPayment(Emipayment emiPayment);
	public Emipayment readEmiPaymentById(long paymenttxnid);

}
