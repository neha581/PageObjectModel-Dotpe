package in.dotpe.merchant.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import in.dotpe.merchant.base.Base;
import in.dotpe.merchant.pages.CampaignCreatePage;
import in.dotpe.merchant.pages.CampaignEnginePage;
import in.dotpe.merchant.pages.LoginPage;
import in.dotpe.merchant.util.Util;

public class DeleteCampaignTest extends Base{
	LoginPage login;
	CampaignEnginePage campaignEnginePage;
	CampaignCreatePage campaignCreatePage;
	Util util;
	public DeleteCampaignTest() {
		super();
	}
	@BeforeMethod
	public void setUp(){
		initiatization();
		util = new Util();
		login = new LoginPage();
		campaignEnginePage = login.login(prop.getProperty("username"), prop.getProperty("password"));
		campaignCreatePage = new CampaignCreatePage();
	}
	@Test 
	public void validateDeleteCampaign() {
		campaignEnginePage.deleteCampaignTest();
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
