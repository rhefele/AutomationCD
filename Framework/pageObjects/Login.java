package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Utility; 

public class Login {

	@FindBy (name = "username")
	public static WebElement txtbx_Username;
	
	@FindBy (name = "password")
	public static WebElement txtbx_Password;
	
	@FindBy (className = "sign-in")
	public static WebElement btn_SignIn;
	
	public void loginInto() {
		txtbx_Username.sendKeys("admin");
		txtbx_Password.sendKeys("Password1");
		btn_SignIn.click();
		Utility.waiting();
	}
		
}
