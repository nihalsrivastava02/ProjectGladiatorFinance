package com.lti.dao;

import java.util.List;
import com.lti.entity.Emidetail;

public interface EmidetailDAO {
	
	public boolean insertEmi(Emidetail emidetail); 	//C
	public Emidetail getEmiById(long dueid);//R
	public boolean updateEmidetail(Emidetail emidetail);		//U
	public List<Emidetail> readEmidetailByPurchaseId(long purchasetxnid);
	
}
