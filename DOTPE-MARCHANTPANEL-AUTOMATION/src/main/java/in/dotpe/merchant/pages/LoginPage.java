package in.dotpe.merchant.pages;

import in.dotpe.merchant.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {
	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/form/button/span[1]")
	WebElement loginBtn;

//Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

//Actions:

	public CampaignEnginePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();

		return new CampaignEnginePage();
	}

}
