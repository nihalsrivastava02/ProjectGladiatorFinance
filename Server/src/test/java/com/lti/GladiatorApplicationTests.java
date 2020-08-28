package com.lti;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.lti.dao.CarddetailDAO;
import com.lti.dao.CardtypeDAO;
import com.lti.dao.CustomerDAO;
import com.lti.dao.EmidetailDAO;
import com.lti.dao.NewcardpaymentDAO;
import com.lti.dao.ProductinventoryDAO;
import com.lti.dao.PurchaseDAO;


@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class GladiatorApplicationTests {
	
	@Autowired
	CustomerDAO customerDAOImpl;
	
	@Autowired
	ProductinventoryDAO productinventoryDAOImpl;
	
	@Autowired
	CarddetailDAO carddetailDAOImpl;
	
	@Autowired
	CardtypeDAO cardtypeDAOImpl;
	
	@Autowired
	NewcardpaymentDAO newcardpaymentDAOImpl;
	
	@Autowired
	PurchaseDAO purchaseDAOImpl;

	@Autowired
	EmidetailDAO emidetailDAOImpl;
	
	@Test
	void contextLoads() {
		System.out.println("hi");
	}

}
