package com.lti.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.lti.entity.Carddetail;
import com.lti.entity.Customer;

@Component("cust1")
public class CustomerDAOImpl implements CustomerDAO {

	@PersistenceContext
	EntityManager entityManager;

	
	@Transactional
	public boolean isCustomerPresent(String username) {
		return ((Number)entityManager.createNamedQuery("is-customer-present")
				.setParameter("us", username)
				.getSingleResult()).intValue()== 1? true:false;
	}

	@Transactional
	public boolean createCustomer(Customer customer) {

		try {
			entityManager.merge(customer);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Transactional
	public boolean createCardDetail(Carddetail cardDetail) {
		try {
			entityManager.persist(cardDetail);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public boolean updateCustomer(Customer customer) {
		try {
			entityManager.merge(customer);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public String getPassword(long customerid) {
		String passwd;
		try {
			Query query = entityManager.createQuery("select password from Customer where customerid=:id");
			query.setParameter("id", customerid);
			passwd = (String) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
		return passwd;
	}

	@Transactional
	public boolean updatePassword(long customerid, String password) {
		try {
			Query query = entityManager.createQuery("UPDATE Customer c SET c.password =:arg1 where c.customerid=:arg2");
			query.setParameter("arg1", password);
			query.setParameter("arg2", customerid);
			query.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Transactional
	public void updateStatusToDeclined(Customer customer) {
		entityManager.merge(customer);
	}
	
	@Transactional
	public boolean updateStatusToActivation(long customerid, String activationstatus) {
		try {
			Query query = entityManager.createQuery("UPDATE Customer c SET c.activationstatus=:arg1 where c.customerid=:arg2");
			query.setParameter("arg1", activationstatus);
			query.setParameter("arg2", customerid);
			query.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
	}

	@Transactional
	public Customer getCustomer(long customerid) {
		Customer custProfile;
		try {
			custProfile = entityManager.find(Customer.class, customerid);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return custProfile;
	}
	
	public List<Customer> readAllCustomer() {
		String jpql = "Select c From Customer c";
		TypedQuery<Customer> tquery = entityManager.createQuery(jpql,Customer.class);
		List<Customer> list = tquery.getResultList();
		System.out.println(list);
		return list;
	}
}
