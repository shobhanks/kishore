package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import generic.Base_page;

public class EnterTimetrackPage extends Base_page{
	
	@FindBy(id="logoutLink")
	private WebElement logoutlink;
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[3]")
	private WebElement helpbtn;
	
	@FindBy(xpath="//a[.='About actiTIME']")
	private WebElement aboutActitime;
	
	@FindBy(xpath="//span[contains(.,'actiTIME')]")
	private WebElement version;
	
	@FindBy(xpath="//img[@title='Close']")
	private WebElement close;
	
	public EnterTimetrackPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void logoutLink()
	{
		logoutlink.click();
	}
	
	public void clickHelp()
	{
		helpbtn.click();
	}
	
	public void clickActitime()
	{
		aboutActitime.click();
	}
	
	public void verifyVersion(String eversion)
	{
		String aversion = version.getText();
		Assert.assertEquals(aversion,eversion);
		Reporter.log("version is same",true);
	}
	
	public void clickClose()
	{
		close.click();
	}
	
	public void HomeTitle(String etitle)
	{
		verifyTitle(etitle);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
