package com.lti;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.lti.dao.ProductinventoryDAO;
import com.lti.entity.Productinventory;

@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class ProductinventoryDAOImplTest {
	
	@Autowired
	ProductinventoryDAO productinventoryDAOImpl;

	
	@Test
	public void test()
	{
		System.out.println("hi");;
	}
	@Test
	public void testaddProd() {
				
		System.out.println(productinventoryDAOImpl);
		Productinventory prod1 = new Productinventory();
		prod1.setName("I phone");
		prod1.setProductdetails("mobile");
		prod1.setAvailabilitynumber((double)5);
		prod1.setActualcost((double)50000);
		prod1.setProcessingcharge((double)500);
		prod1.setTotalcost((double)50500);
			
		productinventoryDAOImpl.createProduct(prod1);
	}
	@Test
	public void UpdateAvailabilitynumber1() {
		System.out.println(productinventoryDAOImpl);
		
		Productinventory p = productinventoryDAOImpl.getProduct(4);
		
		System.out.println("Product Name : "+ p.getName());
		p.setAvailabilitynumber((double)2);
		
		System.out.println("Updating Availability Number");
		productinventoryDAOImpl.updateProduct(p);	
	}
}
