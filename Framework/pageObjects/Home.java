package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Utility;

public class Home {

	@FindBy (linkText = "Home")
	public static WebElement btn_TopMenuTab;
	
	@FindBy (className = "identity_initial_circle")
	public static WebElement btn_AssumeIdentityBubble;
	
	@FindBy (className = "icon-signout")
	public static WebElement btn_SignOut;
	
	public void GoTo () {
		// Navigate to Accounting page
		btn_TopMenuTab.click();
		Utility.waiting();
	}
	
	public void SignOut () {
		btn_AssumeIdentityBubble.click();
		btn_SignOut.click();
		Utility.waiting();
	}
	

	
}
