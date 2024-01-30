package in.dotpe.merchant.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.dotpe.merchant.base.Base;

public class CampaignEnginePage extends Base {

// page factory or object repository(OR)
	@FindBy(xpath = "//button[@class=\"ant-btn false new-campaign-cta child-pointer-none  ant-btn-primary\"]")
	WebElement newWhatsAppCampaign;

	@FindBy(xpath = "(//span[@class=\"edit-text\"][1])")
	WebElement editCampaignBtn;

	@FindBy(xpath = "")
	WebElement deleteCampaignBtn;
	
	@FindBy(xpath = "")
	WebElement rescheduleCampaignBtn;
//top-up and history
	
//define constructor of CamapaignEnginePage class
	public CampaignEnginePage() {
		PageFactory.initElements(driver, this);
	}

	// define edit campaign action available on campaign engine page
	public CampaignEnginePage newWhatsAppCampaign() {
		newWhatsAppCampaign.click();
		return new CampaignEnginePage();
	}
	public CampaignEnginePage editCampaignTest() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editCampaignBtn);
		return new CampaignEnginePage();
	}

	public CampaignEnginePage createCampaign() {
		return new CampaignEnginePage();

	}
/*
	// define delete campaign action available on campaign engine page
	public CampaignEnginePage deleteCampaignTest() {
		return new CampaignEnginePage();

	}*/
}
