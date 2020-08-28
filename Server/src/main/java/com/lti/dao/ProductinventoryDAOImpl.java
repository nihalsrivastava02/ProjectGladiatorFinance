package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Productinventory;

@Component("Prod1")
public class ProductinventoryDAOImpl implements ProductinventoryDAO {
	@PersistenceContext
     EntityManager entityManager;

	public List<Productinventory> readAllProduct() {
		String jpql = "Select p From Productinventory p";
		TypedQuery<Productinventory> tquery = entityManager.createQuery(jpql,Productinventory.class);
		List<Productinventory> list = tquery.getResultList();
		System.out.println(list);
		return list;
	}
	
	@Transactional
	public boolean createProduct(Productinventory productinventory) {
		try {
			entityManager.persist(productinventory);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Transactional
	public boolean isProductPresent(String name) {
		return ((Number)entityManager.createNamedQuery("is-product-present")
				.setParameter("pn", name)
				.getSingleResult()).intValue()== 1? true:false;
	}
/*
	@Transactional
	public Productinventory readProductById(long productid) {
		String query = "Select p from Product p where p.productId="+productid;
		TypedQuery<Productinventory> tquery = entityManager.createQuery(query, Productinventory.class);
		Productinventory product  = tquery.getSingleResult();
		
		return product;
	}
	*/
	@Transactional
	public boolean updateProduct(Productinventory productinventory) {
		try {
			entityManager.merge(productinventory);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public Productinventory getProduct(long productid) {
		Productinventory prodProfile;
		try {
			prodProfile = entityManager.find(Productinventory.class, productid);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return prodProfile;
	}
	@Transactional
	public boolean updateAvailabiltyNumber(long productid,double availabilitynumber) {
		try {
			Query query = entityManager.createQuery("UPDATE Productinventory p SET p.availabiltynumber =:arg1 where p.productid=:arg2");
			query.setParameter("arg1", availabilitynumber);
			query.setParameter("arg2", productid);
			query.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public Double getPrice(long productid) {
		Double price;
		try {
			Query query = entityManager.createQuery("select totalcost from Productinventory where productid=:id");
			query.setParameter("id", productid);
			price = (Double) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return price;
	}

	@Override
	public Productinventory getCustomer(long productid) {
		// TODO Auto-generated method stub
		return null;
	}


}
