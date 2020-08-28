package com.lti.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Carddetail;
import com.lti.entity.Customer;
import com.lti.entity.Newcardpayment;
import com.lti.exception.CustomerServiceException;
import com.lti.dao.CustomerDAO;
import com.lti.dao.LoginDAO;
import com.lti.dao.CardtypeDAO;
import com.lti.dao.CarddetailDAO;
import com.lti.dao.NewcardpaymentDAO;
import com.lti.dto.CarddetailDto;
import com.lti.dto.CustomerDto;
import com.lti.dto.LoginDto;
import com.lti.dto.NewcardpaymentDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDAO customerdaoImpl;

	@Autowired
	CarddetailDAO carddaoImpl;
	
	@Autowired
	CardtypeDAO cardtypedaoImpl;
	
	@Autowired
	NewcardpaymentDAO newcardpaymentdaoImpl;
	
	@Autowired
	LoginDAO logindaoImpl;
	
	@Override
	public void register(Customer customer) {
		if (!customerdaoImpl.isCustomerPresent(customer.getUsername())) {
			customerdaoImpl.createCustomer(customer);
		} else {
			throw new CustomerServiceException("Customer already registered");
		}

	}

	/*@Override
	public boolean updateStatusToDecline(long customerid,String status) {
		Customer c = new Customer();
		long custid = c.getCustomerid();
		String dstatus = "Decline";
		if (customerdaoImpl.updateStatusToDeclined(custid, dstatus))
			return true;
		else
			return false;

	}*/
/*
	@Override
	public boolean updateStatusToActive(String status) {
		Customer c = new Customer();
		long custid = c.getCustomerid();
		String dstatus = "Active";
		if (customerdaoImpl.updateStatusToActivation(custid, dstatus))
			return true;
		else
			return false;

	}*/
	
	@Override
	public void updateStatusToDecline(Customer customer) throws CustomerServiceException {
		customerdaoImpl.updateStatusToDeclined(customer);
	}
	
	@Transactional
	public List<Customer> readAllCustomer(CustomerDto customerDto) {
		return customerdaoImpl.readAllCustomer();
	}
	
	@Override
	public boolean updatePass(long customerid, String password) {
		Customer c = new Customer();
		long custid = c.getCustomerid();
		String pass = c.getPassword();
		if (customerdaoImpl.updatePassword(custid, pass))
			return true;
		else
			return false;
	}

	@Override
	public Carddetail assignCard(CarddetailDto cardDetailDto) {
		Carddetail carddetail = new Carddetail();
		Customer cust1 = customerdaoImpl.getCustomer(cardDetailDto.getCustomerId());
		//Cardtype ctype = cardtypedaoImpl.getCardType(cardDetailDto.getCardtype());

		String str = cust1.getActivationstatus();
		if (str.equals("Activated")) {
			BeanUtils.copyProperties(cardDetailDto, carddetail);
			carddetail.setCustomer(cust1);
			//carddetail.setCardtype(ctype);
			System.out.println(carddetail.toString());

			carddaoImpl.insertCarddetail(carddetail);
		} else {
			throw new CustomerServiceException("Pending for approval");
		}
		return null;
	}

	@Override
	public Newcardpayment newCardPayment(NewcardpaymentDto newCardPaymentDto) {
		Newcardpayment cardpayment = new Newcardpayment();
		Customer cust2 = customerdaoImpl.getCustomer(newCardPaymentDto.getCustomerId());
		BeanUtils.copyProperties(newCardPaymentDto, cardpayment);
		cardpayment.setCustomer(cust2);
		newcardpaymentdaoImpl.createNewcardpayment(cardpayment);
		return null;
	}

	@Override
	public long login(LoginDto loginDto) throws Exception{
		long id = this.logindaoImpl.getUserByUsernameAndPassword(loginDto.getUsername(),loginDto.getPassword());
		return id;
	}

	@Override
	public boolean updateStatusToActive(long customerid, String status) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer getCustomerById(long customerid) {
		return customerdaoImpl.getCustomer(customerid);
	}
}
