package com.lti.dao;

public interface LoginDAO {

	public long getUserByUsernameAndPassword(String username, String password) throws Exception;
}
