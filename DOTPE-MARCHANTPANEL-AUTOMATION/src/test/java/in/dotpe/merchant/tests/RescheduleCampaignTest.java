package in.dotpe.merchant.tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import in.dotpe.merchant.base.Base;
import in.dotpe.merchant.pages.CampaignCreatePage;
import in.dotpe.merchant.pages.CampaignEnginePage;
import in.dotpe.merchant.pages.LoginPage;
import in.dotpe.merchant.util.Util;

public class RescheduleCampaignTest extends Base{
	LoginPage login;
	CampaignEnginePage campaignEnginePage;
	CampaignCreatePage campaignCreatePage;
	Util util;
	public RescheduleCampaignTest() {
		super();
	}
	@BeforeMethod
	public void setUp(){
		initiatization();
		util = new Util();
		login = new LoginPage();
		campaignEnginePage = login.login(prop.getProperty("username"), prop.getProperty("password"));
		campaignCreatePage = new CampaignCreatePage();
		Actions actions = new Actions(driver);
	}
	
	@Test 
	public void validateRescheduleCampaign() {
		
		campaignEnginePage.rescheduleCampaignTest();
	}
	private void implicitly_wait(int i) {
		// TODO Auto-generated method stub
		
	}

}
