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

	@FindBy(xpath = "//div[@class=\"delete-cta\"]")
	WebElement deleteCampaignBtn;
	
	@FindBy(xpath = "//div[@class=\"confirm-cta\"]")
	WebElement confirmDeleteCampaign;
	
	@FindBy(xpath = "//div[@class=\"reschedule-cta\"]")
	WebElement rescheduleCampaignBtn;
	
	@FindBy (xpath = "//span[normalize-space()='Today']")
	WebElement scheduleForToday;
	
	@FindBy (xpath = "//input[@placeholder='Select time']") 
	WebElement selectTime;
	
	@FindBy (xpath = "//li[@role='button'][normalize-space()='17']")
	WebElement selectHour;
	
	@FindBy (xpath = "//li[normalize-space()='35']")
	WebElement selectMin;
	
	@FindBy (xpath = "//button[normalize-space()='Schedule Send']")
	WebElement scheduleSend;
	
	@FindBy (xpath = "//button[normalize-space()='Okay']")
	WebElement newCampaignScheduledSuccessfully;
	
//top-up and history section can be added here
	
//define constructor of CamapaignEnginePage class
	public CampaignEnginePage() {
		PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, CampaignCreatePage.class);
	}

	// define actions available on campaign engine page
	//1. click on new WhatsApp Campaign button
	public CampaignEnginePage newWhatsAppCampaign() {
		newWhatsAppCampaign.click();
		return new CampaignEnginePage();
	}
	//2.edit campaign
	public CampaignEnginePage editCampaignTest(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editCampaignBtn);
		return new CampaignEnginePage();
	}

	//3. delete campaign 
	public CampaignEnginePage deleteCampaignTest() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", deleteCampaignBtn);
		confirmDeleteCampaign.click();
		return new CampaignEnginePage();
	}
	//4. reschedule campaign
	public CampaignEnginePage rescheduleCampaignTest() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", rescheduleCampaignBtn);
		scheduleForToday.click();
    	selectTime.click();
    	selectHour.click();
    	selectMin.click();
    	scheduleSend.click();
    	newCampaignScheduledSuccessfully.click();
		return new CampaignEnginePage();
	}
}
