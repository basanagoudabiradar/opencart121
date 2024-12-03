package testCases;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.Login;
import pageObjects.MyAccount;
import testBase.BaseClass;

public class TC002_AccountLogin extends BaseClass
{
   WebDriver driver;
   
   @Test
   
   public void accntlogin()
   {
	   logger.info("****accntlogin*****");
	   MyAccount ma=new MyAccount(driver);
	   ma.Account();
	   Login lg=new Login(driver);
	   logger.info("****emailadress*****");
	   lg.emailadress("basanagouda.krg@gmail.com");
	   lg.Password("Bassu@1992");
	   lg.Lgin();
   }
}

