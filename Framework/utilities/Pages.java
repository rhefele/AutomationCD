package utilities;

import org.openqa.selenium.support.PageFactory;

import pageObjects.Home;
import pageObjects.L2ItemEdit;
import pageObjects.L2ItemsList;
import pageObjects.L2ServiceProvidersList;
import pageObjects.L2ServiceProviderEdit;
import pageObjects.Login;

public class Pages extends TestBase{

	public Login LoginPage = PageFactory.initElements(driver, Login.class);
	
	public Home HomePage = PageFactory.initElements(driver, Home.class);
	
	public L2ItemsList ItemListPage = PageFactory.initElements(driver, L2ItemsList.class);
	
	public L2ItemEdit ItemEditPage = PageFactory.initElements(driver, L2ItemEdit.class);
	
	public L2ServiceProvidersList ServiceProviderListPage = PageFactory.initElements(driver, L2ServiceProvidersList.class);
	
	public L2ServiceProviderEdit ServiceProviderEditPage = PageFactory.initElements(driver, L2ServiceProviderEdit.class);


	
}
