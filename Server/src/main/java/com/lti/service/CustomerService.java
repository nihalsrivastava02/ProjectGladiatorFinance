package com.lti.service;

import com.lti.entity.Customer;
import com.lti.entity.Newcardpayment;

import java.util.List;

import com.lti.dto.CarddetailDto;
import com.lti.dto.CustomerDto;
import com.lti.dto.LoginDto;
import com.lti.dto.NewcardpaymentDto;
import com.lti.entity.Carddetail;

public interface CustomerService {

	void register(Customer customer) throws Exception;
	public void updateStatusToDecline(Customer customer) throws Exception;
	boolean updateStatusToActive(long customerid,String status);
	public List<Customer> readAllCustomer(CustomerDto customerdto);
	public Carddetail assignCard(CarddetailDto cardDetailDto);
	boolean updatePass(long customerid, String password);
	public Newcardpayment newCardPayment(NewcardpaymentDto newCardPaymentDto);
	public long login(LoginDto loginDto) throws Exception;
	public Customer getCustomerById(long customerid);
}
