package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_Account_Registraction extends BaseClass
{
    WebDriver driver;
	
	@Test
	public void verifi_acconut_registraction()
	{
		logger.info("*******Starting TC001_Account_Registraction*******");
		try
	{
		
		HomePage hp=new HomePage(driver);
		hp.clickMyaccnt();
		logger.info("*******Clicked on MyAccount link******");
		hp.clickRegister();
		logger.info("Clicked on Register link");
		AccountRegistrationPage acct=new AccountRegistrationPage(driver);
		logger.info("provoiding customer info");
		acct.setFirstName("Basavaraj");
		acct.setLastName("Biradar");
		acct.setEmail("pmsbasa123@gamil.com");
		acct.setTelephone("12365479");
		acct.setPassword("yz123456");
		acct.setConfirmPassword("yz123456");
		acct.setPrivacypolicy();
		acct.clickcountinue();
		
		logger.info("validate expected msg");
		String confermmsg=acct.getconfermationmsg();
		Assert.assertEquals(confermmsg, "Your Account Has Been Created!");
	}
	catch(Exception e)
	{
		
		logger.error("Test Failed..");
		//logger.debug("Debug Logs..");
		Assert.fail();
	}
		logger.info("*****fineshed TC001_Account_Registraction*****");
	}

}

