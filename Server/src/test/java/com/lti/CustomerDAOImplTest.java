package com.lti;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
import com.lti.dto.NewcardpaymentDto;
import com.lti.entity.Carddetail;
import com.lti.entity.Cardtype;
import com.lti.entity.Customer;
import com.lti.entity.Emidetail;
import com.lti.entity.Productinventory;
import com.lti.entity.Purchase;
import com.lti.service.CustomerService;
import com.lti.service.PurchaseService;



@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class CustomerDAOImplTest {
	
	@Autowired
	CustomerDAO customerDAOImpl;
	
	@Autowired
	ProductinventoryDAO productinventoryDAOImpl;
	
	@Autowired
	CarddetailDAO carddetailDAOImpl;
	
	@Autowired
	CustomerService service;
	
	@Autowired
	CardtypeDAO cardtypeDAOImpl;
	
	@Autowired
	NewcardpaymentDAO newcardpaymentDAOImpl;
	
	@Autowired
	PurchaseDAO purchaseDAOImpl;
	
	@Autowired
	PurchaseService purchaseservice;
	
	@Autowired
	EmidetailDAO emidetailDAOImpl;
	
	@Test
	public void test() {
		System.out.println("hi");
	}
	
	@Test
	public void testaddCust() {
				
		System.out.println(customerDAOImpl);
		
		Customer cust1 = new Customer();
		cust1.setFirstname("Manish");
		cust1.setLastname("Rawat");
		cust1.setEmailid("manish@gmail.com");
		cust1.setPhoneno("123654");
		cust1.setUsername("manish");
		cust1.setPassword("manish");
		cust1.setPan("MANISH23");
		cust1.setAadharno("14785236952");
		cust1.setBankname("BOB");
		cust1.setAccountno("123456");
		cust1.setIfsc("BOBNAJIBA");
		cust1.setAddressline1("bidholi");
		cust1.setAddressline2("prem nagar");
		cust1.setCity("Dehradun");
		cust1.setState("uttarakhand");
		cust1.setCountry("India");
		
		customerDAOImpl.createCustomer(cust1);
	}
	
	@Test
	public void testaddCust2() {
				
		System.out.println(customerDAOImpl);
		
		Customer cust1 = new Customer();
		cust1.setFirstname("Akshat");
		cust1.setLastname("Singhal");
		cust1.setEmailid("akshat@gmail.com");
		cust1.setPhoneno("9411126050");
		cust1.setUsername("akshay");
		cust1.setPassword("akshat");
		cust1.setPan("AKAJDD2589");
		cust1.setAadharno("125896347852");
		cust1.setBankname("BOI");
		cust1.setAccountno("694120110000205");
		cust1.setIfsc("BKIDN69410");
		cust1.setAddressline1("street 1");
		cust1.setAddressline2("lane 1");
		cust1.setCity("Kotdwara");
		cust1.setState("uttarakhand");
		cust1.setCountry("India");
		
		customerDAOImpl.createCustomer(cust1);
	}
	@Test
	public void testaddCust3() {
				
		System.out.println(customerDAOImpl);
		
		Customer cust1 = new Customer();
		cust1.setFirstname("Pramod");
		cust1.setLastname("Singh");
		cust1.setEmailid("pramod@gmail.com");
		cust1.setPhoneno("9412589050");
		cust1.setUsername("pramod");
		cust1.setPassword("pramod1");
		cust1.setPan("ASSED2589");
		cust1.setAadharno("12525847852");
		cust1.setBankname("BOI");
		cust1.setAccountno("694259600205");
		cust1.setIfsc("BKIDN69410");
		cust1.setAddressline1("street 1");
		cust1.setAddressline2("lane 2");
		cust1.setCity("Kotdwara");
		cust1.setState("uttarakhand");
		cust1.setCountry("India");
		
		customerDAOImpl.createCustomer(cust1);
	}
	
	@Test
	public void UpdateStatus2() {
		System.out.println(customerDAOImpl);
		
		Customer c = customerDAOImpl.getCustomer(1);
		System.out.println("Customer Name : "+ c.getUsername());
		
		c.setActivationstatus("Activated");
		
		System.out.println("Updating Activation Status");
		customerDAOImpl.updateCustomer(c);	
	}
	@Test
	public void GetPass3() {
		String pass = customerDAOImpl.getPassword(1);
	}
	
	@Test
	public void UpdatePassword4() {
		Customer c = customerDAOImpl.getCustomer(2);
		c.setPassword("qwerty");
		customerDAOImpl.updateCustomer(c);	
	}
	
	@Test
	public void testaddProd() {
				
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
	public void testaddProd2() {
				
		Productinventory prod1 = new Productinventory();
		prod1.setName("Samsung J5");
		prod1.setProductdetails("mobile");
		prod1.setAvailabilitynumber((double)2);
		prod1.setActualcost((double)40000);
		prod1.setProcessingcharge((double)400);
		prod1.setTotalcost((double)40400);
			
		productinventoryDAOImpl.createProduct(prod1);
	}
	@Test
	public void testaddProd3() {
				
		Productinventory prod1 = new Productinventory();
		prod1.setName("oneplus tv");
		prod1.setProductdetails("appliances");
		prod1.setAvailabilitynumber((double)5);
		prod1.setActualcost((double)60000);
		prod1.setProcessingcharge((double)600);
		prod1.setTotalcost((double)60600);
			
		productinventoryDAOImpl.createProduct(prod1);
	}
	
	@Test
	public void testaddcardtype() 
	{
		Cardtype ctype = new Cardtype();
		ctype.setCardtypeid(101);
		ctype.setCardtypename("Titanium");
		ctype.setActiveyear(6);
		ctype.setCardjoiningfee(2000);
		ctype.setCardlimit((double)80000);
		
		cardtypeDAOImpl.createCardType(ctype);
	}
	@Test
	public void testaddcardtype2() 
	{
		Cardtype ctype = new Cardtype();
		ctype.setCardtypeid(102);
		ctype.setCardtypename("Gold");
		ctype.setActiveyear(4);
		ctype.setCardjoiningfee(1000);
		ctype.setCardlimit((double)50000);
		
		cardtypeDAOImpl.createCardType(ctype);
	}
	
	@Test
	public void testaddCarddetail() {
				
		Carddetail detail1 = new Carddetail(); 
		detail1.setExpirydate(new Date());
		detail1.setActivationdate(new Date());
		detail1.setBalance((double)50000);
		
		carddetailDAOImpl.insertCarddetail(detail1);
	}
	
	@Test
	public void testassignCard() {
				
		System.out.println(carddetailDAOImpl);  
		Customer cust = customerDAOImpl.getCustomer(2); 
		Carddetail cdDetail = new Carddetail(); 
		cdDetail.setBalance((double)50000);
		cdDetail.setExpirydate(new Date());
		cdDetail.setActivationdate(new Date()); 		
		cust.setCarddetail(cdDetail); 
		cdDetail.setCustomer(cust); 
		
		customerDAOImpl.updateCustomer(cust);
		
	}
	
	@Test
	public void testassignCard2() {
		Customer cust = customerDAOImpl.getCustomer(2); 		
		Carddetail cdDetail = cust.getCarddetail();  
		Cardtype cdtype = cardtypeDAOImpl.getCardType(102);
		Set <Carddetail> setcard = new HashSet<Carddetail>();
		setcard.add(cdDetail);
		cdDetail.setCardtype(cdtype);
		cdtype.setCarddetails(setcard);
		cardtypeDAOImpl.updateCardtype(cdtype);
	}
	
	@Test
	public void testassignCard3() {
				
		Customer cust = customerDAOImpl.getCustomer(1); 
		Cardtype cdtype = cardtypeDAOImpl.getCardType(101);
		Carddetail cdDetail = new Carddetail();
		cdDetail.setBalance((double)80000);
		cdDetail.setExpirydate(new Date());
		cdDetail.setActivationdate(new Date());
		cdDetail.setCustomer(cust);
		cdDetail.setCardtype(cdtype);

			
		Set <Carddetail> setcard = new HashSet<Carddetail>();
		setcard.add(cdDetail);
		
		cdtype.setCarddetails(setcard);
		cust.setCarddetail(cdDetail); //assign the card detail to the customer 
		customerDAOImpl.updateCustomer(cust);
	}
	
	

	@Test
	public void testbuyproduct()
	{
		Customer cust = customerDAOImpl.getCustomer(1);
		Purchase pur= new Purchase();
		pur.setEmiamountpermonth((double)10100);
		pur.setEmitenure(6);
		pur.setPurchasedate(new Date());
		pur.setCustomer(cust);
		Set <Purchase> purset = cust.getPurchases();
		purset.add(pur);
		cust.setPurchases(purset);
	
		customerDAOImpl.updateCustomer(cust);
	}
	
	@Test
	public void testassignCard4() {
				
		Customer cust = customerDAOImpl.getCustomer(2); 
		Cardtype cdtype = cardtypeDAOImpl.getCardType(101);
		Carddetail cdDetail = new Carddetail();
		cdDetail.setBalance((double)80000);
		cdDetail.setExpirydate(new Date());
		cdDetail.setActivationdate(new Date());
		cdDetail.setCustomer(cust);
		cdDetail.setCardtype(cdtype);

			
		Set <Carddetail> setcard = new HashSet<Carddetail>();
		setcard.add(cdDetail);
		
		cdtype.setCarddetails(setcard);
		cust.setCarddetail(cdDetail); //assign the card detail to the customer 
		customerDAOImpl.updateCustomer(cust);
	}
	@Test
	public void testbuyproduct2() {
				
		System.out.println(carddetailDAOImpl);
		Productinventory prod = productinventoryDAOImpl.getProduct(10);
		Purchase pur= new Purchase();
		Set <Purchase> purset = prod.getPurchases();
		purset.add(pur);
		prod.setPurchases(purset);
		productinventoryDAOImpl.updateProduct(prod);
		
		}
	
	
	
	@Test
	public void testbuyproduct3()
	{
		Customer cust = customerDAOImpl.getCustomer(1);
		Productinventory prod = productinventoryDAOImpl.getProduct(5);
		Purchase pur= new Purchase();
		pur.setEmiamountpermonth((double)10100);
		pur.setEmitenure(6);
		pur.setPurchasedate(new Date());
		pur.setCustomer(cust);
		pur.setProductinventory(prod);
		
		Set <Purchase> purset = cust.getPurchases();
		purset.add(pur);
		cust.setPurchases(purset);
		prod.setPurchases(purset);
	
		customerDAOImpl.updateCustomer(cust);
		}
	
	
	@Test
	public void testassignCard1() {
		
		Customer cust = customerDAOImpl.getCustomer(3); 
		Carddetail crdDet = cust.getCarddetail();
		Cardtype crdType = crdDet.getCardtype();
		
	}
	
	
	@Test
	public void testnewpayment()
	{
		NewcardpaymentDto newp=new NewcardpaymentDto();
		newp.setAmountpaid((double)1000);
		newp.setPaymentdate(new Date());
		newp.setCustomerId(3);
	}
	
//	@Test
//	public void testnewpurchase()
//	{
//		PurchaseDto newp =new PurchaseDto();
//		newp.setEmiamountpermonth((double)5000);
//		newp.setEmitenure(4);
//		newp.setPurchasedate(new Date());
//		
//					
//		System.out.println(purchaseservice.BuyProduct(4,7));
//	}
	
	@Test
	public void testemidetail()
	{
		Customer cust = customerDAOImpl.getCustomer(1);
		Set<Purchase> pur = cust.getPurchases();
		for (Purchase purchase : pur) {
			Set<Emidetail> emiset =	purchase.getEmidetails();
			for(int i=0;i<purchase.getEmitenure();i++) {			
				
			Emidetail emi = new Emidetail();
			emi.setPaymenttobedone((double)5000);
			emi.setDuedate(new Date());
			emi.setInstallmentmonthno((double)1);
			
			Double initial ;
			initial = productinventoryDAOImpl.getPrice(10);
			emi.setInitialtobebalance((double)initial);
			
			Double installment = purchaseDAOImpl.getInstallment(45);
			Double afterpayment = initial - installment ;
			emi.setAfterpaymenttobebalance((double)afterpayment);
			
			emi.setPurchase(purchase);
			double emiamount ;
			emiamount = purchase.getEmiamountpermonth();
			emiset.add(emi);
			}
			purchase.setEmidetails(emiset);
			purchaseDAOImpl.updatePurchase(purchase);
		}		
		
	}
}