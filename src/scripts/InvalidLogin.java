package scripts;

import org.testng.annotations.Test;

import pom.LoginPage;
import generic.Base_test;
import generic.Excel;

public class InvalidLogin extends Base_test{
	
	@Test
	public void testInvalidLogin()
	{
		String un = Excel.getCellValue(PATH,"InvalidLogin",1,0);
		String pwd = Excel.getCellValue(PATH,"InvalidLogin",1,1);
		
		//pass control of  login page
		LoginPage lp=new LoginPage(driver);
				
		//enter invalid un
		lp.setUSername(un);
				
		//enter invalid pwd
		lp.setPassword(pwd);
				
		//click on login
		lp.clickLogin();
		
		//verify errmsg
		lp.verifyErrmsg();
	}

}
