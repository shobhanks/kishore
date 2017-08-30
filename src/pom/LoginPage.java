package pom;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base_page{
	
	@FindBy(id="username")
	private WebElement unTbox;
	
	@FindBy(name="pwd")
	private WebElement pwdTbox;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errmsg;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void setUSername(String un)
	{
		unTbox.sendKeys(un);
	}
	
	public void setPassword(String pwd)
	{
		pwdTbox.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		loginbtn.click();
	}
	
	public void verifyErrmsg()
	{
		verifyElementIsPresent(errmsg);
	}
	
	public void LoginTitle(String etitle)
	{
		verifyTitle(etitle);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
