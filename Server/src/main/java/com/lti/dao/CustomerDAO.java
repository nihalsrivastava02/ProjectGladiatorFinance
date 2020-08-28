package com.lti.dao;

import java.util.List;
import com.lti.entity.Customer;

public interface CustomerDAO {

	public boolean createCustomer(Customer customer);
	public boolean updateCustomer(Customer customer);
	Customer getCustomer(long customerid);
	boolean isCustomerPresent(String username);
	public String getPassword(long customerId);
	public void updateStatusToDeclined(Customer customer);
	boolean updateStatusToActivation(long customerid, String activationstatus);
	boolean updatePassword(long customerid, String password);
	public List<Customer> readAllCustomer() ;


}
