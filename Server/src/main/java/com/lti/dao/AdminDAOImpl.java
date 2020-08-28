package com.lti.dao;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Admin;


@Repository
public class AdminDAOImpl implements AdminDAO{

	@PersistenceContext
	EntityManager entityManager;


	@Transactional
	public Admin readAdminById(long adminid) {
		System.out.println("Fetching by admin id");
		Admin admin = null;
		try {
			admin = entityManager.find(Admin.class,adminid);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return admin;
	}


	@Transactional
	public Admin getadminLogin(Admin admin) {
		
		return null;
	}
}

