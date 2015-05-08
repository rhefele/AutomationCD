package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.Utility;


public class L2ServiceProviderEdit {

	@FindBy (name = "companyName")
	public static WebElement txtbx_CompanyName;
	
	@FindBy (name = "email")
	public static WebElement txtbx_Email;
	
	@FindBy (name = "street1")
	public static WebElement txtbx_Street;
	
	@FindBy (name = "city")
	public static WebElement txtbx_City;
	
	@FindBy (name = "country")
	public static WebElement txtbx_Country;
	
	@FindBy (name = "zipCode")
	public static WebElement txtbx_ZipCode;

	@FindBy (id = "state")
	public static WebElement drdwn_State;
	
	@FindBy (className = "js-save")
	public static WebElement btn_Save;
	
	public void enterCompanyName() {
		txtbx_CompanyName.sendKeys("L3 SP " + Utility.stringRandom(7));
	}
	
	public void enterEmail() {
		txtbx_Email.sendKeys("testaccount@coredial.com");
	}
	
	public void enterStreet() {
		txtbx_Street.sendKeys(Utility.stringRandom(7));
	}
	
	public void enterCity() {
		txtbx_City.sendKeys(Utility.stringRandom(7));
	}
	
	public void enterCountry() {
		txtbx_Country.sendKeys("USA");
	}
	
	public void enterZIP() {
		txtbx_ZipCode.sendKeys(Utility.numberRandom(5));
	}
	
	public void selectStateByIndex(int index) {
	 Select State = new Select(drdwn_State); 
	 State.selectByIndex(index);
	}

	public void clickSave() {
		btn_Save.click();
		Utility.waiting();
	}
	
	
	public WebElement searchForText (String Message) {
		return Utility.searchForText(Message);
	}
	

	
	
}
