package com.ibm.commerce.stella.helpersqls;

import java.util.Vector;


public class AdhocSqls {

	//private final String XICRESTRICTAUTH_ACCESS = "Select count(*) from XICRESTRICTAUTH where storeId = ? and field1 = ? and field2 = ? and field3 = ?";
	Vector  results = null;
	
	public boolean validateQuery(String queryStatment,Object[] parameters ){
		System.out.println("inside validate");
		/*ServerJDBCHelperAccessBean jdbcHelper = new ServerJDBCHelperAccessBean();*/
		
		try{
		
		/*results = jdbcHelper.executeParameterizedQuery(queryStatment, parameters);*/
		System.out.println("result : "+results.toString());
		if (results != null && !results.isEmpty()) {
			if(results.size() > 0){
				return true;
			}
		}
		}catch(Exception E){
			System.out.println("Error fetching sql");
		}
		
		return false;
	}
	
}
