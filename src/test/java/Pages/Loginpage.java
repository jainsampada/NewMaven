package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBasePack.Testbase;

public class Loginpage  extends Testbase{

	//Factory classes
	@FindBy(id="txtUsername")
	WebElement uname;
	
	@FindBy(id="txtPassword")
	WebElement pass;
	
	@FindBy(id="btnLogin")
	WebElement btnSubmit;
	
	@FindBy(linkText="Forgot your password?")
	WebElement forgetpass;
	
	@FindBy(xpath="//*[@id=\"divLogo\"]/img")
	WebElement logo;
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public void Login()
	{
		uname.sendKeys(prop.getProperty("username"));
		pass.sendKeys(prop.getProperty("password"));
		btnSubmit.click();
		
	}
	public void Forgetpass()
	{
		forgetpass.click();
		
	}
}
