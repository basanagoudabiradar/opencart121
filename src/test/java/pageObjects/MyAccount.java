package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage
{
    //Constructor
	public MyAccount(WebDriver driver) 
	{
		super(driver);	
	}
    
	//locators
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement accnt;
	
   //Actions
	
	public void  Account()
	{
		accnt.click();
	}
}
