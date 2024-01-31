package in.dotpe.merchant.tests;

	//import java.io.IOException;
    //import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import in.dotpe.merchant.base.Base;
	import in.dotpe.merchant.pages.CampaignEnginePage;
	import in.dotpe.merchant.pages.LoginPage;
   // import in.dotpe.merchant.util.*;
	public class LoginTest extends Base{
		LoginPage login;
		CampaignEnginePage campaignEngine;
		
		public LoginTest(){
			super();
			
		}
		
		@BeforeMethod
		public void setUp(){
			initiatization();
			login = new LoginPage();	
		}
		
		
		@Test(priority=1)
		public void loginTest(){
			campaignEngine = login.login(prop.getProperty("username"), prop.getProperty("password"));
			
		}
		
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}	

	}

