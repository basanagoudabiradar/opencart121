package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
    //Constructor
	public HomePage(WebDriver driver) 
	{
		super(driver);	
	}
	
	//Locators 
	
	//span[normalize-space()='My Account']
        @FindBy(xpath="//span[normalize-space()='My Account']")
          WebElement Linkmyacct;
        @FindBy(xpath="//a[normalize-space()='Register']")
          WebElement LinkRegister;
        
    //Actions
        
      public void clickMyaccnt()
      {
    	  Linkmyacct.click();
      }
      
      public void clickRegister()
      {
    	  LinkRegister.click(); 
      }
}
 
	
   
