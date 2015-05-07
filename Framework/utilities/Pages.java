package utilities;

import org.openqa.selenium.support.PageFactory;

import pageObjects.L2ItemEdit;
import pageObjects.L2ItemsList;
import pageObjects.Login;

public class Pages extends TestBase{

	public Login LoginPage = PageFactory.initElements(driver, Login.class);
	
	public L2ItemsList ItemListPage = PageFactory.initElements(driver, L2ItemsList.class);
	
	public L2ItemEdit ItemEditPage = PageFactory.initElements(driver, L2ItemEdit.class);


	
}
