package com.lti.dao;

import java.util.List;
import com.lti.entity.Productinventory;

public interface ProductinventoryDAO {
	
	public boolean createProduct(Productinventory productinventory);
	Productinventory getCustomer(long productid);
	boolean isProductPresent(String name);
	public List<Productinventory> readAllProduct() ;
	public boolean updateProduct(Productinventory productinventory);
	Productinventory getProduct(long productid);
	boolean updateAvailabiltyNumber(long productid , double availabilitynumber);
	public Double getPrice(long customerId);										// Login 

}
