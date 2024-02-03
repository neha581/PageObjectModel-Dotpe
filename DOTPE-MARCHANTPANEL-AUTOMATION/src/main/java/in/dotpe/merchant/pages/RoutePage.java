package in.dotpe.merchant.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import in.dotpe.merchant.base.Base;

public class RoutePage extends Base{
	
	//Object repo
	@FindBy(xpath = "//div[@id=\"MarketingSidebar\"]")
	WebElement marketingTab;
	
	@FindBy(xpath = "//span[@id=\"CampaignsSidebar\"]")
	WebElement campaignTab;
	
	@FindBy(xpath = "//span[@id=\"TemplatesSidebar\"]")
	WebElement TemplatesTab;
	
	@FindBy(xpath = "//span[@id=\"My customersSidebar\"]")
	WebElement myCustomersTab;
	
	@FindBy(xpath = "//span[@id=\"InboxSidebar\"] ")
	WebElement InboxTab;
	
	//define constructor for Rountepage class
	
	
	
	

}
