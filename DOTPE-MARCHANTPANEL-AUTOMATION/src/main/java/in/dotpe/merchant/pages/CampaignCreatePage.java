package in.dotpe.merchant.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import in.dotpe.merchant.base.Base;

public class CampaignCreatePage extends Base{
	
	//page factory or object repository(OR)
	@FindBy(xpath = "//input[@placeholder=\"Enter campaign name\"]")
	WebElement enterCampaignName;
	
	@FindBy(xpath = "//button[@class=\"ant-btn md-f500 md-text16  ant-btn-primary\"]")
	WebElement nextBtnAfterCampaignName;
	
	@FindBy(xpath = "//div[@class=\"segment-select-component-container list-dropdown\"]")
	WebElement selectListDropdwown;
	
	@FindBy(xpath = "//input[@placeholder=\"Search contact lists\"]")
	WebElement searchContactList;
	
	@FindBy(xpath = "//div[contains(@data-event-action,'List selection - test list ns')]")
	WebElement selectListfromDropdown;
	
	@FindBy(xpath = "//button[@class=\"ant-btn ant-btn-link\"]")
	WebElement listSelected;
	
	@FindBy(xpath = "//button[@class=\"ant-btn md-f500 md-text16  ant-btn-primary\"]")
	WebElement nextBtnAfterListSelection;
	
	@FindBy(xpath = "//input[@placeholder=\"Search for templates\"]")
	WebElement searchTemplate;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div[2]/div[2]/div/div/div/div[3]/div[1]/div[2]")
	WebElement selectTemplate;
	
	@FindBy(xpath = "//button[@id=\"next1\"]")
	WebElement nextBtnAfterTemplateSelection;

	@FindBy(xpath = "//span[@id=\"campaign-send-button\"]") 
	WebElement sendCampaign;
	
	@FindBy (xpath = "//div[@class='ok-cta']")  
	WebElement NewCampaignSentSuccessfully_Popup;
	
	@FindBy (xpath = "//button[@id=\"save-campaign-btn\"]") 
	WebElement saveCampaign;
	
	@FindBy (xpath = "//div[@class='ok-cta']")  
	WebElement NewCampaignSavedSuccessfully_Popup;
	
	@FindBy (xpath = "//i[@aria-label='icon: caret-down']//*[name()='svg']") 
	WebElement sendOptions;
	
	@FindBy (xpath = "//div[@class='test-option']")
	WebElement sendTestMsg;
	
	@FindBy (xpath = "//input[@placeholder='Enter mobile number']")
	WebElement enterNumber;
	
	@FindBy (xpath = "//div[@class='send-message-cta ']")
	WebElement sendTestMessage;
	
	@FindBy (xpath = "//div[@class='ok-cta']")
	WebElement testmsgSentSuccessfully;
	
	@FindBy (xpath = "//div[@id='schedule-option']")
	WebElement scheduleOption;
	
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
	
	
	//define constructor of CamapaignCreatePage class
	public CampaignCreatePage() {
		PageFactory.initElements(driver, this);
	}
	
	//define action available on campaign create page like send/save/schedule campaign/send Test msg
	//1. send campaign
	public CampaignEnginePage createCampaign() {
		enterCampaignName.sendKeys("campaignName");
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", nextBtnAfterCampaignName);
    	selectListDropdwown.click();
		searchContactList.sendKeys("ns");
		selectListfromDropdown.click();
		listSelected.click();
    	js.executeScript("arguments[0].click();", nextBtnAfterListSelection);
		searchTemplate.sendKeys("raksha_12");
		selectTemplate.click();
    	js.executeScript("arguments[0].click();", nextBtnAfterTemplateSelection);
    	js.executeScript("arguments[0].click();", sendCampaign);
    	NewCampaignSentSuccessfully_Popup.click();
		return new CampaignEnginePage();
	}
	//2. save campaign
	public CampaignEnginePage saveCampaign() {
        enterCampaignName.sendKeys("campaignName");
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", nextBtnAfterCampaignName); 
    	selectListDropdwown.click();
		searchContactList.sendKeys("ns");
		selectListfromDropdown.click();
		listSelected.click();
    	js.executeScript("arguments[0].click();", nextBtnAfterListSelection);
		searchTemplate.sendKeys("raksha_12");
		selectTemplate.click();
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
    	js2.executeScript("arguments[0].click();", nextBtnAfterTemplateSelection);
    	js2.executeScript("arguments[0].click();", saveCampaign);
    	NewCampaignSavedSuccessfully_Popup.click(); 
		return new CampaignEnginePage();
		
	}
	// 3. sending a test msg
	public CampaignEnginePage sendTestMsg() {
        enterCampaignName.sendKeys("campaignName");
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", nextBtnAfterCampaignName); 
    	selectListDropdwown.click();
		searchContactList.sendKeys("ns");
		selectListfromDropdown.click();
		listSelected.click();
    	js.executeScript("arguments[0].click();", nextBtnAfterListSelection);
		searchTemplate.sendKeys("raksha_12");
		selectTemplate.click();
    	js.executeScript("arguments[0].click();", nextBtnAfterTemplateSelection);
    	Actions actions = new Actions(driver);
        actions.moveToElement(sendOptions).perform();
        actions.clickAndHold(sendOptions).perform();
    	sendOptions.click();
    	sendTestMsg.click(); 
    	enterNumber.sendKeys("8290660528");
    	sendTestMessage.click();
    	testmsgSentSuccessfully.click();
		return new CampaignEnginePage();	
	}
	//4. scheduling a campaign
	public CampaignEnginePage scheduleCampaign() {
        enterCampaignName.sendKeys("campaignName");
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", nextBtnAfterCampaignName); 
    	selectListDropdwown.click();
		searchContactList.sendKeys("ns");
		selectListfromDropdown.click();
		listSelected.click();
    	js.executeScript("arguments[0].click();", nextBtnAfterListSelection);
		searchTemplate.sendKeys("raksha_12");
		selectTemplate.click();
    	js.executeScript("arguments[0].click();", nextBtnAfterTemplateSelection);
    	Actions actions = new Actions(driver);
        actions.moveToElement(sendOptions).perform();
        actions.clickAndHold(sendOptions).perform();
    	sendOptions.click();
    	scheduleOption.click(); 
    	scheduleForToday.click();
    	selectTime.click();
    	selectHour.click();
    	selectMin.click();
    	scheduleSend.click();
    	newCampaignScheduledSuccessfully.click();
		return new CampaignEnginePage();			
	}
}

