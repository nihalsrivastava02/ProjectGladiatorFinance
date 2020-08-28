package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.lti.entity.Productinventory;
import com.lti.dao.ProductinventoryDAO;
import com.lti.dto.ProductinventoryDto;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductinventoryDAO productinventory;
	
	@Transactional
	public List<Productinventory> readAllProduct(ProductinventoryDto productinventoryDto) {
		return productinventory.readAllProduct();
	}

	@Transactional
	public Productinventory readProductById(long productid) {
		return productinventory.getProduct(productid);
	}

	@Transactional
	public boolean updateProductQty(long productid,double availabilitynumber) {
		return productinventory.updateAvailabiltyNumber(productid, availabilitynumber);
	}

	@Override
	public void insertdetail(Productinventory productinventory) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
