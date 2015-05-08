package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Utility;

public class L2ServiceProvidersList {
	
	@FindBy (linkText = "Service Providers")
	public static WebElement btn_TopMenuTab;
	
	@FindBy (linkText = "New Service Provider")
	public static WebElement btn_NewServiceProvider;
	
	public void goTo () {
		// Navigate to Accounting page
		btn_TopMenuTab.click();
		Utility.waiting();
	}
	
	public WebElement searchForText (String Message) {
		return Utility.searchForText(Message);
	}
	
	 public void clickNewServiceProvider() {
		 btn_NewServiceProvider.click();
		 Utility.waiting();
	 }
	
}
