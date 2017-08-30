package scripts;

import org.testng.annotations.Test;

import pom.EnterTimetrackPage;
import pom.LoginPage;
import generic.Base_test;
import generic.Excel;

public class VerifyActitimeVersion extends Base_test{
	
	@Test
	public void testVerifyActitimeVersion()
	{
		String un = Excel.getCellValue(PATH,"VerifyActitimeVersion",1,0);
		String pwd = Excel.getCellValue(PATH,"VerifyActitimeVersion",1,1);
		String lp_title = Excel.getCellValue(PATH,"VerifyActitimeVersion",1,2);
		String hp_title = Excel.getCellValue(PATH,"VerifyActitimeVersion",1,3);
		String eversion = Excel.getCellValue(PATH,"VerifyActitimeVersion",1,4);
		
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
		
		//click on  help
		ep.clickHelp();
		
		//click on about actitime
		ep.clickActitime();
		
		//verify version
		ep.verifyVersion(eversion);
		
		//click on close btn
		ep.clickClose();
		
		//click on logout
		ep.logoutLink();
		
		//verify login page
		lp.verifyTitle(lp_title);
		
	}

}
