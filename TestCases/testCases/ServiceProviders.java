package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.Pages;

public class ServiceProviders extends Pages{

	@Test 
	public void CreateNewServiceProvider() {
		
		ServiceProviderListPage.goTo();
		ServiceProviderListPage.clickNewServiceProvider();
		ServiceProviderEditPage.enterCompanyName();
		ServiceProviderEditPage.enterEmail();
		ServiceProviderEditPage.enterStreet();
		ServiceProviderEditPage.enterCity();
		ServiceProviderEditPage.enterZIP();
		ServiceProviderEditPage.enterCountry();
		ServiceProviderEditPage.selectStateByIndex(1);
		ServiceProviderEditPage.clickSave();
		Assert.assertEquals(true, ServiceProviderListPage.searchForText("Service Provider added successfully").isDisplayed());
	}
	  
	@BeforeClass
	@Parameters(value = { "URL", "Release" })
	public void beforeClass(String URL, String Release) {
		openUrl(URL);
		LoginPage.loginInto(); 
		setRelease(Release);
	}

	@AfterClass
	public void afterClass() {
		HomePage.SignOut();
	}

}
