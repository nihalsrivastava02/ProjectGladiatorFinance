package com.lti.service;

import java.util.List;

import com.lti.dto.ProductinventoryDto;
import com.lti.entity.Productinventory;

public interface ProductService {

	public List<Productinventory> readAllProduct(ProductinventoryDto productinventoryDto);
	void insertdetail(Productinventory productinventory) throws Exception;
	public Productinventory readProductById(long productid);
	//use below method to implement updation for quantity update by admin.
	public boolean updateProductQty(long productid, double availabilitynumber); 
}
