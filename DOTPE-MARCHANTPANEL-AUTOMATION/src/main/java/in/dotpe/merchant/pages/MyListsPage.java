package in.dotpe.merchant.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import in.dotpe.merchant.base.Base;

public class MyListsPage extends Base {
	
	//OR
	@FindBy(xpath = "")
	WebElement createNewCustomerList;
	
	@FindBy(xpath = "")
	WebElement editCustomerList;
	
	@FindBy(xpath = "")
	WebElement deleteCustomerList;
	
	//Define constructor for MyListsPage
	public MyListsPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Define action available on MyListsPage
	

}
