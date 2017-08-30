package scripts;

import generic.Base_test;
import generic.Excel;

import org.testng.annotations.Test;

import pom.EnterTimetrackPage;
import pom.LoginPage;

public class ValidLoginLogout extends Base_test{
	
	@Test
	public void testValidLoginLogout()
	{
		String un = Excel.getCellValue(PATH,"ValidLoginLogout",1,0);
		String pwd = Excel.getCellValue(PATH,"ValidLoginLogout",1,1);
		String lp_title = Excel.getCellValue(PATH,"ValidLoginLogout",1,2);
		String hp_title = Excel.getCellValue(PATH,"ValidLoginLogout",1,3);
		
		//pass control of  login page
		LoginPage lp=new LoginPage(driver);
		
		//enter valid un
		lp.setUSername(un);
		
		//enter valid pwd
		lp.setPassword(pwd);
		
		//click on login
		lp.clickLogin();
		
		//pass the control of home page
		EnterTimetrackPage ep=new EnterTimetrackPage(driver);
		
		//verify home page title
		ep.verifyTitle(hp_title);
		
		//click on logout
		ep.logoutLink();
		
		//verify login page title
		lp.verifyTitle(lp_title);
		
	}

}
