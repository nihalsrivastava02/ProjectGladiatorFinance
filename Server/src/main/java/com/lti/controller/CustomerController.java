package com.lti.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dto.CustomerDto;
import com.lti.dto.LoginDto;
import com.lti.dto.ProductinventoryDto;
import com.lti.dto.PurchaseDto;
import com.lti.dto.StatusDto;
import com.lti.entity.Customer;
import com.lti.entity.Productinventory;
import com.lti.entity.Purchase;
import com.lti.exception.CustomerServiceException;
import com.lti.service.CustomerService;
import com.lti.service.ProductService;
import com.lti.service.PurchaseService;
import com.lti.status.Status;
import com.lti.status.Status.StatusType;


@RestController
@CrossOrigin
public class CustomerController {
	
	@Autowired
	private CustomerService customerservice;
	
	@Autowired 
	private ProductService productservice;
	
	@Autowired
	private PurchaseService purchaseservice;

	@PostMapping(path = "/register", consumes="application/json", produces="application/json")
	public String getCustomer(@RequestBody CustomerDto customerDto) {
		try {
			Customer customer = new Customer();
			BeanUtils.copyProperties(customerDto, customer);
			customerservice.register(customer);
			return "Success";
		} catch (Exception e) {
			
			e.printStackTrace();
			return "failed";
		}
	}
	
	@PostMapping(path = "/login") //passed
	public long login(@RequestBody LoginDto loginDto)
	{
		try {
			return this.customerservice.login(loginDto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -100;
		}
	}
	
	@GetMapping(path = "/product") //passed
	public List<Productinventory> readAllProduct(@RequestBody(required = false) ProductinventoryDto productinventoryDto){
	 {
			return this.productservice.readAllProduct(productinventoryDto);
		}
		
	}
	
	@GetMapping(path = "/customer") //passed
	public List<Customer> readAllCustomer(@RequestBody(required = false) CustomerDto customerDto){
	 {
			return this.customerservice.readAllCustomer(customerDto);
		}
		
	}
	
	@PostMapping(path = "/buyproduct", consumes="application/json", produces="application/json")
	public String getCustomer(@RequestBody PurchaseDto purchaseDto) {
		try {
			Purchase purchase = new Purchase();
			
			BeanUtils.copyProperties(purchaseDto, purchase);
			purchaseservice.BuyProduct(purchaseDto);
			
			return "Success";
		} catch (Exception e) {
			
			e.printStackTrace();
			return "failed";
		}
	}
	
	@GetMapping(path = "/admin/") //passed	
	public String updateStatusToDecline(@RequestBody StatusDto statusDto ) {
		try {
			Customer customer = new Customer();
			
			BeanUtils.copyProperties(statusDto, customer);
			
			customerservice.updateStatusToDecline(customer);
			
			return "Success";
		} catch (Exception e) {
			
			e.printStackTrace();
			return "failed";
		}
	}
	
	@PostMapping(path = "/admin", consumes = "application/json", produces = "application/json")
	public Status updateClaimStatus(@RequestBody StatusDto statusDto) {
		try {

			Customer customer = customerservice.getCustomerById((statusDto.getCustomerid()));
			
			if(customer == null) {
				throw new CustomerServiceException("Invalid customer id");
			}
			
			customer.setActivationstatus((statusDto.getActivationstatus()));

			customerservice.updateStatusToDecline(customer);
			
			
			Status status = new Status();
			status.setStatus(StatusType.ACTIVATED);
			
			return status;

		} catch (Exception e) {
			e.printStackTrace();
			Status status = new Status();
			status.setStatus(StatusType.DECLINED);

			return status;
		}
	}
}
