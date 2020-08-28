package com.lti.dao;
import java.util.List;

import com.lti.entity.Carddetail;


public interface CarddetailDAO {
	
	public Carddetail getCardByCardNumber(long cardnumber);
	//public List<Carddetail> readAllCarddetails();
	public boolean insertCarddetail(Carddetail carddetail); 	//C
	public boolean updateCardDetails(Carddetail carddetail);		//U
	
	public List<Carddetail> getCardByCustomerId(long customerid);	
}
