package XICPE;

import org.mockito.Mock;

import com.ibm.commerce.stella.helpersqls.AdhocSqls;

public class CustAuthTest {

	@Mock
	AdhocSqls sqlExe;
	
	@Test
	public void CustAuthValidate() {
		XICPEAuthControllerCmdImpl xicpe = new XICPEAuthControllerCmdImpl();
		Object[] parameters =  new Object[] {};
		when(sqlExe.validateQuery(sql.XICRESTRICTAUTH_ACCESS, parameters)).
		sqlExe.validateQuery(sql.XICRESTRICTAUTH_ACCESS, parameters)
		
	}
}
