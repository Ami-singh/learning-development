package com.ibm.commerce.stella.custauth;

import com.ibm.commerce.stella.helpersqls.AdhocSqls;
import com.ibm.commerce.stella.helpersqls.SqlStatments;

import java.util.logging.Level;
import java.util.logging.Logger;
 
public class XICPEAuthControllerCmdImpl implements
		XICPEAuthControllerCmd {
	private static final String CLASS_NAME = XICPEAuthControllerCmdImpl.class.getName();
	private static Logger logger = Logger.getLogger(CLASS_NAME);
	
	String auth1 = null;
	String auth2 = null;
	String auth3 = null;
	Integer storeId = null;
	Integer langId = null;
	String storeType=null;
	
	public void performExecute() {
		final String methodName = "performExecute";

	   logger.entering( CLASS_NAME, methodName);
		
		
		logger.info("sadf - "+ storeType);
		if(storeType.equals("cpp")){
			logger.info("inside cpp store ");
			logger.info(storeType);
			
			
		}else if(storeType.equals("epp")){
			logger.info("inside epp");
			
		}
		AdhocSqls sqlExe = new AdhocSqls();
		
		
		logger.info("auth1 : "+auth1 + " auth2 : "+ auth2.toUpperCase()+ " auth3 : "+ auth3.toUpperCase());
		
		Object[] parameters =  new Object[] {storeId,auth1,auth2.toUpperCase(),auth3.toUpperCase()};
		
		if(sqlExe.validateQuery(SqlStatments.XICRESTRICTAUTH_ACCESS, parameters))
		{	
			logger.info("storeID : " + getStoreId());
			
			logger.info("authenticated");
			//typProps.put(getStoreId(), val)
			
		}else{
			logger.info("not authenticated");
			 
			
		}
		
		
		logger.exiting( CLASS_NAME, methodName );
	}

	public void setRequestProperties(TypedProperty pRequestProperties)  {
	    auth1 = pRequestProperties.getString("auth1", "");
	    auth2 = pRequestProperties.getString("auth2", "");
	    
	    auth3 = pRequestProperties.getString("auth3", "");
	    storeType = pRequestProperties.getString("storeType",""); 
	    //auth2 = pRequestProperties.getString("auth2", "");
	    storeId = Integer.parseInt(pRequestProperties.getString("storeId", ""));
	    langId = Integer.parseInt(pRequestProperties.getString("langId", ""));
	}
	
}
