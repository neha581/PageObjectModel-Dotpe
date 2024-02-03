package in.dotpe.merchant.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.dotpe.merchant.base.Base;

public class UploadListPage extends Base {

	// Object Repo
	@FindBy(xpath = "")
	WebElement downloadListUploadSampleFile;

	@FindBy(xpath = "")
	WebElement selectListUploadFile;

	@FindBy(xpath = "")
	WebElement uploadListBtn;

	@FindBy(xpath = "")
	WebElement nextBtnAfterListUpload;

	@FindBy(xpath = "")
	WebElement enterListName;

	@FindBy(xpath = "")
	WebElement enterListDescription;

	@FindBy(xpath = "")
	WebElement SaveListBtn;

	@FindBy(xpath = "")
	WebElement newListCreatedSuccessfully_popup;

//Define constructor for UplaodListPage class.
	public UploadListPage() {
		PageFactory.initElements(driver, this);
	}

// define actions available on UploadListPage.

}
