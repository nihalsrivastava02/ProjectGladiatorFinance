package com.lti.dao;

import com.lti.entity.Cardtype;

public interface CardtypeDAO {
	
	public Cardtype getCardType(long cardtypeID);
	public boolean createCardType(Cardtype cardtype);
	public boolean updateCardtype(Cardtype cardtype);

}
