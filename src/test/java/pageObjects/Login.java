package pageObjects;

import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage
{
	public Logger logger;
    //constructor
	public Login(WebDriver driver) 
	{
		super(driver);
    }
	
	//locators
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement EmailAdress;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement login;
	
	//Actions
	
	public void emailadress(String Eadress)
	{
		EmailAdress.sendKeys(Eadress);
	}
	
	public void Password(String Pswd)
	{
		EmailAdress.sendKeys(Pswd);
	}
	
	public void Lgin()
	{
		login.click();
	}
	

}
