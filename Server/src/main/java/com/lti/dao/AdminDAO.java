package com.lti.dao;

import com.lti.entity.Admin;

public interface AdminDAO {
	public Admin getadminLogin(Admin admin);
	public Admin readAdminById(long adminid);
	
}
