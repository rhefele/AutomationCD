package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Utility; 



public class L2ItemsList{
	
	@FindBy (linkText = "New Item")
	public static WebElement btn_NewItem;
	
	@FindBy (linkText = "Accounting")
	public static WebElement btn_TopMenuTab;
	
	@FindBy (linkText = "Items")
	public static WebElement btn_SideMenuTab;

	
	public void goTo () {
		// Navigate to Accounting page
		btn_TopMenuTab.click();
		Utility.waiting();
			 // Navigate to "Items" page
		btn_SideMenuTab.click();
		Utility.waiting();
	}
	 public void clickNewItemButton() {
		
		 btn_NewItem.click();
		 Utility.waiting();
		 
	 }


	
	

}
