package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage  extends BasePage

{
   //Constructor
	public AccountRegistrationPage(WebDriver driver) 
	{
		super(driver);	
	}
    
	//locators
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txt_Firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txt_Lastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txt_Email;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txt_Telephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txt_pwd;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txt_confirm_pwd;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement click_policy;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btn_countinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfermation;
	
	//Actions
	
	public void setFirstName(String fname)
	{
		txt_Firstname.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txt_Lastname.sendKeys(lname);
	}
	
	public void setEmail(String mail)
	{
		txt_Email.sendKeys(mail);
	}
	
	public void setTelephone(String tel)
	{
		txt_Telephone.sendKeys(tel);
	}
	
	public void setPassword(String pwd)
	{
		txt_pwd.sendKeys(pwd);
	}
	
	public void setConfirmPassword(String pwd)
	{
		txt_confirm_pwd.sendKeys(pwd);
	}
	
	public void setPrivacypolicy()
	{
		click_policy.click();
	}
	
	public void clickcountinue()
	{
		btn_countinue.click();
	}
	
	public String getconfermationmsg()
	{
		try {
			return (msgConfermation.getText());
		}
		catch (Exception e)
		{
		     return (e.getMessage());	
		}
	}
	
}
